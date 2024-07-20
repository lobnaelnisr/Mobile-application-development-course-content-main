import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Enter the name of product you would like to add to your cart : ");
        String product = input.nextLine();
        System.out.println("Enter the name of the category that your desired product falls into : ");
        char category = input.next().charAt(0);
        System.out.println("Enter the quantity you need of the selected product : ");
        int quantity = input.nextInt();
        boolean availability = (quantity > 0) ? true : false;
        System.out.println("Enter the price of the selected product: ");
        double price = input.nextDouble();
        
        // Display the collected data
        System.out.println("The category is : " +" "+ category);
        System.out.println("Product name : "+" "+ product);
        System.out.println("the quantity needed is : " +" "+ quantity);
        System.out.println("The product availability is : " +" "+ availability);
        System.out.println("price is : " +" "+ price);
    }
}
