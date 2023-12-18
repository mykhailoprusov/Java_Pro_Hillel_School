package lesson_5.homework6;

public class Dog extends Animal{
    static int counterDogs = 0;
    public Dog(String name) {
        super(name);
        counterDogs++;

    }

    @Override
    public void run(int obstacleLength) {
        if(obstacleLength>=0 && obstacleLength <=500)
            super.run(obstacleLength);
        else
            System.out.println("Dog can't run that much");
    }

    @Override
    public void swim(int obstacleLength) {
        if(obstacleLength>= 0 && obstacleLength<= 10)
            super.swim(obstacleLength);
        else
            System.out.println("Dogs can't swim that much");
    }
}
