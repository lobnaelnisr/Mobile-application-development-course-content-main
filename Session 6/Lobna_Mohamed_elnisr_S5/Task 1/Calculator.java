import java.util.*;
class Calculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();
        //check if user input an integer or double
        boolean isInt = num1 == (int)num1 && num2 == (int)num2;;
        // let user choose an operation
        System.out.println("Enter an operation (sum, subtraction, multiplication, division, remainder): ");
        String operation = input.nextLine().toLowerCase();
        switch (operation){
            case "sum" :
                if(isInt){
                    sum((int)num1 , (int)num2);
                }
                else {sum(num1 , num2);}
                break;
            case "subtraction" :
                if(isInt){
                    subtraction((int)num1 , (int)num2);
                }else {subtraction(num1 , num2);}
                break;
            case "multiplication" :
                if(isInt){
                    multiplication((int)num1 , (int)num2);
                }else {multiplication(num1 , num2);}
                break;
            case "division" :
                if(isInt){
                    division((int)num1 , (int)num2);
                }else {division(num1 , num2);}
                break;
            case "remainder" :
                if(isInt){
                    reminder((int)num1 , (int)num2);
                }else {reminder(num1 , num2);}
                break;
            default :
             System.out.println("wrong input! ");
        }
    }
    public static void sum(int a, int b){System.out.println("The Summation is: " + (a + b) );}
    public static void sum(double a, double b){System.out.println("The Summation is: " + (a + b) );}
    public static void subtraction(int a, int b){System.out.println("The Subtraction is: " + (a - b) );}
    public static void subtraction(double a, double b){System.out.println("The Subtraction is: " + (a - b) );}
    public static void multiplication(int a, int b){System.out.println("The Multiplication is: " + (a * b) );}
    public static void multiplication(double a, double b){System.out.println("The Multiplication is: " + (a * b) );}
    public static void division(int a, int b){
        if(b==0)System.out.println("Error! division by zero is not allowed.");
        else System.out.println("The Division is: " + (a / b) );
    }
    public static void division(double a, double b){
         if(b==0)System.out.println("Error! division by zero is not allowed.");
        else System.out.println("The Division is: " + (a / b) );
    }
    public static void reminder(int a, int b){
        if(b==0)System.out.println("Error! division by zero is not allowed.");
        else System.out.println("The Remainder is: " + (a % b) );
    }
    public static void reminder(double a, double b){
        if(b==0)System.out.println("Error! division by zero is not allowed.");
        else System.out.println("The Remainder is: " + (a % b) );
    }
}