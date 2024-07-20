public class ThirdTask {
    public static void main(String[] args) {
        int number = 3; // Number of the multiplication table
        int limit = 20; // Limit up to which we want to generate the table

        System.out.println("Multiplication Table of " + number + " up to " + limit + ":");
        
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " " + " * " + " " + i + " " + " = " + " " + (number * i));
        }
    }    
}
