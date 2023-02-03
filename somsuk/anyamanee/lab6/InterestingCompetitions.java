    /*
     * this program can tell you when was the game,team and the sponsor of the game that year
     * 
     * this program uses code from class AFFChampionship which is subclass of Competition and uses code feom class
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 03/02/2023
     */


package somsuk.anyamanee.lab6;

import java.util.ArrayList;

public class InterestingCompetitions {
    public static void main(String[] args) {
        AFFChampionship aff2022 = new AFFChampionship("AFF 2022" , "Thailand" , "Vietnam");
        AFFChampionship aff2020 = new AFFChampionship("AFF 2020" , "Thailand" , "Indonesia");
        System.out.println(aff2020);
        System.out.println(aff2022);

        ArrayList<String> places = new ArrayList<String>();
        places.add("Hanoi");
        places.add("Bangkok");
        aff2022.setPlaces(places);
        ArrayList<String> sponsors = new ArrayList<String>();
        sponsors.add("Mitsubishi Electronics");
        aff2022.setSponsorship(sponsors);


        places.remove("Hanoi");
        places.add("Kallang");
        aff2020.setPlaces(places);
        sponsors.remove("Mitsubishi Electronics");
        sponsors.add("Suzuki");
        sponsors.add("Yanmar");
        aff2020.setSponsorship(sponsors);
    }
    
}
