import java.util.Scanner;
import java.util.ArrayList;

public class GradeBook extends Student {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> studArray = new ArrayList<Student>();
        int numStud, numQuiz;
        String name;
        double[] scores;
        
        System.out.print("How many students are there: ");
        numStud = scan.nextInt();
        scan.nextLine();
        //For names
        for(int i = 0; i < numStud; i++) {
            name = null;
            studArray.add(new Student());
            System.out.print("Enter student " + (i+1) + " name: ");
            name = scan.nextLine();
            studArray.get(i).setName(name);
        }    
        
        //For scores
        System.out.print("How many quizes did each student take? ");
        numQuiz = scan.nextInt();
        scores = new double[numQuiz];
        for(int i = 0; i < numStud; i++) {
            for(int j = 0; j < numQuiz; j++) { 
                System.out.print("Enter " + studArray.get(i).getName() + "'s score on quiz " + (j+1) + ": ");
                scores[j] = scan.nextDouble();
            }   
            studArray.get(i).setScores(scores);
        }
        
        for(int i = 0; i < numStud; i++) {
            System.out.println("The average quiz score for " + studArray.get(i).getName() + " is " + studArray.get(i).getAverage() + ".");
        }
    }
}
