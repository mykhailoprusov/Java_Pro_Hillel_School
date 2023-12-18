package lesson_5.homework5;

public class Car {
    public void start(){
        System.out.println("Start method");
        startElectricity();
        startCommand();
        startFuelSystem();

    }
    private void startElectricity(){
        System.out.println("Starting electricity...");
    }
    private void startCommand(){
        System.out.println("Start command...");
    }

    private void startFuelSystem(){
        System.out.println("Starting fuel system...");
    }
}
