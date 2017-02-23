public class Executive extends Manager {
    String position;
    Executive (String name, double salary, String department, String position) {
        super(name, salary, department);
        this.position = position;
    }
    
    public String toString() {
        return super.toString() + " and is the " + position;
    }
}
