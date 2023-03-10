    /*
     * this program will show ypu the window when you choose your sport and slide the slider 
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 10/03/2023
     */

package somsuk.anyamanee.lab9;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class AthleteFormV10 extends AthleteFormV9 implements ChangeListener, ListSelectionListener {
    String sportV10 = " ";

    public AthleteFormV10(String string) {
        super(string);
    }

    @Override
    public void addListener() {
        super.addListener();
        slider1.addChangeListener(this);
        ListSelectionModel addSelectedlistModel = sportList.getSelectionModel();
        addSelectedlistModel.addListSelectionListener(this);
        addSelectedlistModel.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        AthleteFormV10 msw = new AthleteFormV10("Athlete Form V10");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListener();
        msw.setFrameFeatures();
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel sportModel = (ListSelectionModel) e.getSource();
        if (!e.getValueIsAdjusting()) {
            for (int i = 0; i < sport.length; i++) {
                if (sportModel.isSelectedIndex(i)) {
                    sportV10 += sport[i] + " ";
                }
            }
            JOptionPane.showMessageDialog(this, "Selected sports are " + sportV10);
        }

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider sc = (JSlider) e.getSource();
        if (!sc.getValueIsAdjusting()) {
            int value = sc.getValue();
            JOptionPane.showMessageDialog(AthleteFormV10.this, "# of experience is" + value);
        }
    }

}
