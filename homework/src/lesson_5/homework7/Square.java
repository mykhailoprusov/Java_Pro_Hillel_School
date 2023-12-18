package lesson_5.homework7;

public class Square implements Figure{
    double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = side * side;
        System.out.println("Area of the square is "+area);
        return area;
    }
}
