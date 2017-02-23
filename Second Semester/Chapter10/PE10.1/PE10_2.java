import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PE10_2 {
    public static void main(String[] args) {
        /*
        Measurable[] accounts = new Measurable[3];
        accounts[0] = new BankAccount("Ashkan", 0);
        accounts[1] = new BankAccount("Alyssa", 10000);
        accounts[2] = new BankAccount("Chasen", 2000);

        double averageBalance = Data.average(accounts);
        System.out.println("Average balance: " + averageBalance);
        */
       
        /*
        Measurable[] grades = new Quiz[3];
        grades[0] = new Quiz(75);
        grades[1] = new Quiz(94);
        grades[2] = new Quiz(54);       

        Measurable highestGrade = Data.max(grades);
        System.out.println(highestGrade.toString());
        */
 
        Measurable[] people = new Person[3];
        people[0] = new Person(80);
        people[1] = new Person(60);
        people[2] = new Person(40);       
        
        Measurable tallestPerson = Data.max(people);
        System.out.println(tallestPerson.toString());
    }
}