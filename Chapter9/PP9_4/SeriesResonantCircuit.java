public class SeriesResonantCircuit extends ResonantCircuit {
    double r, c, l;
    public SeriesResonantCircuit(double omega, double b, double k) {
        super(omega, b, k);
        r = 1.0/k;
        l = r/b;
        c = 1.0/(Math.pow(omega, 2)*l);
    }
    
    public String display() {
        return super.display() + "\nR = " + r + ", C = " + c + ", L = " + l;
    }
}
