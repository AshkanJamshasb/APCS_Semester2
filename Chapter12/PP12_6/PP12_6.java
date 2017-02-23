public class PP12_6 {
    public static void main(String[] args) {
        System.out.println("Displaying seats...");
        Airplane.displaySeats();
        /*
        System.out.println("Adding 10 people to economy...");
        for(int i = 0; i < 10; i++){Airplane.takeSeat("Economy");}
        Airplane.displaySeats();
        System.out.println("Adding 3 people to first class...");
        for(int i = 0; i < 3; i++){Airplane.takeSeat("First");}
        Airplane.displaySeats();
        */
        System.out.println("Adding 20 people to economy and 10 to first class...");
        for(int i = 0; i < 10; i++){Airplane.takeSeat("First");}
        for(int i = 0; i < 20; i++){Airplane.takeSeat("Economy");}
        Airplane.displaySeats();
    }
}
