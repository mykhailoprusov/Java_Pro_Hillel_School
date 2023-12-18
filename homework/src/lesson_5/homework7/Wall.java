package lesson_5.homework7;

public class Wall implements Obstacle{
    public int height;


    public Wall(int height){
        this.height = height;
    }
    @Override
    public boolean overcome(Participant participant) {
        if(height>= participant.getJumpRestriction()){
            return false;
        }
        return true;
    }
}
