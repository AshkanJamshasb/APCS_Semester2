public class PP13_3 {
    public static void main(String[] args) {
        move(5, 1, 3);
    }
    
    public static void move(int disks, int from, int to) {
        if (disks > 0) {
            int other = 6-from-to;
            move(disks-1, from, other);
            System.out.println(nextMove(from, to) + ", " + hasNextMove(disks, from));
            //System.out.println("Move disk from peg " + from + " to " + to);
            move (disks - 1, other, to);
        }
    }   
    
    public static String nextMove(int from, int to) {
        return ("Move disk from peg " + from + " to " + to);
    }    
    
    public static boolean hasNextMove(int disks, int from) {
        if(disks == from) {
            return false;
        }
        return true;
    }
}