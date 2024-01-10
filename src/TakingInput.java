//package src.company;
import java.util.Scanner;
public class TakingInput {
    public static void main(String [] args){
        System.out.println("Taking input from user");
        Scanner input =new Scanner (System.in);
        System.out.println("Enter number 1");
        int a =input.nextInt();
        System.out.println("Enter number 2");
        int b =input.nextInt();
        int sum=a+b;
        System.out.print("the sum is ");
        System.out.println(sum);
        //to check the type of entered data
        boolean b1 =input.hasNextInt();
        System.out.println(b1);
        float number1=input.nextFloat();
//        float number2 =input.nextFloat();
//        System.out.println(number1+number2);
    }
}
