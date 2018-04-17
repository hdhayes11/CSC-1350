package ellipse2ddemo;
/**
     * This program creates 2 ellipses and figures out
     * the difference in areas between them when
     * they are overlayed on top of each other. <br>
     * CSC 1350 Lab # 8
     * @author Hunter Hayes
     * @since 11/06/17
 */
public class Ellipse2D {
    private double x,y,width,height = 0;
 
    public Ellipse2D(){ //creates and ellipse located at (0,0)
        x = 0;
        y = 0;
        width = 0;
        height = 0;
    }
    public Ellipse2D(double xLoc, double yLoc, double w, double h){ //creates and ellipse from the specified coordinates
        x = xLoc;
        y = yLoc;
        width = w;
        height = h;
        
    }
    public double getHeight(){ //returns the height
        return height; 
    }
    public double getWidth(){ //returns the width
        return width; 
    }
    public double getX(){ //returns the X
        return x; 
    }
    public double getY(){ //returns the Y
        return y; 
    }
    public void setEllipse2D(double xLoc, double yLoc, double w, double h){ //sets the location and size of the framing rectangle shape
        xLoc = x;
        yLoc = y;
        w = width;
        h = height;
    }
    public String toString(){ //returns string representation of ellipse
        return String.format("Ellipse2D[x=%.5f, y=%.5f, w=%.5f, h=%.5f",x,y,width,height);
    }
    public double area(){ //returns the area of the ellipse
        return (Math.PI*width*height)/4;    
    }
    public double perimeter(){ //returns the permimeter of the ellipse
        return (Math.PI/2)*(3*(width+height)-Math.sqrt((3*width+height)*(width+3*height)));
    }
    
}
