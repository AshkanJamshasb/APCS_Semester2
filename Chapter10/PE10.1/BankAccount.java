public class BankAccount implements Measurable {
    String name;
    int balance;
    
    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    
    public double getMeasure() {
        return balance;
    }
    
    public String getName() {
        return name;
    }
}
