import java.util.Scanner;
public class PP8_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ComboLock combo = new ComboLock(27, 37, 35);
        
        do {
            switch(combo.getCount()) {
                case 0:
                    System.out.print("How many ticks would you like to turn right?: ");
                    combo.turnRight(scan.nextInt());
                    break;
                case 1:
                    System.out.print("How many ticks would you like to turn left?: ");
                    combo.turnLeft(scan.nextInt());
                    break;
                case 2:
                    System.out.print("How many ticks would you like to turn right?: ");
                    combo.turnRight(scan.nextInt());
                    if(!combo.open()) 
                        combo.reset();
                    break;
                default:
                    System.out.println("Something went wrong.");
                    break;            
            }
        } while (!combo.open());
        System.out.println("You opened the lock!");
    }
}
