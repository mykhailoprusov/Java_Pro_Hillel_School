package lesson_2;

public class MeanOfAny {
    public static void main(String[] args){

        double sum = 0;
        double counter = 0;
        for(int i =0; i < args.length; i++){
            sum+= Double.parseDouble(args[i]);
            counter++;
        }
        double result = sum/counter;
        System.out.println(String.format("The mean is %.2f",result));
    }
}
