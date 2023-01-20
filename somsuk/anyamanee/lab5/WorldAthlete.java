    /*
     * this is the program that can store and tell name, weight, height, gender, nationality, birthdate of the athlete that you want
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 20/01/2023
     */

package somsuk.anyamanee.lab5;

import somsuk.anyamanee.lab5.Athlete.Gender;

public class WorldAthlete{
    public static void main(String[] args) {
        Athlete ratchanok = new Athlete("Ratchanok Intanon" , 55.0 , 1.68 , Gender.FEMALE , "THai" , "05/02/1995" );
        Athlete wisaksil = new Athlete("Wisaksil Wangek", 51.5, 1.60 , Gender.MALE, "Thai" , "08/12/1986");
        Athlete tom = new Athlete("Tom Bready", 102.0, 1.93, Gender.MALE, "American", "03/08/1977");
        System.out.println(ratchanok.getName() + "'s height is " + ratchanok.getHeight());
        ratchanok.setHeight(1.70);
        System.out.println(ratchanok.getName() + "'s height has increaded to " + ratchanok.getHeight());
        System.out.println(ratchanok);
        System.out.println(wisaksil);
        System.out.println(tom);

        
    }
}
