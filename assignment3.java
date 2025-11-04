import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Fried Rice", "Fried Noodles", "Toasted Bread", "Fried Potatoes", "Teh Tarik", "Cappuccino", "Chocolate Ice"};
        String key;
        int result = -1;

        System.out.print("Enter item to search: ");
        key = sc.nextLine();

        for(int i = 0; i < menu.length; i++){
            if(menu[i].equalsIgnoreCase(key)){
                result = i;
                break;
            }
        }

        if(result != -1){
            System.out.println(key + " is available in the menu");
        }else{
            System.out.println(key + " is not in the menu");
        }
    }
}

