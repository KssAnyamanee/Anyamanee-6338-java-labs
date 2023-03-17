    /*
     * you can sort athlete's information by name,by height and by height and weight
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 17/03/2023
     */

package somsuk.anyamanee.lab10;

import java.awt.event.ActionEvent;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.*;

import somsuk.anyamanee.lab6.AthleteV2;

public class AthleteFormV12 extends AthleteFormV11 {

    public AthleteFormV12(String string) {
        super(string);
    }

    //sort by name
    class NameComparator implements Comparator<AthleteV2> {
        @Override
        public int compare(AthleteV2 athlete1, AthleteV2 athlete2) {
            if (athlete1.getName().compareToIgnoreCase(athlete2.getName()) < 0) {
                return -1;
            } else if (athlete1.getName().compareToIgnoreCase(athlete2.getName()) == 0) {
                return 0;
            } else {
                return 1;
            }

        }

    }

    //sort by height
    class HeightComparator implements Comparator<AthleteV2> {
        @Override
        public int compare(AthleteV2 athlete1, AthleteV2 athlete2) {
            if (athlete1.getHeight() < athlete2.getHeight()) {
                return -1;
            } else if (athlete1.getHeight() == athlete2.getHeight()) {
                return 0;
            } else {
                return 1;
            }
        }

    }

    //sort by height and weight
    class HeightWeightComparator implements Comparator<AthleteV2> {
        @Override
        public int compare(AthleteV2 athlete1, AthleteV2 athlete2) {
            if (athlete1.getHeight() < athlete2.getHeight()) {
                return -1;
            }else if (athlete1.getHeight() == athlete2.getHeight()){
                if(athlete1.getWeight() < athlete2.getWeight()){
                    return -1;
                }else if(athlete1.getWeight() == athlete2.getWeight()){
                    return 0;
                }else{
                    return 1;
                }
            }else{
                return 1;
            }
        }

    }

   @Override
   public void addListener() {
       super.addListener();
        bNameItem.addActionListener(this);
        bHeighItem.addActionListener(this);
        bHeightnWeight.addActionListener(this);
   }

   @Override
   public void actionPerformed(ActionEvent event) {
       super.actionPerformed(event);
       Object sc = event.getSource();
       if (sc == bNameItem) {
        Collections.sort(arr , new  NameComparator());
        displayAthlete();
       } else if (sc == bHeighItem) {
        Collections.sort(arr , new  HeightComparator()); 
        displayAthlete();    
       } else if (sc == bHeightnWeight) {
        Collections.sort(arr , new  HeightWeightComparator());  
        displayAthlete();
       }
   }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        AthleteFormV12 msw = new AthleteFormV12("Athlete Form V12");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListener();
        msw.setFrameFeatures();
    }
}
