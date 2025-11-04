import java.util.Scanner;
public class arrayValue24 {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int[] finalScores = new int[10];

      for(int i = 0; i < finalScores.length; i++){
         System.out.print("Enter the Final score " + i + ": ");
         finalScores[i] = sc.nextInt();
      }
      for (int i = 0; i < 10; i++) {
         System.out.println("Final score " + i + " is " + finalScores[i]);
      }
   }
}