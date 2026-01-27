example_dict =	{
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
print(example_dict)
x = example_dict["model"]
print(x) 

#to get only values
example_dict =	{
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
for x in example_dict:
  print(example_dict[x])

#OR

example_dict =	{
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
for x in example_dict.values():
  print(x)

  #to get both keys and values
  example_dict =	{
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
for x, y in example_dict.items():
  print(x, y)