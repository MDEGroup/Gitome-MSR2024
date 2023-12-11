import pandas as pd
import miner_utils as mu
import config as cf
import data_utils as du

import argparse

def collecting_existing_repo(repo_list):
    file = open(repo_list, 'r')
    repo_list = file.readlines()
    mu.fetch_github_details_to_csv(repo_list, cf.UNIQUE_GLOBAL)



def extracting_summarization_data(dataset):
    du.create_path_if_not(cf.ROOT_DST)
    du.split_datasets(global_csv=dataset, out_code=cf.ROOT_DST+'code.csv', out_text=cf.ROOT_DST+'text.csv')


def remove_duplicates(global_stats,out_csv):
    df_stats= pd.read_csv(global_stats)
    du.create_path_if_not(cf.ROOT_DST)
    df_global = pd.read_csv(cf.ROOT_DST + cf.UNIQUE_GLOBAL)
    print(df_global.shape, df_stats.shape)
    merged_dataframe = du.merge_dataframes(df_stats, df_global, 'repo_url')
    merged_dataframe.to_csv(out_csv, index=False)

def compute_domain_stats(input_data, path_global_csv, stats_file, out_folder):
    du.create_path_if_not(out_folder)
    df_data = pd.read_csv(path_global_csv)
    df_domain = pd.read_csv(input_data)
    with open(stats_file, 'w', encoding='utf-8', errors='ignore') as res:
        for dom, count in zip(df_domain['Element'],df_domain['Frequency']):
            try:
                out_file = out_folder + dom + '.csv'
                du.extract_domain_repo(dom,'topics',df_data, out_file)
                df_res = pd.read_csv(out_file)
                print('stats_single_lang for', dom)
                code, text, tot = du.compute_rm_stats(df_res, tot=count)
                res.write(f"{dom},{count},{code},{text},{tot}\n")
            except:
                continue


# if __name__ == '__main__':
#
#     collecting_existing_repo(cf.PATH_UNIQUE)
#     mu.get_document_repo(cf.PATH_AWESOME, cf.TOPIC)
#     remove_duplicates(cf.GLOBAL_STATS_FILE, cf.GLOBAL_FILE)
#     extracting_summarization_data(cf.GLOBAL_FILE)
#     compute_domain_stats(cf.LANG_DICT_FILE, cf.GLOBAL_FILE, cf.LANGS_STATS_FILE,cf.LANGS_STATS_FOLDER)
#     du.add_average_column(cf.LANGS_STATS_FILE, 'avg_code', 'avg_text', 'avg_tot', cf.LANGS_AGGR_FILE, cf.SUPPORT)


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description='Process some files.')
    parser.add_argument('--path_unique', type=str, help='Path to unique repo')
    parser.add_argument('--path_awesome', type=str, help='Path to awesome repo')
    parser.add_argument('--topic', type=str, help='Topic for the document repo')
    parser.add_argument('--global_stats_file', type=str, help='Global stats file path')
    parser.add_argument('--global_file', type=str, help='Global file path')
    parser.add_argument('--lang_dict_file', type=str, help='Language dictionary file path')
    parser.add_argument('--langs_stats_file', type=str, help='Languages stats file path')
    parser.add_argument('--langs_stats_folder', type=str, help='Languages stats folder path')
    parser.add_argument('--langs_aggr_file', type=str, help='Languages aggregate file path')
    parser.add_argument('--support', type=str, help='Support file path')

    args = parser.parse_args()

    collecting_existing_repo(args.path_unique)
    mu.get_document_repo(args.path_awesome, args.topic)
    remove_duplicates(args.global_stats_file, args.global_file)
    extracting_summarization_data(args.global_file)
    compute_domain_stats(args.lang_dict_file, args.global_file, args.langs_stats_file, args.langs_stats_folder)
    du.add_average_column(args.langs_stats_file, 'avg_code', 'avg_text', 'avg_tot', args.langs_aggr_file, args.support)














