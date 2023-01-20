    /*
     * this class is extended under class Athlete so it has all the function that class Athlete has but it can also tell what spoet this is, division, golve size
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 20/01/2023
     */
package somsuk.anyamanee.lab5;

public class Boxer extends Athlete{
    static String sport = "Boxing";
    private String division;
    private String golveSize;

    public static String getSport() {
        return sport;
    }

    public static void setSport(String sport) {
        Boxer.sport = sport;
    }

    
    public String getGolveSize() {
        return golveSize;
    }

    public void setGolveSize(String golveSize) {
        this.golveSize = golveSize;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String toString(){
        return name + ", " + weight + "kg, " + height + "m, " + gender + ", " + nationality + ", " + birthdate + ", " + sport + ", " +division + ", " + golveSize ; 
    }

    public Boxer(String name, Double weight, Double height, Gender gender, String nationality,
            String birthday, String division, String golveSize) {
        super(name, weight, height, gender, nationality, birthday);
        this.division = division;
        this.golveSize = golveSize;
        
    }
    
}
