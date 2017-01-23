import java.awt.Point;
import java.util.ArrayList;

public class Cannonball extends PP8_6 {
    private double xPos, yPos;
    final private double GRAVITY = -9.81;
    private double xVelocity, yVelocity;
    
    public Cannonball(int xPos) { 
        this.xPos = xPos;
        yPos = 0;
    }
    
    public void move(double deltaSec) {
        xPos += xVelocity*deltaSec;// d = r*t
        yPos += yVelocity*deltaSec + 0.5*GRAVITY*deltaSec*deltaSec; //d = v*t + .5*gravity*t^2
        yVelocity += GRAVITY*deltaSec; // = -9.81*t
    }
    
    public Point getLocation() {
		return new Point((int) Math.round(xPos), (int) Math.round(yPos));
	}
	
	public ArrayList<Point> shoot(double alpha, double v, double deltaSec) {
	    ArrayList<Point> positions = new ArrayList<Point>();
	    
	    xVelocity = v*Math.cos(alpha);
	    yVelocity = v*Math.sin(alpha) + GRAVITY*deltaSec;
	    
	    while (yPos >= 0) {
	        move(deltaSec);
	        positions.add(getLocation());
	    }
	    return positions;
	}
}
