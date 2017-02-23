public class Questions extends Quiz {
    String question  = null;
    char type;
    String answers;
    
    public Questions(String question, String answers, char type) {
        this.question = question;
        this.answers = answers;
        this.type = type;
    }
    
    public String getQuestion() {
        return question;
    }
    
    public char getType() {
        return type;
    }
    
    public String getAnswer() {
        return answers;
    }
}