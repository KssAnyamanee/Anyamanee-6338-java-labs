   /*
     * this code is to change font and color of the program and set tooltip but all the fuctions are still same as AtheleteFormV4
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 17/02/2023
     */


package somsuk.anyamanee.lab8;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV5 extends AthleteFormV4{

    public AthleteFormV5(String string) {
        super(string);

    }

    @Override
    public void addComponents(){
        super.addComponents();

        //add background color
        nameTxtField.setBackground(new Color(167,59,36));
        weightTxtField.setBackground(new Color(167,59,36));
        heightTxtField.setBackground(new Color(167,59,36));
        dofTxtField.setBackground(new Color(167,59,36));

        //change font
        nameJLabel.setFont(new Font("Serif" , Font.BOLD , 14));
        weightJLabel.setFont(new Font("Serif" , Font.BOLD , 14));
        heightJLabel.setFont(new Font("Serif" , Font.BOLD , 14));
        dofJLabel.setFont(new Font("Serif" , Font.BOLD , 14));
        genderJLabel.setFont(new Font("Serif" , Font.BOLD , 14));
        hobbiesLabel.setFont(new Font("Serif" , Font.BOLD , 14));
        nationalityLabel.setFont(new Font("Serif" , Font.BOLD , 14));
        sportLabel.setFont(new Font("Serif" , Font.BOLD , 14));
        bioLabel.setFont(new Font("Serif" , Font.BOLD , 14));
        yoeitsLabel.setFont(new Font("Serif" , Font.BOLD , 14));

        //change color of sport list
        sportList.setForeground(new Color(35,45,222));

        //change button's font
        cancelButton.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        resetButton.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        submiButton.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));

        //change bg color of text area
        bioTxt.setBackground(new Color(200,200,200));

        //set tooltip
        cancelButton.setToolTipText("Press the cancel button to cancel this form");
        resetButton.setToolTipText("Press the reset button to reset this form");
        submiButton.setToolTipText("Press the submit button to submit this form");

    }

    @Override
    public void addMenus(){
        super.addMenus();

        //change menu's font
        fileMenu.setFont(new Font("SanSerif", Font.BOLD, 14));
        configMenu.setFont(new Font("SanSerif", Font.BOLD, 14));

        newItem.setFont(new Font("SanSerif", Font.BOLD, 14));
        openItem.setFont(new Font("SanSerif", Font.BOLD, 14));
        saveItem.setFont(new Font("SanSerif", Font.BOLD, 14));
        exitItem.setFont(new Font("SanSerif", Font.BOLD, 14));

        colorMenu.setFont(new Font("SanSerif", Font.BOLD, 14));
        sizMenu.setFont(new Font("SanSerif", Font.BOLD, 14));

        rItem.setFont(new Font("SanSerif", Font.BOLD, 14));
        gItem.setFont(new Font("SanSerif", Font.BOLD, 14));
        bItem.setFont(new Font("SanSerif", Font.BOLD, 14));

        s16Item.setFont(new Font("SanSerif", Font.BOLD, 14));
        s20Item.setFont(new Font("SanSerif", Font.BOLD, 14));
        s24Item.setFont(new Font("SanSerif", Font.BOLD, 14));

        //change menu color
        newItem.setForeground(new Color(6,57,112));
        openItem.setForeground(new Color(6,57,112));
        saveItem.setForeground(new Color(6,57,112));
        exitItem.setForeground(new Color(6,57,112));

        colorMenu.setForeground(new Color(6,57,112));
        sizMenu.setForeground(new Color(6,57,112));

        rItem.setForeground(new Color(6,57,112));
        gItem.setForeground(new Color(6,57,112));
        bItem.setForeground(new Color(6,57,112));

        s16Item.setForeground(new Color(6,57,112));
        s20Item.setForeground(new Color(6,57,112));
        s24Item.setForeground(new Color(6,57,112));

        //set tooltip
        fileMenu.setToolTipText("To create new, open, save form or exit");
        configMenu.setToolTipText("To configure size and color of component");

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        AthleteFormV5 msw = new AthleteFormV5("Athlete Form V5");
        msw.addComponents();
        msw.setFrameFeatures();
        msw.addMenus();

    }

    
}
