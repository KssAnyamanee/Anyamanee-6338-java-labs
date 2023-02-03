    /*
     * this program will tell you about the athlete's information such as name,weight,height,gender,nationality,birthdate,racket legth,world ranking
     * 
     * this program extends lab5 and use code from interface BadmintonPlayable,Spinter and class BadmintonPlayerV3 
     * which is a subclass of BadmintonPlayerV2
     * 
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 03/02/2023
     */


package somsuk.anyamanee.lab6;
import somsuk.anyamanee.lab5.*;
import java.util.*;

public class WorldAthleteV4 {
    public static void main(String[] args) {
        BadmintonPlayerV3 akane = new BadmintonPlayerV3("Akane Yamaguchi", 55.0, 1.68, Athlete.Gender.FEMALE, "Japan", "05/02/1997");
        BadmintonPlayerV3 ratchanok = new BadmintonPlayerV3("Ratchanok Intanon", 55.0, 1.68, Athlete.Gender.FEMALE, "Thai", "05/02/1995");
        akane.setWorldRanking(1);
        ratchanok.setWorldRanking(6);
        akane.setSpeed(4);
        ratchanok.setSpeed(6);
        ArrayList<BadmintonPlayerV3> badmintonPlayers = new ArrayList<BadmintonPlayerV3>();
        badmintonPlayers.add(akane);
        badmintonPlayers.add(ratchanok);
        for(BadmintonPlayerV3 badmintonPlayer : badmintonPlayers){
            System.out.println(badmintonPlayer);
        } 
    }
    
}
