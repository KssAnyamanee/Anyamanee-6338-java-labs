package somsuk.anyamanee.lab8;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class OlympicSymbol extends JPanel{
    protected Ellipse2D.Double circle1, circle2, circle3, circle4, circle5;


    public void paintComponent(Graphics g){
        circle1 = new Ellipse2D.Double(10,10,50,50);
        circle2 = new Ellipse2D.Double(60,10,50,50);
        circle3 = new Ellipse2D.Double(110,10,50,50);
        circle4 = new Ellipse2D.Double(35,35,50,50);
        circle5 = new Ellipse2D.Double(85,35,50,50);

        Graphics2D graphic = (Graphics2D)g;
        graphic.setStroke(new BasicStroke(5));

        //circle1
        graphic.setColor(Color.BLUE);
        graphic.draw(circle1);


        //circle2
        graphic.setColor(Color.RED);
        graphic.draw(circle2);

        //circle3
        graphic.setColor(Color.YELLOW);
        graphic.draw(circle3);

        //circle4
        graphic.setColor(Color.GREEN);
        graphic.draw(circle4);

        //circle5
        graphic.setColor(Color.BLACK);
        graphic.draw(circle5);

    }
    
}
