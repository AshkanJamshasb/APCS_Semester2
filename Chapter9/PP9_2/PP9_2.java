import java.util.ArrayList;
//import java.util.Scanner;

public class PP9_2 {
    public static void main(String[] args) {
        int input;
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        //Scanner scan = new Scanner(System.in);
        
        //System.out.println("What type of appointment would you like?\n1)One Time\n2)Daily\n3)Monthly");
        //input = scan.nextInt();
       
        appointments.add(new Onetime(2017, 2, 5));
        appointments.add(new Monthly(2017, 3, 5));
        if (appointments.get(0).occursOn(2017,2, 5) )
            System.out.println("You have an appointment on that day");
        else   
            System.out.println("The day is free");
    }
}
