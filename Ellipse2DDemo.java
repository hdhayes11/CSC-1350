package ellipse2ddemo;
import java.util.Scanner;

public class Ellipse2DDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the location, width and height of the ellipse (width > height) -> ");
        Ellipse2D ellipse = new Ellipse2D(scan.nextDouble(),scan.nextDouble(),scan.nextDouble(),scan.nextDouble());
        Ellipse2D ellipseMod = new Ellipse2D(((ellipse.getWidth()-ellipse.getHeight())/2)+ellipse.getX(),ellipse.getY(),ellipse.getHeight(),ellipse.getHeight());        
        System.out.print("\nDescription of the First Ellipse:\n");
        printEllipseDetails(ellipse);
        System.out.print("\nDescription of the Second Ellipse:\n");
        printEllipseDetails(ellipse);
        System.out.print("\nDescription of the Second Ellipse after it is modified:\n");
        printEllipseDetails(ellipseMod);
        System.out.printf("The area between the first and second ellipses is %.5f", ellipse.area()-ellipseMod.area());
        
    }
    public static void printEllipseDetails(Ellipse2D ellipse){
        System.out.print("----------------------------------------------------------\n");       
        System.out.print(ellipse.toString());
        System.out.printf("%nlocation: (%.5f,%.5f)",ellipse.getX(),ellipse.getY());
        System.out.printf("%nwidth: %.5f         height: %.5f", ellipse.getWidth(),ellipse.getHeight());
        System.out.printf("%narea: %.5f        perimeter: %.5f", ellipse.area(), ellipse.perimeter());
        System.out.print("\n----------------------------------------------------------\n");
    }
    
    
}
