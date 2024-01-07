package lesson_8;

public class App {
    public static void main(String[] args) {
        StringArray arr1 = new StringArray();

        Collection arr2 = new StringArray();

        arr1.add("Hello");
        arr1.add("My");
        arr1.add("Name");
        arr1.add("is");
        arr1.add("Mykhailo");


        arr2.add("Hello");
        arr2.add("My");
        arr2.add("Name");
        arr2.add("j");
        arr2.add("Mykhailo");

        System.out.println(arr2.contain("Hello"));
        System.out.println(arr2.contain("Hell"));

        System.out.println(arr1.equals(arr2));

        System.out.println(arr2.size());

        arr1.clear();
        arr1.printArray();






    }
}
