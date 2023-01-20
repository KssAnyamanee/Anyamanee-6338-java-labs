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
