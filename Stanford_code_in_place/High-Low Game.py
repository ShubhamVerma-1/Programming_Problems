# The game is called High-Low and the way it's played goes as follows:
# 1.Two numbers are generated from 1 to 100 (inclusive on both ends): one for you and one for a computer, who will be your opponent. You get to see your number, but not the computer's!
# 2.You make a guess, saying your number is either higher than or lower than the computer's number
# 3.If your guess matches the truth (ex. you guess your number is higher, and then your number is actually higher than the computer's), you get a point!
# 4.These steps make up one round of the game. The game is over after all rounds have been played

import random

NUM_ROUNDS = 5

def main():
    print("Welcome to the High-Low Game!")
    print('--------------------------------')
    user_score = 0
    
    for i in range(1,6):
        print(f"Round {i}")
        computers_value = random.randint(1,100)
        user_value= random.randint(1,100)
        print("Your number is",user_value)
        user_choice=input("Do you think your number is higher or lower than the computer's?: ")
        user_score = game(user_choice,user_value,computers_value,user_score)
        print("")                
    print("Thanks for playing!")
    end_message(user_score)
    
def game(user_choice,user_value,computers_value,user_score):
    if user_choice.lower() == "higher":
            if (user_value > computers_value):
                user_score = user_score + 1
                print("You were right! The computer's number was",computers_value)
                print("Your score is now",user_score)
            elif (user_value < computers_value):
                print("Aww, that's incorrect. The computer's number was",computers_value)
                print("Your score is now",user_score)

    elif user_choice.lower() == "lower":
            if (user_value < computers_value):
                user_score = user_score + 1
                print("You were right! The computer's number was",computers_value)
                print("Your score is now",user_score)
            elif (user_value > computers_value):
                print("Aww, that's incorrect. The computer's number was",computers_value)
                print("Your score is now",user_score)

    else: #making sure that the user only entered the desired input
        while user_choice.lower() != "higher" and user_choice.lower() != "lower":
            user_choice=input("Please enter either higher or lower: ") 
            if user_choice.lower() == "higher" or user_choice.lower() == "lower":
                game(user_choice,user_value,computers_value,user_score)

    return user_score

def end_message(user_score): # messages to print after the game ends.
    if user_score == 5:
        print("Wow! You played perfectly!")
    elif user_score >= 2 and user_score <= 4:
        print("Good job, you played really well!")
    else:
        print("Better luck next time!")      


if __name__ == "__main__":
    main()
