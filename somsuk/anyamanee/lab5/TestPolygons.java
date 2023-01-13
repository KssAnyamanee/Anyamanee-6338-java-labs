package somsuk.anyamanee.lab5;

enum Polygontype {RECTANGLE , TRIANGLE};   

class  Polygon{
    double width;
    double height;
    Polygontype type;
    static int numPolygons;
    static double sumPolygonsArea;

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
        System.out.println("The number of polygons is " + Polygon.numPolygons + " or " + polygon1.numPolygons + " or " + polygon2.numPolygons);
        System.out.println("The width of polygon1 is " + polygon1.width + " the width of polygon2 is " + polygon2.width);
        System.out.println("THe sum of polygons area is " + Polygon.sumPolygonsArea);
        


    }
}

    

