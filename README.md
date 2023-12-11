# About

This repository contains the instructions to collect the Gitome dataset available at https://zenodo.org/records/10311456


# Introduction 

This repository contains the source code implementation used to replicate the experimental results obtained in the submitted to the 21st International Conference on Mining Software Repositories (MSR204).

"Gitome: a curated dataset for README summarization"

authored by:

Claudio Di Sipio, Juri Di Rocco, Riccardo Rubei, Phuong Than Nguyen, and Davide Di Ruscio,

Università degli Studi dell'Aquila, Italy





## Data extraction pipline

To run the whole pipeline, please run the following command:

``` python main.py --path_unique "path/to/unique" --path_document "path/to/awesome" --topic "your_topic" --global_stats_file "path/to/global_stats" --global_file "path/to/global" --lang_dict_file "path/to/lang_dict" --langs_stats_file "path/to/langs_stats" --langs_stats_folder "path/to/langs_stats_folder" --langs_aggr_file "path/to/langs_aggr" --support "path/to/support" ```


where set as follows: 

- path_unique: Specifies the file path for the unique Github repositories
- path_document: Indicates the file path for the document repositories
- topic: It sets the topic of the document repositories, i.e., 'awesome-list' or 'documentation'.
- global_stats_file: The file containing global statistics.
- global_file: It contains the whole dataset stored on Zenodo archive.
- lang_dict_file: The name of the file for language/topic dictionary in the format (term/frequency).
- langs_stats_file: The file path for language/topic statistics.
- langs_stats_folder: The path folder containing language/topic statistics.
- langs_aggr_file: Points to the file for aggregated language data.
- support: The number of supporting repositories for topics/language statistics

It is worth noting that all the abovementioned parameters can be set from the ```config.py``` file. 












