// Check the array if it is sorted or not
// Another variant of sorted_check program that i created earlier (more concise than that)

import java.util.Scanner;

public class Sorted_Check_2 {

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
        boolean dec = Decreasing_sort(array);
        boolean inc = Increasing_sort(array);
        if (dec || inc) {
            System.out.println("Your array is sorted");
        } else {
            System.out.println("Your array is not sorted");
        }
    }

    public static boolean Decreasing_sort(int[] array) {
        int count = 1;
        while (count < array.length) {
            if (array[count] > array[count - 1]) {
                return false;
            }
            count++;
        }
        return true;
    }

    public static boolean Increasing_sort(int[] array) {
        int count = 1;
        while (count < array.length) {
            if (array[count] < array[count - 1]) {
                return false;
            }
            count++;
        }
        return true;
    }
}
