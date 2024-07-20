import java.util.Scanner;

public class Cart {
    private String productName;
    private char category;
    private int quantity;
    private boolean availability;
    private double price;

    // Constructor
    public Cart(String productName, char category, int quantity, double price) {
        this.productName = productName;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
        this.availability = quantity > 0;
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public char getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isAvailability() {
        return availability;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.availability = quantity > 0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Methods
    public void displayCartDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Quantity: " + quantity);
        System.out.println("Availability: " + (availability ? "In Stock" : "Out of Stock"));
        System.out.println("Price: " + price + " LE");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input details for the cart
        System.out.println("Enter the name of the product you would like to add to your cart: ");
        String productName = input.nextLine();
        System.out.println("Enter the category of the desired product (one character): ");
        char category = input.next().charAt(0);
        System.out.println("Enter the quantity you need of the selected product: ");
        int quantity = input.nextInt();
        System.out.println("Enter the price of the selected product: ");
        double price = input.nextDouble();

        // Create Cart object
        Cart cart = new Cart(productName, category, quantity, price);

        // Display cart details
        cart.displayCartDetails();

    }
}

