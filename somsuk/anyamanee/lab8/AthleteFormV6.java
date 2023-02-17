    /*
     * this code has instance of class OlympicSymbol which draw the Olympic symbol and put on top of the window
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 17/02/2023
     */

package somsuk.anyamanee.lab8;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import java.awt.*;

public class AthleteFormV6 extends AthleteFormV5{
    OlympicSymbol symbol;

    public AthleteFormV6(String string) {
        super(string);

    }

    public void addComponents(){
        super.addComponents();

        
        symbol = new OlympicSymbol();
        symbol.setPreferredSize(new DimensionUIResource(200,100));//set panel's size
        symbol.setBackground(Color.WHITE);


        //data panel
        dataPanel.add(symbol, BorderLayout.NORTH);


    }

    public void addMenus(){
        super.addMenus();


    }
    

    public void setFrameFeatures(){
        super.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        AthleteFormV6 msw = new AthleteFormV6("Athlete Form V6");
        msw.addComponents();
        msw.setFrameFeatures();
        msw.addMenus();
    }
    
}
