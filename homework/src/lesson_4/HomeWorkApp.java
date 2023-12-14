package lesson_4;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(compareSum(2, 19));
        checkSign(-1);
        System.out.println(getSign(-6));
        printWordManyTimes("Hello", 5);
        System.out.println(checkYear(1000));

    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println();
        System.out.println("Banana");
        System.out.println();
        System.out.println("Apple");
        System.out.println();
    }

    public static void checkSumSign(){
        int a = 2;
        int b = -1;

        boolean result = (a + b) >= 0 ;

        if(result){
            System.out.println("Сума позитивна");
        }
        else {
            System.out.println("Сума негативна");
        }
    }

    public static void printColor(){
        int value = 1;

        if(value<=0){
            System.out.println("Червоний");
        }
        else if(0 < value && value <= 100){
            System.out.println("Жовтий");
        }
        else{
            System.out.println("Зелений");
        }
    }
    public static void compareNumbers(){
        int a = -89;
        int b = 22;

        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    public static boolean compareSum(int a, int b){
        return (a+b) >= 10 && (a+b)<= 20 ? true : false;
    }

    public static void checkSign(int num){
        if(num>=0){
            System.out.println("Додатнє");
        }
        else {
            System.out.println("Від'ємне");
        }
    }

    public static boolean getSign(int num){
        return num>= 0 ? false : true;
    }

    public static void printWordManyTimes(String word, int times){
        int counter = 0;
        while(counter < times){
            System.out.print(word);
            counter++;
        }
        System.out.println();
    }
    public static boolean checkYear(int year){

        if(year % 400 == 0){
            return true;
        }
        else if(year % 100 == 0){
            return false;
        }
        return year % 4 == 0;
    }
}
