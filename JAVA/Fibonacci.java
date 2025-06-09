// fibonacci series upto n
import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number:- ");
        int num = input.nextInt();
        int sum;
        int first = 0, second = 1;
        System.out.println("Fibonacci series upto " + num + " are :-" + "\n" + 0 + "\n" + 1);
        while (first + second <= num) {
            sum = first + second;
            System.out.println(sum);
            first = second;
            second = sum;
        }
    }
}
