import org.junit.Test;

import static org.junit.Assert.*;

public class Circle2DTest {



    @org.junit.Test
    public void main() {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }

    @org.junit.Test
    public void getArea() {
    }

    @org.junit.Test
    public void getPerimeter() {
    }

    @org.junit.Test
    public void contains() {
    }

    @org.junit.Test
    public void contains1() {
    }

    @org.junit.Test
    public void overlaps() {
    }

    /*@Test
    public void getArea1() {
    }

    @Test
    public void getPerimeter1() {
    }

    @Test
    public void contains2() {
    }

    @Test
    public void contains3() {
    }

    @Test
    public void overlaps1() {
    }*/
}