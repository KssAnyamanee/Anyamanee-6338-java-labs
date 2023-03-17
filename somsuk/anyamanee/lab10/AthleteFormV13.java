    /*
     * this app will detect that you put weight over 200 kg or not and you put height over 300 cm or not and user can only put double in weight and
     * height textfield  
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 17/03/2023
     */

package somsuk.anyamanee.lab10;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class AthleteFormV13 extends AthleteFormV12 {

    private static double MAX_HEIGHT = 300.0;
    private static double MAX_WEIGHT = 200.0;
    protected double weight;
    protected double height;

    public AthleteFormV13(String string) {
        super(string);
    }

    @Override
    public void addAthlete() {
        getValues();
        weight = getValidNumber(weightTxtField, "Weight", MAX_WEIGHT);
        if (weight == -1) {
            return;
        }
        height = getValidNumber(heightTxtField, "Height", MAX_HEIGHT);
        if (height == -1) {
            return;
        }
        super.addAthlete();
    }

    public double getValidNumber(JTextField numberTxt, String txt, Double max) {
        try {
            double weightnheight = Double.parseDouble(numberTxt.getText());
            if (weightnheight < 0) {
                JOptionPane.showMessageDialog(this, txt + " should be greater than 0");
                return -1;
            } else if (weightnheight > max) {
                JOptionPane.showMessageDialog(this, txt + " should be less than " + max);
                return -1;
            } else {
                return weightnheight;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for " + txt);
            return -1;
        }

    }

    protected void notifyNumberTxtFieldchange(JTextField txtField) {
        if (txtField == weightTxtField) {
            weight = getValidNumber(weightTxtField, "Weight", MAX_WEIGHT);
        } else if (txtField == heightTxtField) {
            height = getValidNumber(heightTxtField, "Height", MAX_HEIGHT);
        }
    }
   
    @Override
    public void actionPerformed(ActionEvent event) {
         Object sc = event.getSource();
         if (sc == weightTxtField && getValidNumber(weightTxtField, "Weight", MAX_WEIGHT) == -1) {

         } else if (sc == heightTxtField && getValidNumber(heightTxtField, "Height", MAX_HEIGHT) == -1) {

         } else {
            super.actionPerformed(event);

         }
     }

    @Override
    public void addListener() {
        super.addListener();
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        AthleteFormV13 msw = new AthleteFormV13("Athlete Form V13");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListener();
        msw.setFrameFeatures();
    }

}
