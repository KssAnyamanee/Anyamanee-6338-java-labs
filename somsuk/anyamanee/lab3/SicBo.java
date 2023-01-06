
package somsuk.anyamanee.lab3;
import java.util.Scanner; 


public class SicBo {
    /*
     * โปรเเกรมนี้เป็นโปรเเกรมที่ให้userสามารถเล้นเกมไฮโล(sicbo)ได้
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 27/12/2022
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
            System.out.print("Type h for high and l for low: ");
            String t1 = sc.nextLine();//ให้userเลือกhหรือl
            t1 = sc.nextLine();
            //ถ้าเลือกh
            if (t1.equalsIgnoreCase("h")){
                System.out.print("Dice 1: "+d1);
                
                System.out.print(",Dice 2: "+d2);
                
                System.out.print(",Dice 3: "+d3);
                int total=d1+d2+d3;//นำค่าลูกเต่าทั้ง3ลูกมาบวกกัน
                System.out.println("Total is "+total);
                if (total<11){
                    System.out.println("You loose 10 Baht");
                }else{ 
                    System.out.println("You win 20 Baht");
                }
            }
            //ถ้าเลือกl
            else if(t1.equalsIgnoreCase("l")){
                System.out.print("Dice 1: "+d1);
               
                System.out.print(",Dice 2: "+d2);
                
                System.out.println(",Dice 3: "+d3);
                int total=d1+d2+d3;//นำค่าลูกเต่าทั้ง3ลูกมาบวกกัน
                System.out.println("Total is "+total);
                if (total>10){
                    System.out.println("You loose 10 Baht");
                }else{
                    System.out.println("You win 20 Baht");
                }



            }else{
                System.out.println("Incorrect input. Enter h for high and l for low only");//ถ้าinputอย่างอื่นนอกจากhหรือl
            }

        }
        if(t==2){//ถ้าเลือก2
            System.out.print("Type in the number to bet on (1-6): ");
            int b1 = sc.nextInt();//รับค่าตัวเลข1-6
            if(b1>6){
                 System.out.println("Incorrect input. Enter between 1-6 only");
            }else {
                System.out.print("Dice 1: " + d1);
                   
                System.out.print(", Dice 2: " + d2);
                    
                System.out.println(", Dice 3: " + d3);

                if((b1==d1) && (b1==d2) && (b1==d3)){  //ถ้าลูกเต๋าทั้ง3ลูกออกมาเลขตรงกับที่inputจะได้เงิน90บาท
                    System.out.println("You win 90 Baht");

                } else if  (((b1==d1) && (b1==d2)) || ((b1==d1) && (b1==d3)) || ((b1==d2) && (b1==d3))){//ถ้าลูกเต๋า2ลูกออกมาเลขตรงกับที่inputจะได้เงิน60บาท
                    System.out.println("You win 60 Baht");
                
                } 
                 else if ((b1==d1) || (b1==d2) || (b1==d3)) {  //ถ้าลูกเต๋าทั้ง1ลูกออกมาเลขตรงกับที่inputจะได้เงิน30บาท
                    System.out.println("You win 30 Baht");
                }else{
                    System.out.println("You loose 10 Baht"); //ถ้าไม่มีลูกเต๋าออกมาตรงกับเลขที่input
                }
            }
        }
        if(t>2){ //ถ้าinputอย่างอื่นที่ไม่ใช่1หรือ2
            System.out.println("Incorrect input. Enter 1 or 2 only");
        }
       sc.close(); 
        
    }

    
}

