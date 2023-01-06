package somsuk.anyamanee.lab2;


public class Footballer {
    public static void main(String[] args) {

        if (args.length == 3){

         String footballer_name = args[0]; //รับค่าชื่อนักฟุตบอล
         String nationality = args[1]; //รับค่าสัญชาติ
         String club_name = args[2]; //รับค่าทีมที่นักฟุตบอลที่ผู้เล่นคนนั้นอยู่
         System.out.println("my favorite football player is "+ footballer_name); 
         System.out.println("His nationallity is " + nationality);
         System.out.println("He plays for " + club_name);
        }

        else {
            System.out.println("Usage: Footballer <footballer name> <nationality> <club name>");
        }
        

         
        
        System.out.println();






    }

}