public class Student extends Person{
    String major = null;
    
    public Student (String name, int year, String major) {
        super(name, year);
        this.major = major;
    }
    
    public String toString() {
        return super.toString() + " and is majoring in " + major;
    }
}
