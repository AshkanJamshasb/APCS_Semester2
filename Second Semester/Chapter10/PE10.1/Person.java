public class Person implements Measurable {
    double height;
    public Person(double height) {
        this.height = height;
    }
    
    public double getMeasure() {
        return height;
    }
    
    public String toString() {
        return "The height is: " + this.getMeasure();
    }
}
