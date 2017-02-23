import java.util.ArrayList;
public class PP12_1 {
    public static int balance = 0;
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        
        
        System.out.println("Adding $2.00");
        Coins.addCoin(2);
        System.out.println("Adding $1.75");
        Coins.addCoin(1.75);
        
        System.out.println("Your balance is: " + balance);
        
        System.out.println("Buying Pretzles");
        machine.purchase(0);
        System.out.println("Your balance is: " + balance);
        System.out.println("Buying Lays");
        machine.purchase(2);
        System.out.println("Your balance is: " + balance);
    }
}