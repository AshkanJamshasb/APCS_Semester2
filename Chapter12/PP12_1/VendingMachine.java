import java.util.ArrayList;
public class VendingMachine {
    public static ArrayList<Products> vm = new ArrayList<Products>();
    public VendingMachine() {
        vm.add(new Products("Pretzels", 1.75));
        vm.add(new Products("Cheetos", 1.25));
        vm.add(new Products("Lays", 1.00));
        vm.add(new Products("Skittels", 1.50));
    }
    
    public void purchase(int item) {
        PP12_1.balance -= vm.get(item).getPrice();
    }
    
}
