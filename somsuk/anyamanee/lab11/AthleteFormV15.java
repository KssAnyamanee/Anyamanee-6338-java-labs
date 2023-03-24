    /*
     *you can save and open athlete's hobby and year of experience information in this program
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 24/03/2023
     */

package somsuk.anyamanee.lab11;

import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.*;

public class AthleteFormV15 extends AthleteFormV14 {
    String year = "";

    public AthleteFormV15(String string) {
        super(string);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        if (event.getSource() == openItem) {
            int returnVal = fileChooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    FileInputStream fInput = new FileInputStream(file);
                    DataInputStream data = new DataInputStream(fInput);
                    String sliderinfo = data.readUTF();
                    Double experience = data.readDouble();
                    if (slider1.getValue() <= 1) {
                        year = " year ";
                    } else {
                        year = " years ";
                    }
                    bioTxt.append(sliderinfo + " has " + experience + year + " of experiences\n");//show this message on bio text area when open
                    fInput.close();
                    data.close();

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
                    FileOutputStream fOutput = new FileOutputStream(file);
                    DataOutputStream dOutput = new DataOutputStream(fOutput);
                    dOutput.writeUTF(nameTxtField.getText());
                    dOutput.writeDouble(slider1.getValue());
                    dOutput.close();
                    fOutput.close();

                    JOptionPane.showMessageDialog(this, " Saving " + file.getName() + " in file " + fileName);//show this window when save

                } catch (Exception e) {
                    System.err.println("error");
                }
            }
        } else {
            super.actionPerformed(event);
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
        AthleteFormV15 msw = new AthleteFormV15("Athlete Form V15");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListener();
        msw.setFrameFeatures();
    }

}
