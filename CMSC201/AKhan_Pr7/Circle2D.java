import java.util.Scanner;

public class Circle2D {

    double x, y;
    double radius;
    Scanner stdin = new Scanner(System.in);

    public void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));

    }


    public Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double xi, double yi, double ri) {
        x = xi;
        y = yi;
        radius = ri;
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public double getY(){
        return y;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }


    public boolean contains(double x2, double y2) { //whether or not a point is within a circle

        double distance = Math.sqrt((x-x2)*(x-x2)+(y-y2)*(y-y2));

        if(distance<=radius){
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(Circle2D circle) {

        double x2=circle.getX();
        double y2=circle.getY();		// get c's x,y coordinate
        double distance = Math.sqrt((x-x2)*(x-x2)+(y-y2)*(y-y2));   // determine the distance from this x,y to c's x,y

        if(distance<=radius-circle.getRadius())
            return true;
        else
            return false;
    }

    public boolean overlaps(Circle2D circle) { //check if there are overlapping points in the circle
        double x2=circle.getX();
        double y2=circle.getY();
        double distance=Math.sqrt((x-x2)*(x-x2)+(y-y2)*(y-y2));

        if(distance<=radius+circle.getRadius())
            return true;
        else
            return false;
    }

}
