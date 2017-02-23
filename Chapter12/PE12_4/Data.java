public class Data {
    public static int add(int in1, int in2) {
        return in1 + in2;
    }
    
    public static int subtract(int in1, int in2) {
        return in1 - in2;
    }
    
    public static void tries(int answer, int userAnswer) {
        for (int i = 0; i < 3; i++) {
            if (checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                break;
            }
            System.out.println("Try again...");
        }
    }
    
    public static boolean checkAnswer(int userAnswer) {
        boolean equals = false;
        Modes.getAnswer();
        if (Modes.answer == userAnswer) {
            equals = true;
        }
        return equals;
    }
}
