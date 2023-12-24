import java.util.Scanner;
public class PracticeQuestions {
    public static void main(String [] args)
    {
        ////This part is to get input from user:)
        Scanner input =new Scanner(System.in);

//        ////First part of practice Section
//        System.out.print("Enter your Name: ");
//        String name=input.nextLine();
//        System.out.print("Hello! ");
//        System.out.print(name);
//        System.out.println(" Have a good day!");
//        ////End of the first part:)


        ////Second part of the questions:)
//        boolean number =input.hasNextInt();
//        System.out.println(number);
        ////Third part of the practice questions:)
        System.out.println("WELCOME TO KM to miles converter. Please Enter the number in kilometers: ");
        int numberInKm=input.nextInt();
        double numberInMiles=numberInKm*0.621371;
        System.out.print(numberInKm);
        System.out.print("Km = ");
        System.out.print(numberInMiles);
        System.out.println(" Miles");
        ////This shall conclude all the practice questions:)
    }
}
