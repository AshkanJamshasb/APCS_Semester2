public class Quiz implements Measurable {
    double score;
    public Quiz(int score) {
        this.score = score;
    }
    
    public String toString() {
        return "The highest score was an " + this.getLetter() + ": " + score;
    }
    
    public char getLetter() {
        char letter;
        if(score >= 90) {
            letter = 'A';
        } else if (score >= 80) {
            letter = 'B';            
        } else if (score >= 70) {
            letter = 'C';
        } else if (score >= 60) {
            letter = 'D';
        } else {
            letter = 'F';
        }
        return letter;
    }
    
    public double getMeasure() {
        return score;
    }
}
