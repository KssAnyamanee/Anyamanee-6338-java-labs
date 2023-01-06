
package somsuk.anyamanee.lab3;
import java.util.Scanner; 


public class SicBo {
    /*
     * โปรเเกรมนี้เป็นโปรเเกรมที่ให้userสามารถเล้นเกมไฮโล(sicbo)ได้
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * ให้userเลือกว่าต้องการเลือกเล่นเเบบใด
         */
        System.out.println("choose hoe do you want to bet:");
        System.out.println("Type 1 for choosing high or low numbers");
        System.out.println("Type 2 for choosing number between 1-6 ");
        System.out.print("Enter your choice: ");
        int t = sc.nextInt();
        /*
         * สุ่มลูกเต๋าทั้งสามลูก
         */
        int d1 =1+ (int)(Math.random() * ((6-1) + 1));
        int d2 =1+ (int)(Math.random() * ((6-1) + 1));
        int d3 =1+ (int)(Math.random() * ((6-1) + 1));
        
        if(t==1){ //ถ้าเลือก1
            System.out.print("Type h for high and l for low: ");//ให้userเลือกhหรือl
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
        if(t==2){
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

                } else if  (((b1==d1) && (b1==d2)) || ((b1==d1) && (b1==d3)) || ((b1==d2) && (b1==d3))){
                    System.out.println("You win 60 Baht");
                
                } 
                 else if ((b1==d1) || (b1==d2) || (b1==d3)) {
                    System.out.println("You win 30 Baht");
                }else{
                    System.out.println("You loose 10 Baht");
                }

                

               
                }
            
        
        }
        if(t>2){
            System.out.println("Incorrect input. Enter 1 or 2 only");
        }
       sc.close(); 
        
    }

    
}

