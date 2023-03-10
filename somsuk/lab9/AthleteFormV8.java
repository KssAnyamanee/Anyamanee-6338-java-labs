    /*
     * this program is extended AthleteFormV6. your information will appear in bio text area when you click submit button
     * and when you click cancel button all the information will disappear from bio text area and color of text field will change to red. When you click reset button all 
     * the informations are gone and text field will go back to white color
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 10/03/2023
     */


package somsuk.anyamanee.lab9;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import somsuk.anyamanee.lab8.AthleteFormV6;

public class AthleteFormV8 extends AthleteFormV6 implements ActionListener {
    String resultTxt;
    String cbs;
    String gendertxt;

    public AthleteFormV8(String string) {
        super(string);

    }

    public void actionPerformed(ActionEvent event) {
        Object srcObject = event.getSource();
        if (srcObject == submiButton) {
            handleSubmitButton();
        } else if (srcObject == cancelButton) {
            handleCancelButton();
        } else if (srcObject == resetButton) {
            handleResetButton();
        }
    }

    //when click reset button
    public void handleResetButton() {
        nameTxtField.setText(" ");
        nameTxtField.setBackground(Color.white);

        weightTxtField.setText(" ");
        weightTxtField.setBackground(Color.white);

        heightTxtField.setText(" ");
        heightTxtField.setBackground(Color.white);

        dofTxtField.setText(" ");
        dofTxtField.setBackground(Color.white);

        groupButton.clearSelection();

        watchBox.setSelected(false);
        readingBox.setSelected(false);
        gardenBox.setSelected(false);
        shoppingBox.setSelected(false);
        othersBox.setSelected(false);

        sportList.clearSelection();

        slider1.setValue(0);
        bioTxt.setText(" ");

    }

    //when click the cancel button
    public void handleCancelButton() {
        nameTxtField.setText(" ");
        nameTxtField.setBackground(new Color(167, 59, 36));

        weightTxtField.setText(" ");
        weightTxtField.setBackground(new Color(167, 59, 36));

        heightTxtField.setText(" ");
        heightTxtField.setBackground(new Color(167, 59, 36));

        dofTxtField.setText(" ");
        dofTxtField.setBackground(new Color(167, 59, 36));

        groupButton.clearSelection();

        watchBox.setSelected(true);
        readingBox.setSelected(false);
        gardenBox.setSelected(false);
        shoppingBox.setSelected(false);
        othersBox.setSelected(false);

        slider1.setValue(0);
        bioTxt.setText(" ");

    }

    public void handleSubmitButton() {
        getValues();
        bioTxt.setText(resultTxt);

    }

    public void CheckBoxHandler() {
        JCheckBox[] cb = { readingBox, gardenBox, watchBox, shoppingBox, othersBox };
        for (int i = 0; i < cb.length; i++) {
            if (cb[i].isSelected()) {
                cbs += cb[i].getActionCommand() + " ";
            }
        }
    }

    public void initValues() {

        nameTxtField.setText("Manee");
        nameTxtField.setBackground(Color.pink);

        weightTxtField.setText("50");
        weightTxtField.setBackground(Color.pink);

        heightTxtField.setText("170");
        heightTxtField.setBackground(Color.pink);

        dofTxtField.setText("01/01/2000");
        dofTxtField.setBackground(Color.pink);

        femaleButton.setSelected(true);

        sportList.setSelectedIndex(2);
        slider1.setValue(10);
    }

    public void addListener() {
        submiButton.addActionListener(this);
        resetButton.addActionListener(this);
        cancelButton.addActionListener(this);

    }

    public String gender() {
        if (femaleButton.isSelected()) {
            gendertxt = femaleButton.getActionCommand();
        } else if (maleButton.isSelected()) {
            gendertxt = maleButton.getActionCommand();
        }
        return gendertxt;
    }

    public void getValues() {
        CheckBoxHandler();
        resultTxt = "Name: " + nameTxtField.getText() + "\n" + "Weight: " + weightTxtField.getText() + "\n" + "Height: "
                + heightTxtField.getText() + "\n" + "Date of birth: " + dofTxtField.getText() + "\n"
                + "Gender: " + gender() + "\n" + "Hobbies: " + cbs + "\n" + "Nationality: "
                + nationality.getSelectedItem() + "\n" + "Sports: " + sportList.getSelectedValuesList() + "\n "
                + "Experience year: " + slider1.getValue();

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        AthleteFormV8 msw = new AthleteFormV8("Athlete Form V8");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListener();
        msw.setFrameFeatures();
    }

}
