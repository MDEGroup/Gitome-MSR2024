# About

This repository contains the instructions to collect the Gitome dataset available at https://zenodo.org/records/10311456


# Introduction 

This repository contains the source code implementation used to replicate the experimental results obtained in the submitted study to the 21st International Conference on Mining Software Repositories (MSR204).

"Gitome: a curated dataset for README summarization"

authored by:

Claudio Di Sipio, Juri Di Rocco, Riccardo Rubei, Phuong Than Nguyen, and Davide Di Ruscio,

Università degli Studi dell'Aquila, Italy





# Data extraction pipeline

To run the whole pipeline, please run the following command:

``` python main.py --path_unique "path/to/unique" --path_document "path/to/awesome" --topic "your_topic" --global_stats_file "path/to/global_stats" --global_file "path/to/global" --lang_dict_file "path/to/lang_dict" --langs_stats_file "path/to/langs_stats" --langs_stats_folder "path/to/langs_stats_folder" --langs_aggr_file "path/to/langs_aggr" --support "path/to/support" ```


The sequence of functions is the following: 

1. collecting_existing_repo(args.path_unique)
2. mu.get_document_repo(args.path_awesome, args.topic)
3. data_preprocessing(args.global_stats_file, args.global_file)
4. extracting_summarization_data(args.global_file)
5. compute_domain_stats(args.lang_dict_file, args.global_file, args.langs_stats_file, args.langs_stats_folder)
6. du.rm_structural_analysis('avg_code', 'avg_text', 'avg_tot', args.langs_aggr_file, args.support)




with the following list of paramenters: 

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


Alternatively, you can run each function separately to collect individual files. 

## Collecting data from existing datasets

This function collects data from the existing dataset shown in the paper 

``` collecting_existing_repo(args.path_unique) ```

where *path_unique* parameter identifies the unique list of repo, i.e., the ```gitome_repos.txt ```

## Collecting document repositories 

This function collects data from the Github URLs of the considered document repositories according to teh featured topics awesome-lists and description 

``` mu.get_document_repo(args.path_document, args.topic) ```

where *path_document* is the path of the output file with the list of Github repositories and *topic* of the selected featured topic. 

Note that all the GitHub mining-related activity needs to be authorized by setting the parameter **TOKEN** in the ``` config.py``` file.




## Extracting summarization data

Once the data have been mined from GitHub, the process to extract the summarization data can be run using 

``` extracting_summarization_data(args.global_file) ```

where *global_file* is the CSV file obtained by the abovementioned scripts. This process will also produce ```df_stats.csv``` files with the statistics concerning the README files structure for the whole dataset. 



## Data cleaning 

Before extracting the summarization data, we preprocess the collected data using the following function:


``` data_preprocessing(args.global_stats_file, args.global_file)```

In particular, this file will merge the ```df_stats.csv``` file and the ```global.csv``` file for statistical purposes.


## README analysis

To replicate the data shown in the paper concerning the application domains, we used the following function:


``` du.rm_structural_analysis('avg_code', 'avg_text', 'avg_tot', args.langs_aggr_file, args.support)```


In particular, this function will filter the application domains represented by the language and topics according to the support value. 
























