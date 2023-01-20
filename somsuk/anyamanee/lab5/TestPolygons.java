    /*
     * this program is the program that can calculate the Area of rectangle and triangle
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 20/01/2023
     */
package somsuk.anyamanee.lab5;

enum Polygontype {RECTANGLE , TRIANGLE};   

class  Polygon{ 
    double width;
    double height;
    Polygontype type;
    static int numPolygons;
    static double sumPolygonsArea;

    /*this method will calculate the area if it's rectangle the program will
    * will return width * hight
    * if it's triangle the program will return (width * height)/2
    */
    public double getArea(){ 
        if(type == Polygontype.RECTANGLE){
            return width * height;
        }else{
            return (width * height)/2;
        }   
    }
    public static void setNumPolygons(int numNewPolygons){
        numPolygons += numNewPolygons;
    }
    public static void setSumPolygonsArea(Double sumNewPolygonsArea){
        sumPolygonsArea += sumNewPolygonsArea;
    }
}    

public class TestPolygons {
    public static void main(String[] args) {
        Polygon polygon1 = new Polygon();
        polygon1.width = 2;
        polygon1.height = 3;
        polygon1.type = Polygontype.RECTANGLE;
        Polygon.setNumPolygons(1);
        Polygon.setSumPolygonsArea(polygon1.getArea());
        Polygon polygon2 = new Polygon();
        polygon2.width = 3;
        polygon2.height = 4;
        polygon2.type = Polygontype.TRIANGLE;
        Polygon.setNumPolygons(1);
        Polygon.setSumPolygonsArea(polygon2.getArea());
        System.out.println("The number of polygons is " + Polygon.numPolygons + " or " + Polygon.numPolygons + " or " + Polygon.numPolygons);
        System.out.println("The width of polygon1 is " + polygon1.width + " the width of polygon2 is " + polygon2.width);
        System.out.println("THe sum of polygons area is " + Polygon.sumPolygonsArea);
        


    }
}

    

