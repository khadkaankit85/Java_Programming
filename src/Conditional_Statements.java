import java.util.Scanner;
public class Conditional_Statements {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       System.out.println("Enter Your age below: ");
        int age=input.nextInt();
        /*
        if(age>18){
            System.out.println("You can drive.");
        }
        else if(age<=17 && age>10){
            System.out.println("A few more years to go man!");
        }
        else if (age==10){
            System.out.println("Eight more Years to go pal.");
        }
        else if (age<0){
            System.out.println("Age cannot be negative my man!");
        }
        else if (age<10){
            System.out.println("You wanna drive? I believe You shouldn't think about driving any sooner. ");
        }
        else{
            System.out.println("No! You cannot drive.");
        }*/

        //Switch Statement
        switch (age){
            case 18:
                System.out.println("You are eighteen.");
                break;//if there is no break, its gonna execute all the cases
            case 19:
                System.out.println("You are nineteen.");

            case 20:
                System.out.println("YOu are twenty.");
        }
    }
}
