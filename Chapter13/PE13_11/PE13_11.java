public class PE13_11 {
    public static void main(String[] args) {
        System.out.println("Your guess was 5 the number was 36: " + squareRootGuess(36, 5));
    }
    
    public static double squareRootGuess(double x, double g) {
        if (g*g == x) {
            return g;
        }
        g = (g+x/g)/2;
        return squareRootGuess(x, g);
    }
}
