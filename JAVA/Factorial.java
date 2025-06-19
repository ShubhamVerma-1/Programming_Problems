// Prints factorial of a number
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = num;
        long factorial= 1;
        while (i>=1){
            factorial= factorial * i;
            i--;
        }
        System.out.println(factorial);
    }
}
