public class PE9_9 {
    public static void main(String[] args) {
        Employee chasen = new Employee("Chasen", 2.00);
        Manager justin = new Manager("Justin", 3.00, "Programming");
        Executive ashkan = new Executive("Ashkan", 100, "Programming", "CEO");
        
        System.out.println(chasen.toString());
        System.out.println(justin.toString());
        System.out.println(ashkan.toString());
    }
}
