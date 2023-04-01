import pandas as pd
import numpy as np
import re

# Datasets

data_detail = pd.read_csv(
    "datasets/outputDetailedSubdomainsDataOccurrence.csv")
data_detail.head()

data_summary = pd.read_csv("datasets/outputSummaryOutputData.csv")
data_summary.head()

# ### Limpando a Base de Dados

# Rename columns
data_detail = data_detail.rename(columns={
    'SubDominio(Oficial)': 'subDominio',
    'Unnamed: 2': 'feature a',
    'Unnamed: 3': 'feature b',
    'Unnamed: 4': 'feature c',
    'Unnamed: 5': 'feature d',
    'Unnamed: 6': 'feature e',
    'Unnamed: 7': 'feature f',
    'Unnamed: 8': 'feature g',
    'Unnamed: 9': 'feature h',
    'Unnamed: 10': 'feature i'})

# Create column to SmartCampus who doesn't exist
data_detail["feature j"] = np.nan

# Create a list with all subdominios
official_domain = ['SecurityPublic',
                   'HealthCare',
                   'IndependentLiving',
                   'Logistic',
                   'SmartHome',
                   'Agriculture',
                   'IndustrialProcesses',
                   'UrbanMobility',
                   'SmartGrid',
                   'SmartCampus']

# Give each row and takes the subdomain that doesn't look like it,
# then iterates by exchanging the missing values for the flatting subdomain filled with zero percent
for index, row in data_detail[["feature a", "feature b", "feature c", "feature d", "feature e",
                               "feature f", "feature g", "feature h", "feature i", "feature j"]].iterrows():
    domain_content = []
    for col in row:
        if not pd.isnull(col):
            domain_content.append(str(col).split(" ")[0])
    domain_out = [
        feature for feature in official_domain if feature not in domain_content]
    index_col = len(official_domain) - len(domain_out) + 2
    count_domain = 0
    for c in range(index_col, len(official_domain) + 2):
        data_detail.iloc[index, c] = domain_out[count_domain] + " (0%)"
        count_domain += 1

# To see the first ten rows
print(data_detail.head(10))

# Reshape the Dataset, put all subdomain cols in a single column named Value
data_melt = data_detail.melt(id_vars=["Dataset", "subDominio"],
                             var_name="Features",
                             value_name="Value")

# Get the classified subdomain name
data_melt["new_feature"] = data_melt["Value"].apply(
    lambda x: str(x).split(" ")[0])

# Rename the classified subdomain name with features names
data_melt["new_feature"] = data_melt["new_feature"].map({
    'SecurityPublic': 'feature_a', 'UrbanMobility': 'feature_b', 'SmartGrid': 'feature_c',
    'SmartHome': 'feature_d', 'Agriculture': 'feature_e', 'Logistic': 'feature_f',
    'HealthCare': 'feature_g', 'IndependentLiving': 'feature_h',
    'IndustrialProcesses': 'feature_i', 'SmartCampus': 'feature_j'
}).astype(str)

# Replace comma in percentage values by dot
data_melt["PercenteValues"] = data_melt["Value"].apply(
    lambda x: str(x).replace(",", "."))

# Get just the integer and decimal numbers and convert into float type
data_melt["PercenteValues"] = data_melt["PercenteValues"].apply(
    lambda x: re.findall(r'\d+\.\d+|\d+', str(x))[0]).astype(float)

# Get select colum and pivot features variables as columns
data_detail_new = data_melt[["Dataset", "subDominio", "new_feature", "PercenteValues"]].pivot(
    index=["Dataset", "subDominio"], columns="new_feature", values="PercenteValues").reset_index()

# Save dataset into csv file
#data_detail_new.to_csv("datasets/outputDetailedSubdomainsDataOccurrence_Reshape_Percentagens_Wesley.csv", index = False)

# To see the first five rows
print(data_detail_new.head())
