//GCD - Greatest common divisior 
import java.util.Scanner;

public class Gcd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int num1 = input.nextInt();
        System.out.print("Enter first number:- ");
        int num2 = input.nextInt();
        int i= leastnum(num1,num2) ;
        while (i>=1){
            if (num1%i==0 && num2%i==0){
                break;
            }
            i--;
        }
        System.out.println("GCD:- "+i); }
    public static int leastnum(int a, int b){
        if (a<b){
            return a;
        }
        else{
            return b;
        }
    }    
}
