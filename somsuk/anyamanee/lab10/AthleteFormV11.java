    /*
     * In this app,  you can add, display, clear and search athlete's information and will show window 
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 17/03/2023
     */

package somsuk.anyamanee.lab10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import somsuk.anyamanee.lab6.AthleteV2;
import somsuk.anyamanee.lab5.Athlete.Gender;

import javax.swing.*;

import somsuk.anyamanee.lab9.AthleteFormV10;

public class AthleteFormV11 extends AthleteFormV10 {
    protected JMenu dataMenu, sortMenu;
    protected JMenuItem bNameItem, bHeighItem, bHeightnWeight, displayItem, clearItem, searchItem, addItem;
    protected ArrayList<AthleteV2> arr = new ArrayList<>();

    public AthleteFormV11(String string) {
        super(string);
    }

    //add information
    public void addAthlete() {
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
        AthleteV2 message = new AthleteV2(namest, weightst, heightst, genderst, nationst, dofst);//after clicked add will show this message
        arr.add(message);
        JOptionPane.showMessageDialog(this, message);

    }

    //display the information that you added
    public void displayAthlete() {
        String display = " ";
        int n = 1;
        for (int i = 0; i < arr.size(); i++) { 
            display += (i + 1) + " ." + arr.get(i).toString() + "\n";
            n += i;
        }
        if (arr.size() == 0) {
            JOptionPane.showMessageDialog(this, "There is no athlete in the list");//if there is no athlete's information this app will show you this message
        } else if (arr.size() == 1) {
            JOptionPane.showMessageDialog(this, "There is one athlete as follows: \n" + display);//if there is only one athlete's information this app will show you this message
        } else {
            JOptionPane.showMessageDialog(this, "There are " + arr.size() + "athlete as follows: \n" + display + "\n");//this app will show this message when you add athlete's information more than 1
        }
    }

    //clear information
    public void clearAthlete() {
        arr.removeAll(arr);
    }

    //search athlete's information
    public void searchAthlete() {
        String input = JOptionPane.showInputDialog("Please enter athlete name: \n");
        int check = 0;
        for(int i =0; i<arr.size(); i++){
            if(input.equals(arr.get(i).getName())){
                JOptionPane.showMessageDialog(this, arr.get(i).toString());
                check = 1;
            }
            }
        if (check ==  0) {
            JOptionPane.showMessageDialog(this, "Athlete " + input + " is NOT found");
        }
    }

    public void addMenus() {
        super.addMenus();
        bNameItem = new JMenuItem("By Name");
        bNameItem.setFont(new Font("SanSerif", Font.BOLD, 14));
        bNameItem.setForeground(new Color(6,57,112));

        bHeighItem = new JMenuItem("By Height");
        bHeighItem.setFont(new Font("SanSerif", Font.BOLD, 14));
        bHeighItem.setForeground(new Color(6,57,112));

        bHeightnWeight = new JMenuItem("By Height and Weight");
        bHeightnWeight.setFont(new Font("SanSerif", Font.BOLD, 14));
        bHeightnWeight.setForeground(new Color(6,57,112));

        addItem = new JMenuItem("Add");
        addItem.setFont(new Font("SanSerif", Font.BOLD, 14));
        addItem.setForeground(new Color(6,57,112));

        displayItem = new JMenuItem("Display");
        displayItem.setFont(new Font("SanSerif", Font.BOLD, 14));
        displayItem.setForeground(new Color(6,57,112));

        clearItem = new JMenuItem("Clear");
        clearItem.setFont(new Font("SanSerif", Font.BOLD, 14));
        clearItem.setForeground(new Color(6,57,112));

        searchItem = new JMenuItem("Search");
        searchItem.setFont(new Font("SanSerif", Font.BOLD, 14));
        searchItem.setForeground(new Color(6,57,112));

        sortMenu = new JMenu("Sort");
        sortMenu.setFont(new Font("SanSerif", Font.BOLD, 14));
        sortMenu.setForeground(new Color(6,57,112));
        sortMenu.add(bNameItem);
        sortMenu.add(bHeighItem);
        sortMenu.add(bHeightnWeight);

        dataMenu = new JMenu("Data");
        dataMenu.setFont(new Font("SanSerif", Font.BOLD, 14));
        dataMenu.setForeground(new Color(6,57,112));
        dataMenu.add(addItem);
        dataMenu.add(displayItem);
        dataMenu.add(clearItem);
        dataMenu.add(searchItem);
        dataMenu.add(sortMenu);

        menuBar.add(dataMenu);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object sc = event.getSource();
        if (sc == addItem) {
            addAthlete();
        } else if (sc == displayItem) {
            displayAthlete();
        } else if (sc == clearItem) {
            clearAthlete();
        } else if (sc == searchItem) {
            searchAthlete();
        }
    }

    public void addListener() {
        super.addListener();
        addItem.addActionListener(this);
        displayItem.addActionListener(this);
        clearItem.addActionListener(this);
        searchItem.addActionListener(this);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        AthleteFormV11 msw = new AthleteFormV11("Athlete Form V11");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListener();
        msw.setFrameFeatures();

    }

}
