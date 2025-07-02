// Array palindrome ckecker another variant- (much better than previous one) 

import java.util.Scanner;

public class array_Palindrome2 {

    public static void main(String[] args) {
        int[] array = Array_input();
        String Palindrome_result = Palindrome_Checker(array);
        System.out.println(Palindrome_result);
    }

    public static int[] Array_input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an array:- ");
        int size = input.nextInt();
        int[] array = new int[size];
        int index = 0;
        while (index < size) {
            System.out.print("Enter the element number" + (index + 1) + " :- ");
            array[index] = input.nextInt();
            index++;
        }
        System.out.println("Congrats! Your array has been made.");
        return array;
    }

    public static String Palindrome_Checker(int[] array) {
        int index = 0;
        while (index < (array.length / 2)) {
            if (array[index] != array[(array.length - 1) - index]) {
                return "your array is not a palindrome one!";
            }
            index++;
        }
        return "Your array is palindrome!";
    }
}
