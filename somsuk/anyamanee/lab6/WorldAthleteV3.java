    /*
     * this program will tell you about the athlete's information such as name,weight,height,gender,nationality,birthdate and also tell 
     * how many kilometers the athlete has run and other practice program 
     * 
     * this program extends lab5 and use code from class AthleteV2 and subclasses of AthleteV2
     * which are FootballerV2,BoxerV2,BadmintonV2
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 03/02/2023
     */



package somsuk.anyamanee.lab6;

import java.util.ArrayList;

import somsuk.anyamanee.lab5.Athlete;

public class WorldAthleteV3 {
    public static void main(String[] args) {
        ArrayList<AthleteV2> athletes = new ArrayList<AthleteV2>();
        BadmintonPlayerV2 ratchanok = new BadmintonPlayerV2("Ratchanok Intanon", 55.0, 1.68, Athlete.Gender.FEMALE, "Thai", "05/02/1995");
        FootballerV2 tom = new FootballerV2("Tom Brady", 102.0, 1.93 , Athlete.Gender.MALE, "American", "05/02/1995" );
        BoxerV2 wisakil = new BoxerV2("Wisaksil Wangek", 51.5 , 1.60 , Athlete.Gender.MALE, "Thai", "08/12/1986");
        athletes.add(ratchanok);
        athletes.add(tom);
        athletes.add(wisakil);

        for (AthleteV2 athlete : athletes){
            System.out.println(athlete);
            athlete.practice();
        }
    }
    
}
