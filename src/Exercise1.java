/*Write a program to calculate percentage of a given student in cbse board exam.
His marks from 5 subjects must be taken as input from the keyboard (Marks are out of hundred)
*/
import java.util.Scanner;
public class Exercise1 {
    public static void main(String [] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the marks for first subject:");
        float subject1 = input.nextFloat();

        System.out.println("Enter the marks for second subject:");
        float subject2 =input.nextFloat();

        System.out.println("Enter the marks for third subject:");
        float subject3 =input.nextFloat();

        System.out.println("Enter the marks for fourth subject:");
        float subject4=input.nextFloat();

        System.out.println("Enter the marks for fifth subject: ");
        float subject6=input.nextFloat();

        System.out.println("Enter the marks for sixth subject:");
        float subject5=input.nextFloat();

        System.out.print("Your total percentage is ");
        float percentage =(subject1+subject2+subject3+subject4+subject5+subject6)/6;

        System.out.print(percentage);
        System.out.println("%");
    }
}
