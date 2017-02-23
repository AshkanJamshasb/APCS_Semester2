import java.util.Scanner;

public class Modes {
    static Scanner scan = new Scanner(System.in);
    static int answer = 0;
    public static void addSmallNumbers() {
        int num1, num2;
        num1 = (int)(Math.random() * 10);
        num2 = (int)(Math.random() * 10);
        System.out.print("What is the sum of " + num1 + " and " + num2 + ": ");
        getAnswer();
        Data.tries(answer, Data.add(num1, num2));
    }
    
    public static void addLargeNumbers() {
        int num1, num2;
        num1 = (int)(Math.random() * 100);
        num2 = (int)(Math.random() * 100);
        System.out.print("What is the sum of " + num1 + " and " + num2 + ": ");
        getAnswer();
        Data.tries(answer, Data.add(num1, num2));
    }
    
    public static void subtractNumbers() {
        int num1, num2, temp;
        num1 = (int)(Math.random() * 100);
        num2 = (int)(Math.random() * 100);
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        } 
        System.out.print("What is the difference between " + num1 + " and " + num2 + ": ");
        getAnswer();
        Data.tries(answer, Data.subtract(num1, num2));
    }
    
    public static void getAnswer() {
        scan.nextLine();
        answer = scan.nextInt();
    }
}
