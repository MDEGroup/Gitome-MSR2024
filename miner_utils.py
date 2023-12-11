import config as cf
from github import Github
import time
import pandas as pd
import datetime
import data_utils as du
import subprocess
import os
import sys
from send2trash import send2trash


def download_repo(dataset, out_path):
    if not os.path.exists(out_path):
        pd.DataFrame(columns=cf.LIST_RM_ELEMENTS).to_csv(out_path, index=False)
    dump_repo = du.get_already_downloaded(out_path)
    df = pd.read_csv(dataset)
    for url in df['repo_url'].values:
        if dump_repo is not None and str(url).replace('.git','') in dump_repo:
            print("Already downloaded")
        else:
            local_path = 'repo'  # Local directory name for the cloned repository
            try:
                subprocess.run(['git', 'clone', url, local_path], check=True)
                # Construct the path to the README.MD file
                readme_path = os.path.join(local_path, 'README.MD')
                # Add the repository directory to the system path
                sys.path.append(local_path)

                if os.path.exists(readme_path):
                    du.parse_rm(readme_path, url, cf.ROOT_DST + out_path)
                send2trash(local_path)
            except:
                continue


def format_url_gh(url):
    return str(url).replace(cf.GITHUB, "")


def get_document_repo(out_file, topic):
    with open(out_file, 'a', encoding='utf8', errors='ignore') as res:
        g = Github(cf.TOKEN)
        #print('searching to ' + time_min + ' from ' + time_max)

        repos = g.search_repositories(query=f'is:featured {topic} in:readme stars:>10000 forks:>1000')
        time.sleep(10)
        if repos.totalCount > 0:
            print('write repos n:', repos.totalCount)
            for repo in repos:
                print('writing repo', repo.html_url)
                res.write(str(repo.html_url)+'\n')
            time.sleep(5)
        else:
            print('no repo in time window')


def fetch_github_details_to_csv(list_repo, out_path):
    # Authenticating with GitHub
    du.create_path_if_not(cf.ROOT_DST)
    g = Github(cf.TOKEN)
    row_list = []
    dump_repo = du.get_already_downloaded(out_path)
    csv_file_path = os.path.join(cf.ROOT_DST, out_path)

    if not os.path.exists(csv_file_path):

        pd.DataFrame(columns=["repo_url", "stars", "forks" , "contributors", "languages", "readme_content",
                              "about_content", "topics", "num_topics",
                            ]).to_csv(csv_file_path, index=False)

    for repo_full_name in list_repo:
        data = {}

        if dump_repo is not None and str(repo_full_name).strip() in dump_repo:
            print("Already processed")
        else:
            repo_prep = format_url_gh(repo_full_name)

            try:
                repo = g.get_repo(repo_prep.strip())
                print("writing repo", repo.name)
                #time.sleep(20)
            except:
                print("repo not found")
                continue
            # Getting the metadata

            print("fetching readme")
            try:
                readme_file = repo.get_readme()
                readme_content = readme_file.decoded_content
                print("fetching languages")
                list_languages = list(repo.get_languages().keys())
                if len(list_languages) > 0:
                    languages = '#'.join(list_languages)
                else:
                    languages = "Missing"
                print("fetching topics")
                list_topics, num_topics = process_paginated_list(repo.get_topics())
                if num_topics > 0:
                    topics_string = '#'.join(list_topics)
                else:
                    topics_string = "Missing"

                num_stars = repo.stargazers_count
                print("fetching forks")

                num_forks = repo.forks_count

                print("fetching contributors")
                list_contributors, num_contributors = process_paginated_list(repo.get_contributors())

                time.sleep(5)
                about_content = repo.description or "Missing"
                # Creating DataFrame and saving as CSV
                data.update({"repo_url": repo.html_url,
                             "stars": num_stars,
                             "forks": num_forks,
                             "topics": topics_string,
                             "languages": languages,
                             "contributors": num_contributors,
                             "num_topics": num_topics,
                             "readme_content": readme_content,
                             "about_content": about_content
                             })
                df_gh = pd.DataFrame([data])
                df_gh.to_csv(csv_file_path, mode='a', header=False, index=False)
            except:
                continue





def generate_date_intervals(years, interval_months):
    """
    Generate a list of date tuples covering intervals over a number of years.

    Args:
    - years (int, optional): Number of years to cover. Defaults to 10.
    - interval_months (int, optional): Number of months per interval. Defaults to 6.

    Returns:
    - list: List of date tuples in the format (start_date, end_date) where each date is a string in the format AAAA-MM-DD.
    """



    # convert from string format to datetime format
    #end_date = datetime.date(2013,1,1)
    end_date = datetime.date.today()
    start_year = end_date.year - years

    current_start_date = datetime.date(start_year, 1, 1)
    intervals = []

    while current_start_date <= end_date:
        try:
            current_end_date = current_start_date.replace(
                month=current_start_date.month + interval_months) - datetime.timedelta(days=1)
        except ValueError:
            # Handles the case when the current month + interval_months > 12
            year_adjustment = (current_start_date.month + interval_months) // 12
            month_adjustment = (current_start_date.month + interval_months) % 12
            current_end_date = current_start_date.replace(year=current_start_date.year + year_adjustment,
                                                          month=month_adjustment) - datetime.timedelta(days=1)

        intervals.append((current_start_date.strftime("%Y-%m-%d"), current_end_date.strftime("%Y-%m-%d")))

        try:
            current_start_date = current_end_date.replace(day=1, month=current_end_date.month + 1)
        except ValueError:
            current_start_date = current_end_date.replace(day=1, year=current_end_date.year + 1, month=1)

    return intervals


def process_paginated_list(paginated_list):
    list_items = []
    length = 0
    if paginated_list:
        list_items = [item for item in paginated_list]
        length = len(list_items)
    return list_items, length

