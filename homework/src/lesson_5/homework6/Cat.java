package lesson_5.homework6;

public class Cat extends Animal{
    static int counterCats = 0;
    public Cat(String name) {
        super(name);
        counterCats++;

    }

    @Override
    public void run(int obstacleLength) {
        if(obstacleLength>=0 && obstacleLength <=200)
            super.run(obstacleLength);
        else
            System.out.println("Cat can't run that much");
    }

    @Override
    public void swim(int obstacleLength) {
        System.out.println("Can't swim");
    }
}
