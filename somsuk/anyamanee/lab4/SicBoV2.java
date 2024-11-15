    /*
     * this program is the program that user can play sicbo an play again if they want to 
     * by press "a" or "A" and press another key to exitl
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 27/12/2022
     */

package somsuk.anyamanee.lab4;
import java.util.Scanner;

public class SicBoV2 {
    static int choice;
    static Scanner sc = new Scanner(System.in);
    
    public static void getchoice(){
        
        System.out.println("Welcome to อัญมณี สมสุข (653040633-8) Game: ");
        System.out.println("Type 1 for choosing high or low numbers");
        System.out.println("Type 2 for choosing number between 1-6 ");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        
    }
    public static void playGame(){
        
        int d1 = 1+ (int)(Math.random() * ((6-1) + 1));
        int d2 = 1+ (int)(Math.random() * ((6-1) + 1));
        int d3 = 1+ (int)(Math.random() * ((6-1) + 1));
        if(choice==1){
            System.out.print("Type h for high and l for low: ");
            String t1 = sc.nextLine();
            t1 = sc.nextLine();
            if (t1.equalsIgnoreCase("h")){
                System.out.print("Dice 1: "+d1);
                
                System.out.print(",Dice 2: "+d2);
                
                System.out.print(",Dice 3: "+d3);
                int total=d1+d2+d3;
                System.out.println("Total is "+total);
                if (total<11){
                    System.out.println("You loose 10 Baht");
                }else{ 
                    System.out.println("You win 20 Baht");
                }
            }
            else if(t1.equalsIgnoreCase("l")){
                System.out.print("Dice 1: "+d1);
               
                System.out.print(",Dice 2: "+d2);
                
                System.out.println(",Dice 3: "+d3);
                int total=d1+d2+d3;
                System.out.println("Total is "+total);
                if (total>10){
                    System.out.println("You loose 10 Baht");
                }else{
                    System.out.println("You win 20 Baht");
                }



            }else{
                System.out.println("Incorrect input. ENter h for high and l for low only");
            }

        }
        if(choice==2){
            System.out.print("Type in the number to bet on (1-6): ");
            int b1 = sc.nextInt();
            if(b1>6){
                 System.out.println("Incorrect input. Enter between 1-6 only");
            }else {
                System.out.print("Dice 1: " + d1);
                   
                System.out.print(", Dice 2: " + d2);
                    
                System.out.println(", Dice 3: " + d3);

                if((b1==d1) && (b1==d2) && (b1==d3)){
                    System.out.println("You win 90 Baht");

                } else if ((b1==d1) || (b1==d2) || (b1==d3)) {
                    System.out.println("You win 30 Baht");

                } else if (((b1==d1) && (b1==d2)) || ((b1==d1) && (b1==d3)) || ((b1==d2) && (b1==d3))){
                    System.out.println("You win 60 Baht");
                }else{
                    System.out.println("You loose 10 Baht");
                }
                
                }
        }
        if(choice>2){
            System.out.println("Incorrect input. Enter 1 or 2 only");
        }
    }
    public static void main(String[] args) {
        getchoice();
        playGame();
        do{
            System.out.println("Press A to play again. Press other keys to exit");
            String key = sc.next();
            if(key.equalsIgnoreCase("A")){
                getchoice();
                playGame();  
            }else{
                System.out.println("Goodbye");
                break;
            }
        }while(true);
        
        sc.close();
    }
        
}
