package lesson_5.homework6;

public class Checker {
    public static void main(String[] args) {
        Animal an1 = new Animal("Jack");
        System.out.println(Animal.counter);

        Animal an2 = new Animal("Jack2");
        System.out.println(Animal.counter);

        an1.run(1000);
        an1.swim(150);
        an2.swim(200);

        Cat cat = new Cat("Maria");
        System.out.println(Animal.counter);
        System.out.println(Cat.counterCats);

        cat.swim(200);
        cat.run(201);
        cat.run(100);

        Dog dog = new Dog("Black");
        System.out.println(Animal.counter);
        System.out.println(Dog.counterDogs);

        dog.swim(500);
        dog.swim(5);
        dog.run(300);
        dog.run(1000);
    }
}
