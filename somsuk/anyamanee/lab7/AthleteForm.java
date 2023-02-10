    /*
     * this is the program that will show you the window that has form in there and you can fill your name, weight, height, dste of birth and choose gender 
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 10/02/2023
     */

package somsuk.anyamanee.lab7;

import java.awt.*;

import javax.swing.*;


public class AthleteForm extends MySimpleWindow{
    protected JTextField nameTxtField, weightTxtField, heightTxtField, dofTxtField;
    protected JLabel nameJLabel, weightJLabel, heightJLabel, dofJLabel, genderJLabel;
    protected JPanel infoPanel, genderPanel;
    protected JRadioButton maleButton, femaleButton;
    protected ButtonGroup groupButton;

    public AthleteForm(String string) {
        super(string);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
            }        
        });
        
    }

    @Override
    public void addComponents(){
        super.addComponents();
    
        infoPanel = new JPanel(new GridLayout(5,2));
        nameTxtField = new JTextField(15);
        nameJLabel = new JLabel("Name : ");
        weightTxtField = new JTextField(15);
        heightTxtField = new JTextField(15);
        dofTxtField = new JTextField(15);
        weightJLabel = new JLabel("Weight : ");
        heightJLabel = new JLabel("Height : ");
        dofJLabel = new JLabel("Date of Birth (dd-mm-yyyy) : ");
        genderJLabel = new JLabel("Gender : ");

        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("female");
        groupButton = new ButtonGroup();
        genderPanel = new JPanel();

        groupButton.add(maleButton);
        groupButton.add(femaleButton);


        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);


        infoPanel.add(nameJLabel);
        infoPanel.add(nameTxtField);
        infoPanel.add(weightJLabel);
        infoPanel.add(weightTxtField);
        infoPanel.add(heightJLabel);
        infoPanel.add(heightTxtField);
        infoPanel.add(dofJLabel);
        infoPanel.add(dofTxtField);
        infoPanel.add(genderJLabel);
        infoPanel.add(genderPanel);
        

        mainPanel.add(infoPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        

    }

    public void setFrameFeatures(){
       super.setFrameFeatures();
    }

    


    public static void createAndShowGUI(){
        AthleteForm msw = new AthleteForm("Athlete Form");
        msw.addComponents();
        msw.setFrameFeatures();
    }
    
}
