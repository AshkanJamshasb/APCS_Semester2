public class Quiz {
    public Quiz() {
    }
    
    public static void addQuestions() {
     
        PP12_3.question.add(new Questions("Which Java reserved word is used to declare a subclass?", "extends", 'T'));
        PP12_3.question.add(new Questions("What is the original name of the Jaca language?\n\tA) *7\n\tB) C--\n\tC) Oak\n\tD) Gosling", "C", 'S'));
        PP12_3.question.add(new Questions("Which of the following types are supertypes of Rectangle?\n\tA) PrintStream\n\tB) Shape\n\tC) RectangularShape\n\tD) Object\n\tE) String", "BCD", 'M'));
        PP12_3.question.add(new Questions("What is the square root of 2?", "1.41421356", 'N'));
    }
    
    public static boolean checkQuestion(String answer, int questionNum) {
        boolean correct = false;
        if(answer.equals(PP12_3.question.get(questionNum).getAnswer())) {
            correct = true;
        }
        return correct;
    }
}
