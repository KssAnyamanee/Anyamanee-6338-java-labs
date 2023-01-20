    /*
     * this class is extended under class Athlete so it has all the function that class Athlete has but it can also tell what spoet this is, racket length, world ranking
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 20/01/2023
     */

package somsuk.anyamanee.lab5;

public class BadmintonPlayer extends Athlete{
    static String sport = "Badminton";
    private double racketLength;
    private int worldRanking;

    public static String getSport() {
        return sport;
    }

    public static void setSport(String sport) {
        BadmintonPlayer.sport = sport;
    }


    public double getRacketLength() {
        return racketLength;
    }

    public void setRacketLength(double racketlength) {
        this.racketLength = racketlength;
    }


    public int getWorldRanking() {
        return worldRanking;
    }

    public void setWorldRanking(int worldRanking) {
        this.worldRanking = worldRanking;
    }

    public String toString(){
        return name + ", " + weight + "kg, " + height + "m, " + gender + ", " + nationality + ", " + birthdate + ", " + sport + ", " + racketLength + "cm, rank:" + worldRanking ; 
    }

    public BadmintonPlayer(String name, Double weight, Double height, Gender gender, String nationality,
            String birthdate, double racketLength, int worldRanking) {
        super(name, weight, height, gender, nationality, birthdate);
        this.racketLength = racketLength;
        this.worldRanking = worldRanking;
        
    }

   

    

    
}
