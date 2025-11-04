import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalOrder;
        System.out.print("Enter number of orders: ");
        totalOrder = input.nextInt();
        input.nextLine(); 

        String[] orderName = new String[totalOrder];
        int[] orderPrice = new int[totalOrder];

        for (int i = 0; i < totalOrder; i++) {
            System.out.print("Enter order name: ");
            orderName[i] = input.nextLine();

            System.out.print("Enter order price: ");
            orderPrice[i] = input.nextInt();
            input.nextLine();
        }

        int totalCost = 0;

        System.out.println("\n ----------Order List---------- ");
        for (int i = 0; i < totalOrder; i++) {
            System.out.println(orderName[i] + " : Rp " + orderPrice[i]);
            totalCost += orderPrice[i];
        }

        System.out.println("----------------------");
        System.out.println("Total Cost : Rp " + totalCost);
    }
}
