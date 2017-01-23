import java.awt.Point;
import java.util.ArrayList;

public class PP8_6 {
    public static void main(String[] args) {
        Cannonball cb = new Cannonball(0);
        System.out.println("FIRE");
        ArrayList<Point> trajectory = cb.shoot(45, 150, 1);
        
		for(Point p : trajectory) {
		    System.out.println(p.toString());
		}
    }
}
