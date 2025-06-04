"""
Write a program that implements the following process.
Have the user input a positive integer, call it n.
If n is even, divide it by two.
If n is odd, multiply it by three and add one.
Continue this process until n is equal to one.
"""

def main():
   num = int(input("Enter a number: "))
   while num != 1:
     if num % 2 == 0:
        print(f"{num} is even, so I take half: {num//2}")
        num = num//2
     else:
         print(f"{num} is odd, so I make 3n + 1: {3*num+1}")
         num = 3*num+1
if __name__ == "__main__":
    main()
