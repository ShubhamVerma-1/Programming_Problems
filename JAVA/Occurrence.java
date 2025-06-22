// Occurence of an element in an array

import java.util.Scanner;

public class Occurrence{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element:- ");
        int size = input.nextInt();
        int[] array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element number " + (i + 1) + " :- ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("Your array has been completely made!\nNow enter the number you want occurence of:- ");
        int num = input.nextInt();
        int count = Count_occurence(num, array);
        System.out.println("The given element come " + count + " times");

    }

    public static int Count_occurence(int num, int[] array) {
        int i = 0;
        int count = 0;
        while (i < array.length) {
            if (num == array[i]) {
                count++;
            }
            i++;
        }
        return count;
    }
}
