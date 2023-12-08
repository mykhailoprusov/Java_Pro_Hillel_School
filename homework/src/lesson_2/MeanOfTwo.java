package lesson_2;

public class MeanOfTwo {
    public static void main(String[] args){
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double result = (num1+num2) / 2;
        System.out.println("The mean of " + num1 + " and " + num2 + " is " + result);
    }
}
