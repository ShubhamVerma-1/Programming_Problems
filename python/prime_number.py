num=int(input("Enter a number:- "))
if num<2:
 print("Not a prime number")
else: 
 for a in range (3,num):
    if num%2==0:
     print("Not a prime number")
     break
 else:
   print("It is a prime number")
