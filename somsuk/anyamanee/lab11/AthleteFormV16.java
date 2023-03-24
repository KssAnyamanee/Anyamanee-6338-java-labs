    /*
     *you can save and open athlete's information in this program
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 24/03/2023
     */

package somsuk.anyamanee.lab11;

import java.awt.event.*;
import java.io.File;
import java.io.*;
import javax.swing.*;
import somsuk.anyamanee.lab5.Athlete;
import somsuk.anyamanee.lab5.Athlete.Gender;

public class AthleteFormV16 extends AthleteFormV15{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        AthleteFormV16 msw = new AthleteFormV16("Athlete Form V16");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListener();
        msw.setFrameFeatures();
    }

    public AthleteFormV16(String string) {
        super(string);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        if (event.getSource() == openItem) {
            int returnval = fileChooser.showSaveDialog(this);
            if (returnval == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    FileInputStream inputFile = new FileInputStream(file);
                    ObjectInputStream oInput = new ObjectInputStream(inputFile);
                    Object oString = oInput.readObject();
                    bioTxt.append(oString.toString());
                    inputFile.close();
                    oInput.close();

                } catch (Exception e) {
                    System.err.println("error");
                }

            }
        } else if (event.getSource() == saveItem) {
            int returnVal = fileChooser.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                fileName = file.getAbsolutePath();
                try {
                    FileOutputStream outputFile = new FileOutputStream(file);
                    ObjectOutputStream outputObject = new ObjectOutputStream(outputFile);

                    //get athlete's information 
                    String namest = nameTxtField.getText();
                    Double heightst = Double.parseDouble(heightTxtField.getText());
                    Double weightst = Double.parseDouble(weightTxtField.getText());
                    String dofst = dofTxtField.getText();
                    String nationst = nationality.getSelectedItem().toString();
                    Gender genderst = Gender.MALE;
                    if (maleButton.isSelected()) {
                        genderst = Gender.MALE;
                    } else if (femaleButton.isSelected()) {
                        genderst = Gender.FEMALE;
                    }
                    Athlete ath = new Athlete(namest, weightst, heightst, genderst, nationst, dofst);
                    outputObject.writeObject(ath);
                    outputObject.close();
                    outputFile.close();
                    JOptionPane.showMessageDialog(this, " Saving the athlete in file " + fileName);//show this window when save
                    JOptionPane.showMessageDialog(this, ath.toString());


                } catch (Exception e) {
                    System.err.println("error");
                }
            }
        }
    }
    
}
