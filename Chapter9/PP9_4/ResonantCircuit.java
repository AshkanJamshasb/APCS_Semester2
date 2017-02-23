public class ResonantCircuit {
    double omega, b, k;
    public ResonantCircuit(double omega, double b, double k) {
        this.omega = omega;
        this.b = b;
        this.k = k;
    }
    
    public double getOmega() {
        return omega;
    }
    
    public double getB() {
        return b;
    }
    
    public double getK() {
        return k;
    }
    
    public void setOmega(double omega) {
        this.omega = omega;
    }
    
    public void setB(double b) {
        this.b = b;
    }
    
    public void setK(double k) {
        this.k = k;
    }
    
    public String display() {
        return "The resonant frequency is " + omega + " with a bandwidth of " + b + " and a gain at the resonant frequency of " + k;
    }
}
