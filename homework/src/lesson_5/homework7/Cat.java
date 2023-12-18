package lesson_5.homework7;

public class Cat implements Participant{
    public int runRestriction;
    public int jumpRestriction;
    public String name;

    public Cat(String name, int runR, int jumpR){
        this.runRestriction = runR;
        this.jumpRestriction = jumpR;
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Running...");
    }

    @Override
    public void jump() {
        System.out.println("Jumping...");
    }

    @Override
    public int getRunRestriction() {
        return runRestriction;
    }

    @Override
    public int getJumpRestriction() {
        return jumpRestriction;
    }

    @Override
    public String getName() {
        return name;
    }
}
