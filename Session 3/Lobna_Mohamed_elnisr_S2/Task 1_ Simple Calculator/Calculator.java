import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();;
        System.out.println("Enter an operation (Sum, Subtraction, Multiplication, Divison, Reminder): ");
        String operation = input.nextLine();

        // Variable to store the result of the operation
        double result = 0;
        boolean validOperation = true;

        // Perform the chosen operation using a switch statement
        switch (operation) {
            case "sum":
                result = num1 + num2;
                break;
            case "subtraction":
                result = num1 - num2;
                break;
            case "multiplication":
                result = num1 * num2;
                break;
            case "divison":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            case "reminder":
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                validOperation = false;
                break;
        }

        // Display the result if the operation was valid
        if (validOperation) {
            System.out.println("The operation is " + " " + operation + " " + "and its result will be equal to : " +" "+ result);
        }
        
    }
}
