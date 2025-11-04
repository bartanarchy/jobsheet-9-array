import java.util.Scanner;

public class linearSearch24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter the number of array elements: ");
        // int n = input.nextInt();

        // int[] arrayInt = new int[n];

        // for (int i = 0; i < n; i++) {
        // System.out.print("Enter the array element " + i + ": ");
        // arrayInt[i] = input.nextInt();
        // }

        // System.out.print("Enter the key you want to search for: ");
        // int key = input.nextInt();

        // boolean found = false;
        // for (int i = 0; i < n; i++) {
        // if (arrayInt[i] == key) {
        // System.out.println("The key in the array is located at index position " + i);
        // found = true;
        // }
        // }

        // if (!found) {
        // System.out.println("The key was not found in the array.");
        // }
        System.out.print("Enter the number of array elements: ");
        int n = input.nextInt();

        int[] arrayInt = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the array element " + i + ": ");
            arrayInt[i] = input.nextInt();
        }

        System.out.print("Enter the key you want to search for: ");
        int key = input.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arrayInt[i] == key) {
                System.out.println("The key in the array is located at index position " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Key not found");
        }

        input.close();
    }
}