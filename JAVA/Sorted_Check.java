// Checks whether the array is sorted or not (Ascending or Descending)

import java.util.Scanner;

public class Sorted_Check {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int size = input.nextInt();
        int[] array = new int[size];
        int index = 0;
        while (index < size) {
            System.out.print("Enter element number " + (index + 1) + " :- ");
            array[index] = input.nextInt();
            index++;
        }
        System.out.println("Congratulations! Your array has been made!");

        if (size > 1) {
            boolean inc, dec;
            dec = Decreasing_sort(array);
            inc = Increasing_sort(array);
            if (inc == true) {
                System.out.println("Your array is sorted in increasing order");
            } else if (dec == true) {
                System.out.println("Your array is sorted in decreasing order");
            } else {
                System.out.println("Sorry! Your array is not sorted");
            }
        } else {
            System.out.println("Array of size 1 is always sorted");
        }
    }

    public static boolean Decreasing_sort(int[] array) {
        int count = 0;
        int num = array[count];
        boolean a = true;
        while (count < array.length) {
            if (num >= array[count]) {
                num = array[count];
                count++;
            } else {
                return false;
            }
        }
        if (a == true) {

            return true;
        }
        return true;
    }

    public static boolean Increasing_sort(int[] array) {
        int count = 0;
        int num = array[count];
        boolean a = true;
        while (count < array.length) {
            if (num <= array[count]) {
                num = array[count];
                count++;
            } else {
                return false;
            }
        }
        if (a == true) {
            return true;
        }
        return true;
    }
}
