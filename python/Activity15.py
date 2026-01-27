# Activity 15
# Handling Errors

# Write a Python program that throws a NameError.

# Handle the error so it doesn't halt execution.

# try:
#     print(x)
# except NameError:
#     print("x hasn't been defined yet.")


def trigger_name_error():
    try:
        print(undefined_variable)  # This variable is not defined → NameError
    except NameError as e:
        print("Handled NameError inside method:", e)

def main():
    trigger_name_error()
    print("Program continues after method execution.")

main()