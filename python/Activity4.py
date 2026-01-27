# Rock-Paper-Scissors-2

# Activity 4

# Using Loops:

# Enhance the previously written Rock-Paper-Scissors code so that it asks the user if they want to play another round.
# If they say 'Yes', the game should begin again.
# If they say 'No', the game should exit.
while True:
    Player1 = input("Player1 Choice:").lower()
    Player2 = input("Player2 Choice:").lower()
    print("Player1 Choice: " + Player1)
    print("Player2 Choice: " + Player2)
    if (Player1 == "Rock" and Player2 == "scissors"):
        print("Player1 Won the Game")
        if (Player2 == "Rock" and Player1 == "scissors"):
            print("Player2 Won the Game")
    elif (Player1 == "scissors" and Player2 == "paper"):
        print("Player1 Won the Game")
        if (Player2 == "scissors" and Player1 == "paper"):
            print("Player2 Won the Game")
    elif (Player1 == "paper" and Player2 == "rock"):
        print("Player1 Won the Game")
        if (Player2 == "paper" and Player1 == "rock"):
            print("Player2 Won the Game")
    else:
        print("Soory")
    repeat = input("Do you want to play a game again Yes/No: ").lower()
    if repeat == "yes":
        pass
    elif repeat == "no":
        raise SystemExit
    else:
        raise SystemExit
