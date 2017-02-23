public class Appointment {
    int year, month, day;
    public Appointment(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public String date() {
        return month + "/" + day + "/" + year;
    }
    
    public boolean occursOn(int year, int month, int day) {
        boolean free = false;
        if (date().equals(month + "/" + day + "/" + year))
            free = true;
        return free;
    }
}
