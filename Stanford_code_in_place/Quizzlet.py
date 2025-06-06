# Write a program that loops over a dictionary of words and quizzes the user for their corresponding Spanish translations, 
# keeping count of how many the user gets correct! 
# Separate each question and answer with a blank line to help with visual clarity.
def main():
    score = 0
    translations = {
        "hello": "hola",
        "dog": "perro",
        "cat": "gato",
        "well": "bien",
        "us": "nos",
        "nothing": "nada",
        "house": "casa",
        "time": "tiempo"
    }
    for key in translations:
      word = input(f"What is the Spanish translation for {key}? ")
      if word.lower() == translations[key]:
        print("That is correct!\n")
        score += 1
      else:
        print(f"That is incorrect, the Spanish translation for {key} is {translations[key]}.\n")
    print(f"You got {score}/8 words correct, come study again soon!")



if __name__ == '__main__':
    main()
