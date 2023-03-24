    /*
     *you can save and open athlete's hobby information in this program
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 24/03/2023
     */

package somsuk.anyamanee.lab11;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.*;

import somsuk.anyamanee.lab10.AthleteFormV13;

public class AthleteFormV14 extends AthleteFormV13 {
    JFileChooser fileChooser = new JFileChooser();
    String fileName, hobbycheck;
    String jBoxstring = "";
    String text = "";
    ArrayList <String> textarr = new ArrayList<>();
    int selection = 0;
    String count = "";
    String[] hobbyList;

    public AthleteFormV14(String string) {
        super(string);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == saveItem) { //save information
            int returnVal = fileChooser.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                fileName = file.getAbsolutePath();

                try {
                    check();
                    FileWriter fWriter = new FileWriter(file);
                    PrintWriter pWriter = new PrintWriter(fWriter);
                    pWriter.println(nameTxtField.getText());
                    pWriter.println(text);
                    pWriter.close();
                    if (selection == 1) { //show window when save only 1 hobby
                        JOptionPane.showMessageDialog(this, "Saving a hobby in file " + fileName);
                    } else if (selection > 1) { //show windoe when save more than 1 hobbies
                        JOptionPane.showMessageDialog(this, "Saving hobbies in file " + fileName);
                    }

                } catch (IOException e) {
                    System.err.println("Error");
                }
            }

        } else if (event.getSource() == openItem) { //open athlete's hobby file
            int returnVal = fileChooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();

                try {
                    FileReader fReader = new FileReader(file);
                    BufferedReader reader = new BufferedReader(fReader);
                    String line;
                    
                    line = reader.readLine(); //read file
                    String hobbiesLine = reader.readLine();//read file
                    //show different message 
                    if (hobbiesLine.length() == 0) {
                        count = " does not have any hobby";
                    } else {
                        hobbycheck = hobbiesLine.substring(0, hobbiesLine.length()-2);
                    if (!hobbycheck.contains(",")) { //check that it has "," or not
                        count = " has a hobby as ";
                    } else {
                        count = " has hobbies as ";
                    }

                    }
                    bioTxt.setText(line + count + hobbiesLine + "\n");

                    reader.close();
                    fReader.close();
                } catch (Exception e) {
                    System.err.println("Error");
                }
            }
        } else {
            super.actionPerformed(event);
        }

    }

    //check that how many checkboxes has been checked
    public void check() {
        JCheckBox[] cb = { readingBox, gardenBox, watchBox, shoppingBox, othersBox };
        jBoxstring = "";
        selection = 0;
        for (int i = 0; i < cb.length; i++) {
            if (cb[i].isSelected()) {
                selection += 1;
                jBoxstring += cb[i].getActionCommand() + ",";
            }
        }
        hobbyList = jBoxstring.split(",");
        text = String.join(",", hobbyList);

    }

    @Override
    public void addComponents() {
        super.addComponents();
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
        AthleteFormV14 msw = new AthleteFormV14("Athlete Form V14");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListener();
        msw.setFrameFeatures();
    }

}
