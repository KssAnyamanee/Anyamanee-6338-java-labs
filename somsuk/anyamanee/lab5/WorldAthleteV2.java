    /*
     * this is the program that not only can store and tell name, weight, height, gender, nationality, birthdate of the athlete that you want 
     * but also can compare age and height
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 20/01/2023
     */

package somsuk.anyamanee.lab5;


public class WorldAthleteV2 { //compare height
    static boolean isTaller(Athlete athleteA, Athlete athleteB){
        if(athleteA.height > athleteB.height){
            return true;
        }else{
            return false;
        }


    }
    public static void main(String[] args) {
        BadmintonPlayer ratchanok = new BadmintonPlayer("Ratchanok Intanon", 55.0, 1.68, Athlete.Gender.FEMALE, "Thai", "05/02/1995" , 66.5 , 4 );
        Footballer tom = new Footballer("Tom Brady" , 102.0 , 1.93 , Athlete.Gender.MALE , "American" , "03/08/1977" , "Quarterback" , "New England Patriots" );
        Boxer wisaksil = new Boxer("Wisaksil Wangek" , 51.5 , 1.60 , Athlete.Gender.MALE , "Thai" , "08/12/1986" , "Super Flyweight" , "M" );
        System.out.println(ratchanok);
        System.out.println(wisaksil);
        System.out.println(tom);
        BadmintonPlayer nitchaon = new BadmintonPlayer("Nitchanon Jindapol", 52.0,  1.63, Athlete.Gender.FEMALE, "Thailand" , "31/03/1998" , 67 , 11);
        System.out.println("Both " + ratchanok.getName() + " and " + nitchaon.getName() + " play " + BadmintonPlayer.getSport());
        ratchanok.compareAge(tom);
        ratchanok.compareAge(nitchaon);

        if(isTaller(wisaksil, tom)){
            System.out.println(wisaksil.getName() + " is taller than " + tom.getName());
        }else{
            System.out.println(wisaksil.getName() + " is not taller than " + tom.getName());
        }

        
    }
    
}
