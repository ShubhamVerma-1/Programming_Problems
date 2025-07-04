import java.util.Scanner;
public class Leap_Year{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num%400==0 || (num%4 == 0 && num%100 != 0)) {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
