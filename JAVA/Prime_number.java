//prime number program
import java.util.Scanner;

public class Prime_number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean value = true;
        if (num == 2) {
            System.err.println(num + " is a prime number");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number");
                    value = false;
                    break;
                }
            }
        }
        if (value) {
            System.err.println(num + " is a prime number");
        }
    }

}
