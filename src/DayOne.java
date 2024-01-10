
import  java.util.Scanner;
public class DayOne {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number less than ten: ");
        int number= input.nextInt();

        if (number<10){
            System.out.print("Your Number is "+number);
        }
        else{
            System.out.println("Your number is greater than ten.");
        }
    }
}
