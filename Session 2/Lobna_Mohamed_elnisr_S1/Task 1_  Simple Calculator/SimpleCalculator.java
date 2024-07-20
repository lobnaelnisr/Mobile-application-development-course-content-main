import java.util.Scanner;
//the prev code used to take inputs from user using the scanner class

public class SimpleCalculator {
    public static void main(String[] args) {
        // main method begains execution of the java app(entry point)
        Scanner input = new Scanner(System.in);
        //we created a scanner to obtain input from the user using the terminal window 
        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();

        double sum = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double remainder = num1 % num2;
        /*we made five basic arithmetic operations for this simple calc program on num1 and num2 that we got from user
          then we stored the results in corresponding variables.*/
        System.out.println("The Summation: " + sum );
        System.out.println("The Subtraction: " + subtraction );
        System.out.println("The Multiplication: " + multiplication );
        System.out.println("The Division: " + division );
        System.out.println("The Reminder: " + remainder );  
    }
}