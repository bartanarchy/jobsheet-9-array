
import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input n: ");
        int n = input.nextInt();

        int[] grades = new int[n];
        for (int i=0; i<grades.length; i++) {
            grades[i] = input.nextInt();
        }
        int sum = 0;
        for (int i=0; i<grades.length; i++) {
            sum = sum + grades[i];
            System.out.print(grades[i] + " - ");
        }

        double avg = sum / grades.length;
        System.out.println("\nAverage: " + avg);

        int highest = grades[0];
        int lowest = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (highest < grades[i]) {
                highest = grades[i];
            }
            if (lowest > grades[i]) {
                lowest = grades[i];
            }
        }
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
    }
}
