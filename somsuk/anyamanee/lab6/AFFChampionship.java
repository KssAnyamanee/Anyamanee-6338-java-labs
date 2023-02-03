package somsuk.anyamanee.lab6;

import java.util.ArrayList;

public class AFFChampionship extends Competition{
    protected String teamA;
    protected String teamB;

    public String getTeamA() {
        return this.teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return this.teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public  AFFChampionship(String name , String region , String teamA , String teamB){
        this.name = name;
        this.region = region;
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public AFFChampionship(String name, String teamA, String teamB){
        this.name = name;
        this.teamA = teamA;
        this.teamB = teamB;
    }
    
    public String toString(){
        return name + " in the final was the game between " + teamA + " vs. " + teamB + ".";
    }

    public void setPlaces(ArrayList<String> places) {
        System.out.println(name + " plays at these stadiums ");
        System.out.println(places);
    }
    
    
    @Override
    void setDescription() {
        
    }
    
    @Override
    void setSponsorship(ArrayList<String> sponsors) {
        if(sponsors.size() == 1){
            System.out.println(sponsors.get(0) + " is a sponsors of " + name);
        }else{
            System.out.println("Sponsors of " + name + " are " + sponsors);
            
        }
    }


}
