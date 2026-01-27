def my_function():
  print("Hello from a function")
  
my_function() # Output: Hello from a function


def my_function(*pets):
  print("The youngest pet is " + pets[1])

my_function("Timmy", "Chippy") 

def my_country(country = "India"):
  print("I am from " + country)

my_country("Sweden")
my_country("Japan")
my_country()