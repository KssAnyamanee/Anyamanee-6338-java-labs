    /*
     * this is the program that will show you the window that has form in there and you can fill your name, weight, height, dste of birth, choose gender,
     * nationality, sport, write something that you want on your bio, cam tell your age by slide the slider, you can choose your hobby and sport. 
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 17/02/2023
     */

package somsuk.anyamanee.lab8;

import javax.swing.*;
import java.awt.*;

import somsuk.anyamanee.lab7.AthleteFormV3;

public class AthleteFormV4 extends AthleteFormV3 {
    protected JLabel hobbiesLabel, yoeitsLabel;
    protected JCheckBox readingBox, gardenBox, watchBox, shoppingBox, othersBox;
    protected JSlider slider1;
    protected JPanel dataPanel, hbPanel, hobbiesPanel, sliderstructurePanel, sliderPanel;
    protected ButtonGroup hbButtonGroup;

    @Override
    public void addComponents(){
        super.addComponents();

        //
        hobbiesLabel = new JLabel("Hobbies");
        readingBox = new JCheckBox("Reading");
        gardenBox = new JCheckBox("Gardening");
        watchBox = new JCheckBox("Watching movies", true);
        shoppingBox = new JCheckBox("Shopping");
        othersBox = new JCheckBox("Others");

        //group button
        hbButtonGroup = new ButtonGroup();
        hbButtonGroup.add(readingBox);
        hbButtonGroup.add(gardenBox);
        hbButtonGroup.add(watchBox);
        hbButtonGroup.add(shoppingBox);
        hbButtonGroup.add(othersBox);

        hobbiesPanel = new JPanel();
        hobbiesPanel.add(readingBox);
        hobbiesPanel.add(gardenBox);
        hobbiesPanel.add(watchBox);
        hobbiesPanel.add(shoppingBox);
        hobbiesPanel.add(othersBox);

        //hbpanel
        hbPanel = new JPanel(new BorderLayout());
        hbPanel.add(hobbiesLabel, BorderLayout.NORTH);
        hbPanel.add(hobbiesPanel, BorderLayout.SOUTH);

        //datapanel
        dataPanel = new JPanel(new BorderLayout());
        dataPanel.add(infoPanel, BorderLayout.CENTER);
        dataPanel.add(hbPanel, BorderLayout.SOUTH);
        mainPanel.add(dataPanel, BorderLayout.NORTH);

        //sliderpanel
        slider1 = new JSlider(0,20,0);
        slider1.setMajorTickSpacing(5);
        slider1.setMinorTickSpacing(1);
        slider1.setPaintTicks(true);
        slider1.setPaintTrack(true);
        slider1.setPaintLabels(true);

        yoeitsLabel = new JLabel("Year of experience in this spot");
        sliderstructurePanel = new JPanel(new BorderLayout());
        sliderstructurePanel.add(yoeitsLabel, BorderLayout.NORTH);
        sliderstructurePanel.add(slider1, BorderLayout.SOUTH);

        sliderPanel = new JPanel(new BorderLayout());
        sliderPanel.add(sliderstructurePanel, BorderLayout.NORTH);
        sliderPanel.add(buttonPanel, BorderLayout.SOUTH);

        mainPanel.add(sliderPanel, BorderLayout.SOUTH);

    }

    public void setFrameFeatures(){
        super.setFrameFeatures();
    }


    public AthleteFormV4(String string) {
        super(string);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        AthleteFormV4 msw = new AthleteFormV4("Athlete Form V4");
        msw.addComponents();
        msw.setFrameFeatures();
        msw.addMenus();

    }

}
