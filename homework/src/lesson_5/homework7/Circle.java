package lesson_5.homework7;
import java.lang.Math;
public class Circle implements Figure{
    double radius;

    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle is "+ area);
        return area;
    }
}
