package lesson_5.homework6;

public class Animal {
    static int counter = 0;
    String name;
    public Animal(String name){
        this.name = name;
        counter++;
    }

    public void run(int obstacleLength){
        System.out.println(String.format("%s пробіг %d м",name,obstacleLength));
    }

    public void swim(int obstacleLength){
        System.out.println(String.format("%s проплив %d м",name,obstacleLength));
    }


}
