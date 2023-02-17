    /*
     * this code has instance of class ReadImage which read the image file and put image in the window.
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 17/02/2023
     */

package somsuk.anyamanee.lab8;

import java.awt.*;
import javax.swing.*;


public class AthleteFormV7 extends AthleteFormV6{
    ReadImage image;
    protected JPanel imgPanel;

    public AthleteFormV7(String string) {
        super(string);
        
    }

    public void addComponents(){
        super.addComponents();
        
        image = new ReadImage();
        image.setPreferredSize(new Dimension(400, 300));//set size 

        imgPanel = new JPanel(new BorderLayout());
        imgPanel.add(image);
        
        sliderPanel.add(imgPanel, BorderLayout.CENTER);
       
        mainPanel.add(sliderPanel, BorderLayout.SOUTH);

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
        AthleteFormV7 msw = new AthleteFormV7("Athlete Form V7");
        msw.addComponents();
        msw.setFrameFeatures();
        msw.addMenus();
    }
    
}
