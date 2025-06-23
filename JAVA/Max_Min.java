// maximum and minimum element in the array

import java.util.Scanner;

public class Max_Min {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of element:- ");
        int size = input.nextInt();
        int[] array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element number " + (i + 1) + " :- ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("Your array has been created!");
        int max = Maximum(array);
        System.out.println("Largest element in the array is:- " + max);
        int min = Minimum(array);
        System.out.println("Smallest element in the array is:- " + min);
    }

    public static int Maximum(int[] array) {
        int max_num = array[0];
        int count = 0;
        while (count < array.length) {
            if (array[count] > max_num) {
                max_num = array[count];
            }
            count++;
        }
        return max_num;
    }

    public static int Minimum(int[] array) {
        int min_num = array[0];
        int count = 0;
        while (count < array.length) {
            if (array[count] < min_num) {
                min_num = array[count];
            }
            count++;
        }
        return min_num;
    }

}
