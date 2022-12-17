package somsuk.anyamanee.lab2;

public class StringAPI {
    public static void main(String[] args) {
       String schoolname = args[0];//รับค่าinputชื่อโรงเรียน
       String check = schoolname.toLowerCase();//เเปลงinputที่รับเข้ามาให้เป็นตัวเล็ก
        
       if (check.contains("university")){
        System.out.println(schoolname+" is a university");
       } 
       else if(check.contains("college")){
        System.out.println(schoolname+" is a callege");
       }else{
        System.out.println(schoolname+" is neither university nor collage");
       }

       
       
        
       

    }
    
}
