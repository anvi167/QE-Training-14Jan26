import pandas
dataframe = pandas.read_csv('employees.csv')
print(dataframe)
#Getting Specific Data
print(dataframe["Name"][2])

#Writing CSV Data(it means new csv file created by itself you check on side)
# import pandas
import pandas

# Structure our data as a dictionary
data = {
  "Vehicle Type": ["Car", "Car", "Bike"],
  "Manufacturer": ["Maruti", "Toyota", "Royal Enfield"],
  "Model": ["Swift", "Corolla", "Thunderbird"]
}

# Create a new DataFrame using the data
dataframe = pandas.DataFrame(data)

# Write the data to a csv file
dataframe.to_csv("vehicles.csv")