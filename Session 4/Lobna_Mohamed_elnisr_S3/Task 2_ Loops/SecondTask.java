import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //user to enter the upper limit
        System.out.println("Enter the number up to which you want to display numbers that starts from 10: ");
        int upperLimit = input.nextInt();
        
        // Display numbers from 10 up to the specified number
        if (upperLimit < 10) {
            System.out.println("You have inserted invalid number,The upper limit must be greater than or equal to 10.");
        } 
        else {
            for (int i = 10; i <= upperLimit; i++) {
                System.out.println(i);
            }
        }
    }
}
