// Palindrome number Checker
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = input.nextInt();
        int num_reverse = reverse_value(num);
        System.out.println("After reversing it:-" + num_reverse + "\n");
        if (num == num_reverse) {
            System.out.println("Hurray! , Its a palindrome number");
        } else {
            System.out.println("Sorry,Not a palindrome number");
        }

    }

    public static int reverse_value(int num) {
        int a;
        int b = 0;
        while (num != 0) {
            a = num % 10;
            b = b * 10 + a;
            num = num / 10;
        }
        return b;
    }

}
