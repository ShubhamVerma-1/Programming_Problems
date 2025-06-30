// Array palindrome checker

import java.util.Scanner;

public class Array_Palindrome {

    public static void main(String[] args) {
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
        System.out.println("Congrats! Your array has been made");
        int[] reversed_arr = Reverse_Array(array);
        String ans = Palindrome_Checker(reversed_arr, array);
        System.out.println(ans);

    }

    public static int[] Reverse_Array(int[] array) {
        int index = 0;
        int reverse_index = array.length - 1;
        int[] rev_array = new int[array.length];
        while (index < array.length) {
            rev_array[index] = array[reverse_index];
            reverse_index--;
            index++;
        }
        return rev_array;
    }

    public static String Palindrome_Checker(int[] reversed_array, int[] array) {
        int index = 0;

        while (index < array.length) {
            if (reversed_array[index] != array[index]) {
                return "Your array is not a palindrome one!";
            }
            index++;
        }
        return "Your array is palindrome!";
    }
}
