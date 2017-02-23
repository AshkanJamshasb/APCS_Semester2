import java.util.ArrayList;
import java.util.Scanner;

public class PP12_3 {
    public static ArrayList<Questions> question = new ArrayList<Questions>();
    public static void main(String[] args) {
        int numRight = 0, totalQuestion = 0;
        String answer;
        
        Scanner scan = new Scanner(System.in);
        Quiz quiz = new Quiz();
        
        quiz.addQuestions();
        
        
        System.out.println(question.get(0).getType());
        System.out.println(question.get(0).getQuestion());
        answer = scan.next();
        scan.nextLine();
        if(quiz.checkQuestion(answer, 0)) {
            numRight++;
        }
        totalQuestion++;
        System.out.println(question.get(1).getType());
        System.out.println(question.get(1).getQuestion());
        answer = scan.next();
        scan.nextLine();
        if(quiz.checkQuestion(answer, 1)) {
            numRight++;
        }
        totalQuestion++;
        System.out.println(question.get(2).getType());
        System.out.println(question.get(2).getQuestion());
        answer = scan.next();
        scan.nextLine();
        if(quiz.checkQuestion(answer, 2)) {
            numRight++;
        }
        totalQuestion++;
        System.out.println(question.get(3).getType());
        System.out.println(question.get(3).getQuestion());
        answer = scan.next();
        scan.nextLine();
        if(quiz.checkQuestion(answer, 3)) {
            numRight++;
        }
        totalQuestion++;
        
        System.out.println("You got " + numRight + "/" + totalQuestion + " which is a " + (numRight/totalQuestion)*100 + "%");
    }
}
