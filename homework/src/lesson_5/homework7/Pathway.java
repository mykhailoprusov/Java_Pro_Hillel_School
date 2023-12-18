package lesson_5.homework7;

public class Pathway implements Obstacle{
    public int length;

    public Pathway(int length){

        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {

        if(length >= participant.getRunRestriction()){
            return false;
        }
        else{
            return true;
        }
    }

    public int getLength() {
        return length;
    }
}
