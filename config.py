# local dirs


# github configs
TOKEN = "your github token go here"

# src path

PATH_JUPYTER = "repositories_lists/notebooks_repos.txt"
PATH_GITHUB_DOMAIN = "repositories_lists/github_domain_repos.txt"
PATH_AWESOME = "repositories_lists/awesome_lists_repos_all.txt"
PATH_GITSUM = "repositories_lists/gitsum_repos.txt"
PATH_PYTHON_SWH = "repositories_lists/swh_python_repo.txt"
PATH_DOCUMENT = "repositories_lists/documentation_repo.txt"

# dest_path
ROOT_DST = "output_datasets/"
AWESOME_GLOBAL_DST = "awesome_global.csv"
SWH_GLOBAL_DST = "swh_python_global.csv"
JUPYTER_GLOBAL_DST = "jupyter_global.csv"
GITHUB_DOMAIN_GLOBAL = "github_domain_global.csv"
UNIQUE_GLOBAL = "global.csv"

LIST_RM_ELEMENTS = ["repo_url","headings", "paragraphs", "quotes",
                    "fenced_code", "code", "html", "link",
                    "tot_code_blocks","tot_text_blocks","blank_lines"]


PATH_UNIQUE = "gitome_repos.txt"
GLOBAL_FILE = 'global.csv'

#stats_single_lang analysis

GLOBAL_STATS_FILE = 'df_stats.csv'
LANG_DICT_FILE = 'langs.csv'
TOPICS_DICT_FILE = 'topics.csv'

LANGS_STATS_FILE = 'lang_stats.csv'
TOPICS_STATS_FILE = 'topics_stats.csv'

LANGS_STATS_FOLDER = 'stats_single_lang/'
TOPICS_STATS_FOLDER = 'stats_single_topics/'

LANGS_AGGR_FILE = 'lang_aggr_stats.csv'
TOPICS_AGGR_FILE = 'topics_aggr_stats.csv'

SUPPORT = 50



# repo type
GITHUB = "https://github.com/"
TOPIC = "documentation"

METADATA = ["repo_url", "stars", "forks", "topics", "languages", "contributors", "num_topics", "readme_content", "about_content"]