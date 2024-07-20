import java.util.Scanner;

public class StudentFacultyData {
    public static void main(String[] args) {
        // main method begains execution of the java app(entry point)
        Scanner input = new Scanner(System.in);

        //we created a scanner to obtain input from the user using the terminal window 
        System.out.println("Enter the faculty name: ");
        String facultyName = input.nextLine();
        System.out.println("Enter the student name: ");
        String studentName = input.nextLine();
        System.out.println("Enter the last grade: ");
        char lastGrade = input.next().charAt(0);
        System.out.println("Enter the last degree: ");
        double lastDegree = input.nextDouble();
        /* The nextLine() method reads an entire line of input from the terminal window until a newline character (\n)
        is encountered that is why we use it to returns the input as a String as its useful for reading multi-word strings
        or entire sentences; while the next() method reads the next token from the input(a token is a single word followed
        by whitespace (space, tab, or newline)that is why we used the nextline method instead */
        
        System.out.println("Enter the number of subjects: ");
        int numberOfSubjects = input.nextInt();
        System.out.println("Did the student pass (true or false)? : ");
        boolean pass = input.nextBoolean();

        // Display the collected data
        System.out.println("\n The Student Faculty Data: ");
        System.out.println("Faculty Name: " +" "+ facultyName);
        System.out.println("Student Name: "+" "+ studentName);
        System.out.println("Last Grade: " +" "+ lastGrade);
        System.out.println("Last Degree: " +" "+ lastDegree);
        System.out.println("Number of Subjects: " +" "+ numberOfSubjects);
        System.out.println("Pass: " +" "+ pass);
    }
}