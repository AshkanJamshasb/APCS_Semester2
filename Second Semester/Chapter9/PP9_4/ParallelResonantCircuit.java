public class ParallelResonantCircuit extends ResonantCircuit {
    double r, c, l;
    public ParallelResonantCircuit(double omega, double b, double k) {
        super(omega, b, k);
        r = k;
        c = 1.0/(b*r);
        l = 1.0/(Math.pow(omega, 2)*c);
    }
    
    public String display() {
        return super.display() + "\nR = " + r + ", C = " + c + ", L = " + l;
    }
}
