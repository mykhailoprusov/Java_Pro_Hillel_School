package lesson_5.homework7;

public class Triangle implements Figure{
    int base;
    int height;

    public Triangle(int base, int height){
        this.base = base;
        this.height = height;

    }

    @Override
    public double getArea() {
        double area = .5 * base * height;
        System.out.println("Area of the triangle is "+area);
        return area;
    }
}
