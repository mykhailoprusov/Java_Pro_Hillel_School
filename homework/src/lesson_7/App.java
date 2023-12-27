package lesson_7;

public class App {
    public static void main(String[] args) {
        StringArray arr1 = new StringArray();

        System.out.println("1.........");
        arr1.add("Hello");
        arr1.add(","); // 1)
        arr1.printArray();

        System.out.println("2.........");
        boolean r = arr1.add(5,"Andrew"); //2)
        System.out.println(r);
        arr1.printArray();

        System.out.println("3.........");

        arr1.add(1,"Andrew"); // 3)
        arr1.add(3,"I");
        arr1.printArray();

        System.out.println("4.........");

        arr1.add("Love"); // 4)
        arr1.add("You");
        arr1.printArray();

        System.out.println("5.........");

        System.out.println(arr1.get(3));

        System.out.println("6.........");

        System.out.println(arr1.nextElem);
        arr1.delete(1); //6)
//        arr1.delete(3);
        arr1.printArray();

        System.out.println("7........");

        arr1.delete("I"); // 7)
        arr1.printArray();

        System.out.println("8........");

        arr1.delete("Love"); // 8)
        arr1.delete(",");
        arr1.printArray();




    }
}
