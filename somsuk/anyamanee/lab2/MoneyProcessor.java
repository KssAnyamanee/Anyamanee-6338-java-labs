package somsuk.anyamanee.lab2;

public class MoneyProcessor {
    public static void main(String[] args) {
        if (args.length==4){
            /*
             * รับค่าinputจำนวนเเบงค์
             */
            String a = args[0];//จำนวนเเบงค์1000
            String b = args[1];//จำนวนเเบงค์500
            String c = args[2];//จำนวนเเบงค์100
            String d = args[3];//จำนวนเเบงค์20
            /*
             * เปลี่ยนประเภทของinputที่รับเข้ามาจากString->Double
             */
            double thousand = Double.parseDouble(a);
            double five_hundred = Double.parseDouble(b);
            double hundred = Double.parseDouble(c);
            double twenty = Double.parseDouble(d);
            Double total = (thousand * 10000) + (five_hundred*500) + (hundred*100) + (twenty*20);



            System.out.println("Total Money is " +total);//ปริ้นผลรวมออกมา
          
            
        }else{
            System.out.println("MoneyProseccor <# of 1,000 Baht Notes> <#of 500 Baht Notes> <#of 100 Baht Notes> <#of 20 Baht Notes>");
        } 
    }
}
