public class Instructor extends Person{
    double salary = 0;
    
    public Instructor(String name, int year, double salary) {
        super(name, year);
        this.salary = salary;
    }
    
    public String toString() {
        return super.toString() + " and has a salary of $" + salary;
    }
}
