// ARMSTRONG NUMBER
import java.util.Scanner;

public class Armstrong_number{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = input.nextInt();
        int digit_count = count_numbers(num);
        int sum = solving_number(num, digit_count);
        if (sum == num){
            System.out.println("It's a Armstrong number");
        }
        else{
            System.out.println("Not a Armstrong number");
        }

    }

    public static int count_numbers(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static int solving_number(int num, int digit_count) {
        int a, b = 0;
        while (num != 0) {
            a = num % 10;
            b = b + (int) (Math.pow((a), digit_count));
            num = num / 10;
        }
        return b;
    }
}
