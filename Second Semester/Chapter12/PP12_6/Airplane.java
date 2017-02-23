import java.util.ArrayList;

public class Airplane {
    static int[][] firstClass = new int[5][4];
    static int[][] economyClass = new int[15][6];
    public Airplane() {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                firstClass[i][j] = 0;
            }
        }
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 6; j++) {
                economyClass[i][j] = 0;
            }
        }
    }
    
    public static int checkForOpenSeats(String seatingClass) {
        int numberOfOpenSeats = 0;
        switch(seatingClass) {
            case "First":
                for(int i = 0; i < 5; i++) {
                    for(int j = 0; j < 4; j++) {
                        if(firstClass[i][j] == 0) {
                            numberOfOpenSeats++;
                        }
                    }
                }
                break;
            case "Economy":
                for(int i = 0; i < 15; i++) {
                    for(int j = 0; j < 6; j++) {
                        if(economyClass[i][j] == 0) {
                            numberOfOpenSeats++;
                        }
                    }
                }
                break;
        }
        return numberOfOpenSeats;
    }
    
    public static boolean openSeat(String seatingClass) {
        boolean open = false;
        if(checkForOpenSeats(seatingClass) != 0) {
            open = true;
        }
        return open;
    }
    
    public static void takeSeat(String seatingClass) {
        boolean skip = false;
        if(openSeat(seatingClass)) {
            
            switch(seatingClass) {
                case "First":
                    for(int i = 0; i < 5; i++) {
                        if(skip){break;}
                        for(int j = 0; j < 4; j++) {
                            if(skip){break;}
                            if(firstClass[i][j] == 0) {
                                firstClass[i][j] = 1;
                                skip = true;
                            }
                        }
                    }
                    break;
                case "Economy":
                    for(int i = 0; i < 15; i++) {
                        if(skip){break;}
                        for(int j = 0; j < 6; j++) {
                            if(skip){break;}
                            if(economyClass[i][j] == 0) {
                                economyClass[i][j] = 1;
                                skip = true;
                            }
                        }
                    }
                    break;
                }
        }
    }
    
    public static void displaySeats() {
        for(int i = 0; i < 5; i++) {
            System.out.print("\n  ");
            for(int j = 0; j < 4; j++) {
                System.out.print(firstClass[i][j] + " ");
                if(j == 1){System.out.print(" ");}
                if(i == 4 && j == 3){System.out.println();}
            }
        }
        for(int i = 0; i < 15; i++) {
            System.out.println();
            for(int j = 0; j < 6; j++) {
                System.out.print(economyClass[i][j] + " ");
                if(j == 2){System.out.print(" ");}
                if(i == 14 && j == 5){System.out.println();}
            }
        }
    }
}
