// Reverse an array.

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of an array:- ");
        int size = input.nextInt();
        int[] array = new int[size];
        int index = 0;
        while (index < size) {
            System.out.print("Enter the element number " + (index + 1) + " :- ");
            array[index] = input.nextInt();
            index++;
        }
        System.out.println("Hurray! Your array has been established:- " + Arrays.toString(array));
        reverse_array(array);
    }

    public static void reverse_array(int[] array) {
        int counter = 0;
        int swap;
        while (counter < (array.length / 2)) {
            swap = array[counter];
            array[counter] = array[(array.length - 1) - counter];
            array[(array.length - 1) - counter] = swap;
            counter++;
        }
        System.out.println("\nYour reverse array is:-");
        System.out.println(Arrays.toString(array));
    }
}
