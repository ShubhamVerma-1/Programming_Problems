# Gives all the prime numbers smaller than the user input.
num = int(input("Enter a number:- "))
flag = False
if num>2:
 print(2) 
for a in range (3,num):
 for b in range(2,a):
     if a%b==0:
       flag=False
       break
     else:
       flag=True
 if flag:
  print(a)
  
