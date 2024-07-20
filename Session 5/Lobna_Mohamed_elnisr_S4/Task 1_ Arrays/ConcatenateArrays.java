import java.util.Scanner;

public class ConcatenateArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input and concatenate two arrays of integers
        System.out.print("Enter the size of the first array: ");
        int size1 = input.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = input.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int size2 = input.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = input.nextInt();
        }

        int[] concatenatedArray = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            concatenatedArray[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            concatenatedArray[size1 + i] = array2[i];
        }

        System.out.println("Concatenated array:");
        for (int number : concatenatedArray) {
            System.out.print(number + " ");
        }
        System.out.println();

    }
}