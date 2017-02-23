public class Person {
    public String name;
    int birthYear;
    
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    
    public String toString() {
        return name + " was born in " + birthYear;
    }
}
