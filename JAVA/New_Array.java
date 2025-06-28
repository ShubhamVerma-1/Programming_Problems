// creating a new array after deleting the element user has provided.
import java.util.Arrays;
import java.util.Scanner;
public class New_Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an array:- ");
        int size = input.nextInt();
        int[] array = new int[size];
        int[] new_array = new int[size - 1];
        int index = 0;
        while (index < size) {
            System.out.print("Enter element number " + (index + 1) + " :- ");
            array[index] = input.nextInt();
            index++;
        }
        System.out.println("Congratulations! Your array has been made!");
        System.out.print("Now, enter the element you want to delete:- ");
        int elem = input.nextInt();
        New_Array_Creation(array, new_array, elem);
    }

    public static void New_Array_Creation(int[] array, int[] new_array, int elem) {
        int count = 0;
        int new_array_index = 0;
        while (count < array.length) {
            if (array[count] != elem) {
                new_array[new_array_index] = array[count];
                new_array_index++;
            }
            count++;
        }
        System.out.print("Here's your new array after deleting the element:- ");
        System.out.println(Arrays.toString(new_array));  
    }
}
