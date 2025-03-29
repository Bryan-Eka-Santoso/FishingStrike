import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanI = new Scanner(System.in);        
        Scanner scanS = new Scanner(System.in);  
        
        int menu1;

        do {
            System.out.println("==================================");
            System.out.println("          FISHING STRIKE          ");
            System.out.println("==================================");
            System.out.println("Coins: ");
            System.out.println("Current Rod: ");
            System.out.println("Durability: ");
            System.out.println("Strength: ");
            System.out.println("==================================");
            System.out.println("[1] Go Fishing");
            System.out.println("[2] Inventory");
            System.out.println("[3] Visit Frog King");
            System.out.println("[0] Exit");
            System.out.println("==================================");
            do {
                System.out.print(">> ");
                menu1 = scanI.nextInt();
            } while(menu1 < 0 || menu1 > 3);

            switch (menu1) {
                case 1:
                System.out.println("==============================");
                System.out.println("Rod \t :");
                System.out.println("Strength \t :");
                System.out.println("==============================");
                System.out.println("==============================");
                System.out.println("[Q] Quest Menu");
                System.out.println("[E] Exit");
                System.out.println("[WASD] Move Player");
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;

                default:
                    break;
            }

        } while(menu1 != 0);
    }
}
