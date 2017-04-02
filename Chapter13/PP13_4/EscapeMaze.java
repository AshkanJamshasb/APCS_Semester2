public class EscapeMaze {
    public static char maze[][] = new char[][] {{'*', ' ', '*', '*', '*', '*', '*', '*', '*'},
                                                {'*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*'},
                                                {'*', ' ', '*', '*', '*', '*', '*', ' ', '*'},
                                                {'*', ' ', '*', ' ', '*', ' ', ' ', ' ', '*'},
                                                {'*', ' ', '*', ' ', '*', '*', '*', ' ', '*'},
                                                {'*', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*'},
                                                {'*', '*', ' ', '*', '*', ' ', '*', ' ', '*'},
                                                {'*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*'},
                                                {'*', '*', '*', '*', '*', '*', '*', ' ', '*'}};
    //start point will be 5,1
    public static boolean trapped = true;
    public static void main(String[] args) {
        printMaze();
        while (trapped) {
            checkAround(1, 5);
        }
        System.out.println("You've excaped!");
    }   
    public static void printMaze() {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean checkAround(int x, int y) {
        System.out.println("Row: " + x + ", Col: " + y);
        //look up
        System.out.println("Up");
        if(maze[x-1][y] == ' ') {
            if(x-1 == 0) {
                trapped = false;
                return true;
            }
            return checkAround(x-1, y);
        }
        //look left
        if(maze[x][y-1] == ' ') {
                System.out.println("Next left + " + maze[x-1][y]);
            return checkAround(x, y-1);
        }
        //look right
        if(maze[x][y+1] == ' ') {
                return checkAround(x+1, y);
        }
        //look down
        if(maze[x+1][y] == ' ') {
            if(y == 8) {
                trapped = true;
                return true;
            }
            return checkAround(x, y+1);
        }
        return false;
    }
}
