import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the base
        System.out.println("Enter the base number: ");
        int base = input.nextInt();

        // Prompt the user to enter the exponent
        System.out.println("Enter the exponent number: ");
        int exponent = input.nextInt();

        // Calculate the exponentiation using a loop
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

}
