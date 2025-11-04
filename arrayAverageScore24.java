import java.util.Scanner;
public class arrayAverageScore24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] score = new int[n];
        double total = 0;
        double average;

        double totalPass = 0;
        double totalFail = 0;
        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < score.length; i++){
            System.out.print("Enter the final score " + i + ": ");
            score[i] = sc.nextInt();

            total = total + score[i];

            if(score[i] > 70){
                totalPass = totalPass + score[i];
                passCount = passCount + 1;
            } else {
                totalFail = totalFail + score[i];
                failCount = failCount + 1;
            }
        }

        average = total / score.length;

        System.out.println("The average class score is: " + average);
        System.out.println("The average score of students who passed is " + (totalPass / passCount));
        System.out.println("The average score of students who failed is " + (totalFail / failCount));

        sc.close();
    }
}
