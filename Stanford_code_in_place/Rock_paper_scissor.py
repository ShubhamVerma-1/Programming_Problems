import random


print('Winning rules of the game ROCK PAPER SCISSORS are:\n'
      + "Rock vs Paper -> Paper wins \n"
      + "Rock vs Scissors -> Rock wins \n"
      + "Paper vs Scissors -> Scissors wins \n")

# Mapping from number to choice name
choices = {1: 'Rock', 2: 'Paper', 3: 'Scissors'}

def play_round():
    while True:
        try:
            choice = int(input("\nEnter your choice \n1 - Rock \n2 - Paper \n3 - Scissors\nYour choice: "))
            if choice in choices:
                return choice
            else:
                print("Invalid input. Please enter 1, 2, or 3.")
        except ValueError:
            print("Invalid input. Please enter a number.")

def determine_winner(user_choice, comp_choice):
    if user_choice == comp_choice:
        return "DRAW"
    elif (user_choice == 1 and comp_choice == 3) or \
         (user_choice == 2 and comp_choice == 1) or \
         (user_choice == 3 and comp_choice == 2):
        return "USER"
    else:
        return "COMP"

while True:
    user_score = 0
    comp_score = 0
    rounds = 5

    print(f"\nStarting a new match: Best of {rounds} rounds!")

    for round_num in range(1, rounds + 1):
        print(f"\n--- Round {round_num} ---")
        user_choice = play_round()
        user_choice_name = choices[user_choice]

        comp_choice = random.randint(1, 3)
        comp_choice_name = choices[comp_choice]

        print(f"Your choice: {user_choice_name}")
        print(f"Computer choice: {comp_choice_name}")

        winner = determine_winner(user_choice, comp_choice)

        if winner == "DRAW":
            print("It's a tie this round!")
        elif winner == "USER":
            print("You win this round!")
            user_score += 1
        else:
            print("Computer wins this round!")
            comp_score += 1

        print(f"Current Score -> You: {user_score} | Computer: {comp_score}")

    # After all rounds, show final result and motivation
    print("\n--- Match Over ---")
    print(f"Final Score -> You: {user_score} | Computer: {comp_score}")

    if user_score > comp_score:
        print("🔥 Great job! You beat the computer! Keep it up!")
    elif user_score < comp_score:
        print("Don't worry! The computer won this time. Try again!")
    else:
        print("It's a draw overall! What a close match!")

    # Ask if user wants to play again
    play_again = input("\nDo you want to play another match? (Y/N): ").lower()

    while play_again != 'y' and play_again!= 'n':
        play_again = input("Wrong input!\nDo you want to play another match? (Y/N): ").lower()
    if play_again == 'n':
        print("Thanks for playing! Goodbye!")
        break
    elif play_again == 'y':
        print("Great decision, Let's go!")
