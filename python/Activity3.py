# Activity 3

# Using Python:

# Make a two-player Rock-Paper-Scissors game.
# Remember the rules:
# Rock beats scissors
# Scissors beats paper
# Paper beats rock

Player1 = input("Player1 Choice:")
Player2 = input("Player2 Choice:")
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
    print("Draw")