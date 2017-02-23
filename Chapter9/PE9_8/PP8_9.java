public class PP8_9 {
    
    public static void main(String[] args) {
        Student trevor = new Student("Trevor", 1998, "Engineering");
        Student don = new Student("Donovan", 2000, "Computer Engineering");
        Instructor cozean = new Instructor("Cozean", 1960, 1000);
        
        
        System.out.println(trevor.toString());
        System.out.println(don.toString());
        System.out.println(cozean.toString());
    }
}
