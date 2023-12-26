import java.util.Scanner;
public class Conditional_Statements {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your age below: ");
        int age=input.nextInt();
        if(age>18){
            System.out.println("You can drive.");
        }
        else{
            System.out.println("No! You cannot drive.");
        }
    }
}
