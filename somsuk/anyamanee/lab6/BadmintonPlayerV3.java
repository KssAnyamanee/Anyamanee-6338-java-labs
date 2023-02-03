package somsuk.anyamanee.lab6;

public class BadmintonPlayerV3 extends BadmintonPlayerV2 implements Sprinter, BadmintonPlayable{
    public BadmintonPlayerV3(String name,double weight, Double height, Gender gender, String nationality,
    String birthdate) {
        super(name,weight,height, gender, nationality, birthdate);
    }
    
    
    protected double racketLength;
    protected int worldRanking;
    protected double speed;

    @Override
    public double getRacketLength() {
        return this.racketLength;
    }

    @Override
    public void setRacketLength(double racketLength) {
        this.racketLength = racketLength;  
    }

    @Override
    public int getWorldRanking() {    
        return this.worldRanking;
    }

    @Override
    public void setWorldRanking(int worldRanking) {
        this.worldRanking = worldRanking;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
        
    }

    @Override
    public double getSpeed() {
        return this.speed;
        
        
    }

    public String toString(){
        return super.toString() + "\n" + name + " is a Badmintonplayer whose world ranking is " + worldRanking + " and has sprint speed as " + speed;
    }

    
}
