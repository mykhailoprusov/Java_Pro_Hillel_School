package lesson_2;

public class ThirdTask {
    public static void main(String[] args){

        double interest = Double.parseDouble(args[1])/100;
        int years = Integer.parseInt(args[2]) ;
        double total = Double.parseDouble(args[0]);

        System.out.println("The initial input money were: "+ total);

        for(int i = 1; i<=years; i++){
            double compoundedTimes = i * 12.0;
            double result = total * Math.pow((1.0 + (interest/12)), compoundedTimes);
            double accumulated = result - total;

            System.out.println("The total after "+i+ " years " + result + "; The accumulated amount is "+ accumulated);

        }




    }
}
