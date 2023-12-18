package lesson_5.homework7;

public class Human implements Participant{
    public int runRestriction;
    public int jumpRestriction;
    public String name;

    public Human(String name, int runR, int jumpR){
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

    public int getRunRestriction() {
        return runRestriction;
    }

    public int getJumpRestriction() {
        return jumpRestriction;
    }

    public String getName() {
        return name;
    }
}
