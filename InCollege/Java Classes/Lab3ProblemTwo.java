import java.util.InputMismatchException;
//scanner object to get user input
import java.util.Scanner;

//let's create a generic class
//generic datatype -T
class GenericClass<T>{
    public void outputPrinter(T userInput){
        System.out.println(userInput);
    }
}

public class Lab3ProblemTwo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter an integer");
            int intObj= input.nextInt();
            input.nextLine();

        System.out.println("Please enter a String");
            String strObj= input.nextLine();
//now that I have created a generic class next I am going to create instance of the class for string and integer each

        GenericClass<String> stringPrinter=new GenericClass<>();


        //it worked, it is quite easy I would say
        //Now it's time to create an instance for integer
        GenericClass<Integer> intPrinter=new GenericClass<>();

        System.out.println("\n\n\nThe output is : ");
        //calling the generic method on instances created with generic classes
        intPrinter.outputPrinter(intObj);
        stringPrinter.outputPrinter(strObj);

    }
}
