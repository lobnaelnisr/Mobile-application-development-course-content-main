import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number to calculate its factorial: ");
        int number = input.nextInt();

        // Calculate the factorial
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}        