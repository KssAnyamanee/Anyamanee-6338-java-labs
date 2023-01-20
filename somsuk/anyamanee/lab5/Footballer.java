    /*
     * this class is extended under class Athlete so it has all the function that class Athlete has but it can also tell what spoet this is, position, team name
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 20/01/2023
     */
package somsuk.anyamanee.lab5;

public class Footballer extends Athlete{
    static String sport = "American Football";
    private String position;
    private String team;

    public static String getSport() {
        return sport;
    }

    public static void setSport(String sport) {
        Footballer.sport = sport;
    }

    
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String toString(){
        return name + ", " + weight + "kg, " + height + "m, " + gender + ", " + nationality + ", " + birthdate + ", " + sport + ", " + position + ", " + team ; 
    }

    public Footballer(String name, Double weight, Double height, Gender gender, String nationality,
            String birthdate, String position, String team) {
        super(name, weight, height, gender, nationality, birthdate);
        this.position = position;
        this.team = team;
        
    }


    
}
