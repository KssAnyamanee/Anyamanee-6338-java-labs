    /*
     * this program is the program that user can play sicbo and get the result summary if user wants to play again
     * they can press "a" or "A" and they can press another key to exit
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 27/12/2022
     */

package somsuk.anyamanee.lab4;
import java.util.Scanner;

public class SicBoV4 {
    static int choice;
    static int b2;
    static String choiceletter;
    final static int MAX_INPUT = 100;
    static String[] gamePlay = new String [MAX_INPUT];
    static String[] gameResult = new String[MAX_INPUT];
    static int currentInput = 0;
    static int round = 0;
    static Scanner sc = new Scanner(System.in);
    
    public static void getchoice(){
        while(true){
            System.out.println("Type 1 for choosing high or low numbers");
            System.out.println("Type 2 for choosing number between 1-6 ");
            System.out.print("Enter your choice: ");
            String x = sc.nextLine();
            if(x.equals("1") || (x.equals("2"))){
                choice = Integer.parseInt(x);
                break;
            }else{
                System.out.println("Enter 1 or 2 only");
                continue;
            }
        }
    }
    public static void playGame(){
        
        int d1 = 1+ (int)(Math.random() * ((6-1) + 1));
        int d2 = 1+ (int)(Math.random() * ((6-1) + 1));
        int d3 = 1+ (int)(Math.random() * ((6-1) + 1));
        if(choice==1){ 
            while(true){
                System.out.print("Type h for high and l for low: ");
                String t1 = sc.nextLine();
                gamePlay[currentInput]=t1;
                if (t1.equalsIgnoreCase("h")){
                    System.out.print("Dice 1: "+d1);
                
                    System.out.print(",Dice 2: "+d2);
                
                    System.out.print(",Dice 3: "+d3);
                    int total=d1+d2+d3;
                    System.out.println("\nTotal is "+total);
                    if (total<11){
                        System.out.println("You loose 10 Baht"); 
                        gameResult[currentInput]="You loose 10 Baht";
                        
                    }else{ 
                        System.out.println("You win 20 Baht");
                        gameResult[currentInput]="You win 20 Baht";
                    }
                    break;
                }
                else if(t1.equalsIgnoreCase("l")){
                    System.out.print("Dice 1: "+d1);
               
                    System.out.print(",Dice 2: "+d2);
                
                    System.out.println(",Dice 3: "+d3);
                    int total=d1+d2+d3;
                    System.out.println("Total is "+total);
                    if (total>10){
                        System.out.println("You loose 10 Baht");
                        gameResult[currentInput]="You loose 10 Baht";
                    }else{
                        System.out.println("You win 20 Baht");
                        gameResult[currentInput]="You win 20 Baht";
                    }
                    break;
                }else{
                    System.out.println(" Incorrect input. Enter h for high and l for low only");
                    continue;
                }

        }
        currentInput++;
    }
        if(choice==2){
            while(true){
                System.out.print("Type in the number to bet on (1-6): ");
                String b1 = sc.nextLine();
                gamePlay[currentInput]=b1;
                if(b1.equals("1") || b1.equals("2") || b1.equals("3") || b1.equals("4") || b1.equals("5") || b1.equals("6")){ 
                    System.out.print("Dice 1: " + d1);
                   
                    System.out.print(", Dice 2: " + d2);
                
                    System.out.println(", Dice 3: " + d3);

                    if((b2==d1) && (b2==d2) && (b2==d3)){
                        System.out.println("You win 90 Baht");
                        gameResult[currentInput]="You win 90 Baht";

                    } else if ((b2==d1) || (b2==d2) || (b2==d3)) {
                        System.out.println("You win 30 Baht");
                        gameResult[currentInput]="You win 30 Baht";

                    } else if (((b2==d1) && (b2==d2)) || ((b2==d1) && (b2==d3)) || ((b2==d2) && (b2==d3))){
                        System.out.println("You win 60 Baht");
                        gameResult[currentInput]="You win 60 Baht";
                    
                    }else{
                        System.out.println("You loose 10 Baht");
                        gameResult[currentInput]="You loose 10 Baht";
                    
                    }break;
                }else{
                    System.out.println("Incorrect input. Enter between 1-6 only");
                    continue;
                }
            }
            currentInput++;
        }
        if(choice>2){
            System.out.println("Incorrect input. Enter 1 or 2 only");
        }
    
    }
    public static void main(String[] args) {
        System.out.println("Welcome to อัญมณี สมสุข (653040633-8) Game: ");
        getchoice();
        playGame();
        while(true){
            System.out.println("Press A to play again. Press other keys to exit : ");
            String key = sc.nextLine();
            if(key.equalsIgnoreCase("A")){
                getchoice();
                playGame();  
                continue;
                
            }else{
                System.out.println(" ");
                break;
            }
        }
        System.out.println("### Game Play Summary ###");
        while(true){
            for(int i = 0; i<currentInput; i++ ){
                System.out.println("Game " +i+ " :");
                System.out.println("You have bet on "+gamePlay[i]);
                System.out.println(gameResult[i]);
            }
            sc.close();
            System.out.println("Goodbye");
            break;
        }
    }
    
}

