// calculate the sum and average of given array.
import java.util.Scanner; 
public class Sum_Average{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of element:- ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i=0;
        while (i<size) { 
            System.out.println("Enter element number "+(i+1)+" :");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.println("Array has succesfully made!");
        // int[] arr = {12,45,67,23,79,50};
        int sum = sum_array(arr);
        average_array(sum,arr.length);

    }
    public static int sum_array(int[] array){ // calculate the sum of array
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum = sum+ array[i];
        }
        System.out.println("Sum of your array is:- "+sum);
        return sum;
    }

    public static void average_array(int sum, int length ){ // gives the average of an array
        int average = sum/length;
        System.out.println("Average of your array is:- "+average);
    }
}
