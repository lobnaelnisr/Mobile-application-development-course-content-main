import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a string from user and print each word on a new line
        System.out.println("Enter a string:");
        String inputString = sc.nextLine();
        String[] words = inputString.split(" ");

        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
