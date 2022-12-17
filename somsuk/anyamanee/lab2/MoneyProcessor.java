package somsuk.anyamanee.lab2;

public class MoneyProcessor {
    public static void main(String[] args) {
        if (args.length==4){
            String a = args[0];
            String b = args[1];
            String c = args[2];
            String d = args[3];
            double thousand = Double.parseDouble(a);
            double five_hundred = Double.parseDouble(b);
            double hundred = Double.parseDouble(c);
            double twenty = Double.parseDouble(d);
            Double total = (thousand * 10000) + (five_hundred*500) + (hundred*100) + (twenty*20);



            System.out.println("Total Money is " +total);
          
            
        }else{
            System.out.println("MoneyProseccor <# of 1,000 Baht Notes> <#of 500 Baht Notes> <#of 100 Baht Notes> <#of 20 Baht Notes>");
        } 
    }
}
