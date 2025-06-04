a=int(input())
b=abs(a)
n=0
if a>=0:
 while (b!=0):
    n=b%10+n*10
    b=b//10
 print("\nResult:- ",n)
if a<0:
  while (b!=0):
    n=b%10+n*10
    b=b//10
  n=-1*n
  print("\nResult:- ",n) 
if (a == n):
  print("It is a palindrome number")
else:
  print("It's not a palindrome number")
