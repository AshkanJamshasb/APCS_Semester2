import java.util.Scanner;
public class PE8_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double r, h;
        
        System.out.print("Enter a height and radius respectively: ");
        h = scan.nextDouble();
        r = scan.nextDouble();
        
        System.out.println("The volume of a cube is " + Geometry.cubeVolume(h));
        System.out.println("The surface area of a cube is " + Geometry.cubeSurface(h));
        System.out.println("The volume of a sphere is " + Geometry.sphereVolume(h));
        System.out.println("The surface area of a sphere is " + Geometry.sphereSurface(h));
        System.out.println("The volume of a cylinder is " + Geometry.cylinderVolume(r, h));
        System.out.println("The surface area of a cylinder is " + Geometry.cylinderSurface(r, h));
        System.out.println("The volume of a cone is " + Geometry.coneVolume(r, h));
        System.out.println("The surface area of a cone is " + Geometry.coneSurface(r, h));
    }
}
