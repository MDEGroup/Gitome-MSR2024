import pandas as pd
from sklearn.model_selection import train_test_split
import os

import marko
import config as cf
import csv

import matplotlib.pyplot as plt
import seaborn as sns
from wordcloud import WordCloud




def get_already_downloaded(dump_path):
    if os.path.exists(os.path.join(cf.ROOT_DST, dump_path)):
        df_dump = pd.read_csv(os.path.join(cf.ROOT_DST, dump_path))
        if df_dump.empty:
            print ("no repo yet")
            return None
        else:
            return df_dump['repo_url'].values




def split_csv(input_file_path, lines_per_file=500):
    """
    Split a CSV file into multiple smaller files with the same header.

    :param input_file_path: str, path to the input CSV file.
    :param lines_per_file: int, number of lines per smaller file including the header.
    """

    with open(input_file_path, 'r', encoding='utf8', errors='ignore') as csv_source:
        reader = csv.reader(csv_source)
        headers = next(reader)

        file_num = 1
        current_line = 0
        current_file = None
        writer = None

        for row in reader:
            if current_line % lines_per_file == 0:
                if current_file:
                    current_file.close()

                output_filename = f"output_github_domain_{file_num}.csv"
                current_file = open(output_filename, 'w', newline='', encoding='utf8', errors='ignore')
                writer = csv.writer(current_file)
                writer.writerow(headers)
                file_num += 1

            writer.writerow(row)
            current_line += 1

        if current_file:
            current_file.close()


# Example usage:
# split_csv("path_to_large_csv.csv")



def extract_repo_url(csv_file, column_name, txt_file):
    """
    Reads a specified column from a CSV file and writes the values to a text file.

    Args:
    csv_file (str): Path to the CSV file.
    column_name (str): Name of the column to extract.
    txt_file (str): Path to the text file where the column values will be written.
    """

    # Read the CSV file
    df = pd.read_csv(csv_file)

    # Extract the specified column
    if column_name in df.columns:
        column_data = df[column_name]

        # Write the column data to a text file
        with open(txt_file, 'w') as file:
            for value in column_data:
                file.write(f"{cf.GITHUB}{value} \n")
    else:
        print(f"Column '{column_name}' not found in the CSV file.")

# Example usage
# extract_column_to_txt('path_to_csv.csv', 'column_name', 'output.txt')


def preprocess_column(df, column_name):
    # Using regex to replace newline characters and other non-alphanumeric characters except spaces
    df[column_name] = df[column_name].replace(to_replace=[r'\n'], value=[''], regex=True)
    return df


def replace_nan_with_string(df, column_name, replace_with="Missing"):
    df[column_name].fillna(replace_with, inplace=True)
    return df

def has_nan(df, column_name):
    return df[column_name].isnull().any()


def remove_duplicates(csv_file_path, output_file_path=None):
    # Read the CSV file into a DataFrame
    df = pd.read_csv(csv_file_path)

    # Remove duplicate rows
    duplicates = df[df.duplicated()]
    print("found ", duplicates)
    cleaned_df = df.drop_duplicates()

    # Optionally, write the cleaned DataFrame to a new CSV file
    if output_file_path:
        cleaned_df.to_csv(output_file_path, index=False)
    return cleaned_df


def csv_intersection(file1, file2, output_file):
    # Read the CSV files
    df1 = pd.read_csv(file1)
    df2 = pd.read_csv(file2)

    # Find the intersection
    intersection = pd.merge(df1, df2, how='inner')

    # Write the intersection to a new CSV file
    intersection.to_csv(output_file, index=False)

def remove_duplicated_repo(list_files, output_file):
    # Read the contents of the first file
    combined_contents = []
    for file in os.listdir(list_files):
        with open(list_files+file, 'r') as f:
            combined_contents += f.readlines()
    # Count duplicates
    duplicates_count = len(combined_contents) - len(set(combined_contents))
    print(duplicates_count)
    # Remove duplicates
    unique_contents = set(combined_contents)

    # Write the combined contents to the output file
    with open(output_file, 'w') as f:
        for line in unique_contents:
            f.write(line)



def append_substring_to_lines(input_file, output_file, substring):
    # Read the contents of the input file
    with open(input_file, 'r') as f:
        lines = f.readlines()

    # Append the substring to each line
    modified_lines = [substring + line.strip() + '\n' for line in lines]

    # Write the modified lines to the output file
    with open(output_file, 'w') as f:
        f.writelines(modified_lines)



def merge_dataframes(df1, df2, common_column):
    merged_df = pd.merge(df1, df2, on=common_column)
    return merged_df




def parse_rm(readme_path, url, output_csv):
    data = {}


    mk = marko.Markdown()
    with open(readme_path, "r",  encoding='utf-8') as reader:
        doc = mk.parse(reader.read())

    # Extract headings and code cells
        headings = [x for x in doc.children if isinstance(x, marko.block.Heading)]
        paragraphs = [x for x in doc.children if isinstance(x, marko.block.Paragraph)]
        quotes = [x for x in doc.children if isinstance(x, marko.block.Quote)]
        fenced_blocks = [x for x in doc.children if isinstance(x, marko.block.FencedCode)]
        code_blocks = [x for x in doc.children if isinstance(x, marko.block.CodeBlock)]
        html_blocks = [x for x in doc.children if isinstance(x, marko.block.HTMLBlock)]
        link_blocks = [x for x in doc.children if isinstance(x, marko.block.LinkRefDef)]
        blank_lines = [x for x in doc.children if isinstance(x, marko.block.BlankLine)]

        tot_code_blocks = len(code_blocks) + len(fenced_blocks) + len(link_blocks) + len(html_blocks)
        tot_text_blocks = len(headings) + len(paragraphs) + len(quotes)
        print(tot_code_blocks, tot_text_blocks)

        # "repo_url", "headings", "paragraphs", "quotes",
        # "fenced_code", "code", "html", "link",
        # "tot_code_blocks", "tot_text_blocks", "blank_lines"

        data.update({"repo_url": url,
                     "headings": len(headings),
                     "paragraphs": len(paragraphs),
                     "quotes": len(quotes),
                     "fenced_code": len(fenced_blocks),
                     "code": len(code_blocks),
                     "html": len(html_blocks),
                     "link": len(link_blocks),
                     "tot_code_blocks": tot_code_blocks,
                     "tot_text_blocks" : tot_text_blocks,
                    "blank_lines" : len(blank_lines)
                     })
        df_gh = pd.DataFrame([data])
        df_gh.to_csv(output_csv, mode='a', header=False, index=False)

    # Save stats_single_lang to CSV



    # with open(output_csv, "a", newline="") as csvfile:
    #     csvwriter = csv.writer(csvfile)
    #     csvwriter.writerow(cf.LIST_RM_ELEMENTS)
    #     csvwriter.writerow([url,len(headings),len(paragraphs), len(quotes),
    #                         len(fenced_blocks), len(code_blocks),len(html_blocks),
    #                         len(link_blocks),  tot_code_blocks, tot_text_blocks, len(blank_lines)])

    # Return stats_single_lang if needed
    return




def split_datasets(global_csv, out_code, out_text):
    df_global = pd.read_csv(global_csv)
    df_stats = df_global[['repo_url']].copy()

    # Initialize counters for each element

    code_df = df_global[['repo_url', 'about_content']].copy()
    text_df = df_global[['repo_url', 'about_content']].copy()

    for idx, row in df_global.iterrows():
        parsed_rm = marko.parse(row['readme_content'])
        code_counters = {elem: 0 for elem in ['Image', 'Link', 'InLineHTML', 'Autolink', 'CodeSpan']}
        text_counters = {elem: 0 for elem in ['Emphasis', 'StrongEmphasis', 'RawText']}

        list_code_cells, list_text_cells = [], []

        for paragraph in parsed_rm.children:
            for elem in paragraph.children:
                elem_type = str(type(elem))

                # Check and count code elements
                if any(code_elem in elem_type for code_elem in code_counters.keys()):
                    list_code_cells.append(str(elem.children if 'CodeSpan' in elem_type else elem.dest))
                    code_counters[[key for key in code_counters if key in elem_type][0]] += 1

                # Check and count text elements
                if any(text_elem in elem_type for text_elem in text_counters.keys()):
                    list_text_cells.append(str(elem.children[
                                                   0].children if 'StrongEmphasis' in elem_type or 'Emphasis' in elem_type else elem.children))
                    text_counters[[key for key in text_counters if key in elem_type][0]] += 1

            code_df.at[idx, 'readme_content'] = ''.join(list_code_cells)
            text_df.at[idx, 'readme_content'] = ''.join(list_text_cells)

        # Add counters to the stats_single_lang DataFrame
        for key, value in {**code_counters, **text_counters}.items():
            df_stats.at[idx, key] = value

    # Export dataframes to CSV
    df_stats.to_csv(cf.GLOBAL_STATS_FILE, index=False)
    code_df.to_csv(out_code, index=False)
    text_df.to_csv(out_text, index=False)

    # Optional: Display the counts
    print("Element counts per URL:")
    print(df_stats)





def read_data(csv_file):

    df_readme=pd.read_csv(csv_file, sep=',')
    df_readme.dropna(inplace=True)
    dict_readme = {}

    for index, row in df_readme.iterrows():
        if row['readme'] :
            cat_list = []
            for key, value in row[2:-1].to_dict().items():

                if value == 1 and key not in cat_list:
                    cat_list.append(key)

            dict_readme.update({row['readme']: cat_list})

    df_new = pd.Series(dict_readme)
    training, testing = [i.to_dict() for i in train_test_split(df_new, train_size=0.9)]

    return training, testing


def merge_csv(file1, file2, output_file):
    """
    Merge two CSV files with the same structure.

    Parameters:
    - file1 (str): Path to the first CSV file.
    - file2 (str): Path to the second CSV file.
    - output_file (str): Path to save the merged CSV file.
    """
    # Read the CSV files into DataFrames
    df1 = pd.read_csv(file1)
    df2 = pd.read_csv(file2)

    # Concatenate the DataFrames along the rows
    merged_df = pd.concat([df1, df2], ignore_index=True)

    # Save the merged DataFrame to a new CSV file
    merged_df.to_csv(output_file, index=False)

def split_txt_file(file_path, lines_per_file=500):
    """
    Split a txt file into smaller txt files. Each smaller file contains up to a specified number of lines.

    Args:
    - file_path (str): Path to the input txt file.
    - lines_per_file (int, optional): Number of lines each smaller file should contain. Defaults to 500.

    Returns:
    - list: List of paths to the smaller txt files.
    """
    with open(file_path, 'r', encoding='utf-8') as file:
        lines = file.readlines()

    total_lines = len(lines)
    number_of_files = total_lines // lines_per_file + (1 if total_lines % lines_per_file else 0)
    output_files = []

    for i in range(number_of_files):
        start_index = i * lines_per_file
        end_index = start_index + lines_per_file
        output_file_path = f"{file_path}_part_{i + 1}.txt"
        with open(output_file_path, 'w', encoding='utf-8') as output_file:
            output_file.writelines(lines[start_index:end_index])
        output_files.append(output_file_path)

    return output_files


def remove_nan_values(in_csv, out_csv):
    df = pd.read_csv(in_csv)
    df_new = df.dropna()
    df_new.to_csv(out_csv, index=False)


def create_path_if_not(path):
    if not os.path.exists(path):
        os.makedirs(path)


def count_substring_in_columns(dataframe, substring):
    counts = {}
    for column in dataframe.columns:
        # Count occurrences of the substring in each column
        counts[column] = dataframe[column].apply(lambda x: str(x).count(substring)).sum()
    return counts

def remove_missing_rm(dataframe, substring):
    initial_counts = {column: 0 for column in dataframe.columns}
    final_counts = {column: 0 for column in dataframe.columns}
    list_columns = ['readme_content', 'about_content']
    # Count occurrences before removal
    # for column in list_columns:
    #     initial_counts[column] = dataframe[column].apply(lambda x: str(x).count(substring)).sum()
    # Remove rows containing the substring
    contains_substring = dataframe['readme_content'].astype(str).str.contains(substring)
    #final_counts[column] = dataframe[contains_substring][column].apply(lambda x: str(x).count(substring)).sum()
    dataframe = dataframe[~contains_substring]
    dataframe.to_csv('global.csv', index=False)
    return



def language_stats(df_data):
    #df_data = pd.read_csv(dataset)
    list_lang = []
    list_topics = []
    for topic, lang in zip(df_data['topics'].astype(str), df_data['languages'].astype(str)):
        langs = lang.split('#')
        topics = topic.split('#')
        for l in langs:
            list_lang.append(l)
        for t in topics:
            list_topics.append(t)

    count_occurrences(list_topics, 'topics.csv')
    count_occurrences(list_lang, 'langs.csv')





def count_occurrences(elements, filename):
    # Counting the occurrences of each element
    frequency = {}
    for element in elements:
        frequency[element] = frequency.get(element, 0) + 1

    # Sorting the dictionary by frequency
    sorted_frequency = dict(sorted(frequency.items(), key=lambda item: item[1], reverse=True))

    # Writing to CSV file
    with open(filename, 'w', newline='', encoding='utf-8') as file:
        writer = csv.writer(file)
        writer.writerow(['Element', 'Frequency'])  # Writing headers
        for key, value in sorted_frequency.items():
            writer.writerow([key, value])

    print(f"Data saved to {filename}")





def plot_stats():
    data = {
        'Image': 14858.0,
        'Link': 322265.0,
        'InLineHTML': 0.0,
        'Autolink': 0.0,
        'CodeSpan': 189562.0,
        'Emphasis': 62198.0,
        'StrongEmphasis': 0.0,
        'RawText': 780430.0
    }

    # Creating a bar plot
    plt.figure(figsize=(10,6))
    plt.bar(data.keys(), data.values(), color='darkred')

    plt.xlabel('Cells type')
    plt.ylabel('NUmber of cells')

    plt.xticks(rotation=45)
    plt.show()

def compute_rm_stats(df_total, tot):
    sub_set = ['Image','Link', 'InLineHTML', 'Autolink', 'CodeSpan', 'Emphasis', 'StrongEmphasis', 'RawText']

    initial_counts = {column: 0.0 for column in sub_set}

    for column in sub_set:
        initial_counts[column] = df_total[column].sum()
    tot_code = 0
    tot_text = 0

    for key,value in initial_counts.items():
        if key == 'Image' or key == 'Link' or key == 'InLineHTML' or key == 'Autolink' or key == 'CodeSpan':
            tot_code += value
        if key == 'Emphasis' or key == 'StrongEmphasis' or key == 'RawText':
            tot_text += value

    avg_code = tot_code / tot
    avg_text = tot_text / tot
    tot = tot_text + tot_code
    print(int(avg_code))
    #print (tot_text + tot_code)
    return avg_code, avg_text, tot








# Given data

data = {
    'stars': 9885.334775710371,
    'forks': 1852.6166161834703,
    'contributors': 90.81739506707054,
    'num_topics': 5.5822876099812495
}

def plot_bar_chart(data, title, categories, title_fontsize=16, label_fontsize=11, tick_fontsize=24):
    """
    Plots a bar chart for the given data.

    :param data: Dictionary with categories as keys and values to plot.
    :param title: Title of the bar chart.
    :param categories: List of categories to include in the plot.
    :param title_fontsize: Font size for the chart title.
    :param label_fontsize: Font size for the x and y labels.
    :param tick_fontsize: Font size for the tick labels.
    """
    # Extracting values and labels for the plot
    values = [data[cat] for cat in categories]
    labels = categories

    # Plotting
    plt.figure(figsize=(9, 6))
    plt.bar(labels, values, color=['darkblue', 'darkred', 'red', 'purple'])
    #plt.title(title, fontsize=title_fontsize)
    #plt.ylabel('Avg Values', fontsize=label_fontsize)
    plt.xticks(fontsize=tick_fontsize)
    plt.yticks(fontsize=tick_fontsize)

    for i, value in enumerate(values):
        plt.text(i, value, '', ha='center', va='bottom', fontsize=label_fontsize)

    plt.show()





def draw_word_cloud():
    # Data provided
    data = {
        "python": 655,
        "javascript": 581,
        "hacktoberfest": 530,
        "machine-learning": 324,
        "deep-learning": 284,
        "react": 233,
        "android": 217,
        "java": 216,
        "php": 189,
        "go": 186,
        "awesome": 184,
        "ios": 177,
        "awesome-list": 175,
        "typescript": 174,
        "nodejs": 171,
        "golang": 153,
        "linux": 152,
        "docker": 149
    }

    data_2 = {
        "Shell": 2957,
        "JavaScript": 2807,
        "HTML": 2457,
        "Python": 2428,
        "CSS": 1824,
        "Makefile": 1430,
        "C": 1228,
        "Dockerfile": 1228,
        "Ruby": 915,
        "Jupyter Notebook": 826,
        "TypeScript": 813,
        "C++": 771,
        "Java": 752,
        "Batchfile": 608,
        "Go": 519,
        "Objective-C": 507,
        "SCSS": 437,
        "PHP": 424,
        "CMake": 410
    }

    # Create a WordCloud object
    wordcloud = WordCloud(width=800, height=800,
                          background_color='white',
                          min_font_size=10).generate_from_frequencies(data_2)

    # Plot the WordCloud image
    plt.figure(figsize=(10, 10), facecolor=None)
    plt.imshow(wordcloud)
    plt.axis("off")
    plt.tight_layout(pad=0)

    plt.show()

    plt.savefig('lang_cloud.png')

def extract_domain_repo(domain,set,df_global, out_file):
    df_res = pd.DataFrame(columns=df_global.columns)
    for idx, row in df_global.iterrows():
        langs = row[set].split('#')
        for lang in langs:
            if domain in lang:
                df_res = pd.concat([df_res, pd.DataFrame([row])], ignore_index=True)

    df_res.to_csv(out_file, index=False)



def process_url(url_list):
    with open('spring-repo.txt', 'w', encoding='utf-8', errors='ignore') as res:
        for url in set(url_list):
            preprocessed = str(url).replace('/Volumes/Elements/READMEDOCS/tempo/', '').replace('__','/')
            preprocessed = cf.GITHUB + preprocessed

            res.write(f'{preprocessed}\n')




def add_average_column(df, col1, col2, new_col_name, out_file, threshold):
    df = pd.read_csv(cf.LANGS_STATS_FILE, names=['domain', 'support', 'avg_code', 'avg_text', 'tot'])
    if col1 not in df or col2 not in df:
        raise ValueError("One or both specified columns do not exist in the DataFrame.")

    # Calculate the average and store it in the new column
    df[new_col_name] = df[[col1, col2]].sum(axis=1)
    # Filter out rows where the average is below the threshold
    df = df[df['support'] >= threshold]
    # Sort the DataFrame
    df.sort_values(by=new_col_name, ascending=False, inplace=True)
    # Write the DataFrame to a CSV file
    df.to_csv(out_file, index=False)

    return df



# # Plotting the first bar chart for stars and forks
# plot_bar_chart(data, 'Avg. stars and forks', ['stars', 'forks'])
#
# # Plotting the second bar chart for contributors and num_topics
# plot_bar_chart(data, 'Bar Chart of Contributors and Number of Topics',  ['contributors', 'num_topics'])


