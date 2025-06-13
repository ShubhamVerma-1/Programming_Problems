// print 3 different types of star patterns 
import java.util.Scanner;

public class Star_patterns {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        int rows = input.nextInt();
        Star_pattern1(rows);
        Star_pattern2(rows);
        Star_pattern3(rows);
    }

    public static void Star_pattern1(int rows) {
        int s;
        for (int i = 1; i <= rows; i++) {
            for (s = 1; s <= i; s++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void Star_pattern2(int rows) {
        int s;
        for (int i = rows; i >= 1; i--) {
            for (s = i; s >= 1; s--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");

    }

    public static void Star_pattern3(int rows) { // try to add space in between stars in future.
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j > (rows - i)) {
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

    }

}
