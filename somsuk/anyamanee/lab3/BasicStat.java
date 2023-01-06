package somsuk.anyamanee.lab3;
import java.util.Arrays;
import java.util.Scanner;
public class BasicStat {
    public static void main(String[] args) {
        /*
         * โปรเเกรมนี้เป็นโปรเเกรมคำนวณค่าสถืตืต่างๆ
         * Author: Anyamanee Somsuk
         * ID: 653040633-8
         * sec: 1
         * Date: 27/12/2022
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (seperated by space): ");
        String input = sc.nextLine();
        String n1[] = input.split(" ");//split input เพราะว่าinputเป็นstringจะได้เอาไปใส่ในarrayได้
        int n2 = n1.length;//นับจำนวนในarray
        sc.close();
        
        if(input.isEmpty()){
            System.out.println("Please enter at least one number ");
        }
        else if (n2 > 10){
            System.out.println("your maximum input is 10 numbers");
        }else{
            double n3[] =new double[n2];//เเปลงจากstringเป็นdouble
            double sum = 0;
            double med = 0;
            for (int i =0 ; i<n2; i++){
                n3 [i] = Double.parseDouble(n1[i]);
                sum+= n3[i];//นำinputมาบวกกันเพื่อที่จะนำไปคำนวณหาaverage
            }
            /*
             * เรียงลำดับเลขจากน้อยไปมาก
             */
            Arrays.sort(n3);
            System.out.print("Sorted number are ");
            for (int i =0 ; i<n2; i++){
                System.out.print(n3[i]+ " ");
                }
            
            System.out.println("\nMinimum: "+ String.format("%.2f", n3[0]));
            System.out.println("Maximum: "+ String.format("%.2f" , n3[n2-1]));
            System.out.println("Average: "+String.format("%.2f" , (sum/n2)));
            //หาค่าmedian
            if(n2%2==1){
                med = n3[(n2+1)/2-1];//ถ้าinputคี่จำนวนจะใช้คำสั่งนี้ในการหาmedian
            }else{
                med = (n3[n2/2-1]+n3[n2/2])/2;//ถ้าinputคู่จำนวนจะใช้คำสั่งนี้ในการคำนวนหาmedian
            }
            System.out.println("Median: "+String.format("%.2f" , med));

            //หาค่าstandard diviation
            double sd = 0;
            for (int i =0 ; i<n2; i++){
                double standard = (n3[i]-(sum/n2))*(n3[i]-(sum/n2));
                sd+=standard;

            }
            System.out.println("Standard Diviation: "+String.format("%.2f" , Math.sqrt(sd/n2)));
        }
    }   
}
