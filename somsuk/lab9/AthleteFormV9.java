    /*
     * this program will show window everytime that you change the information and also has shortcut key to click the menu
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 10/03/2023
     */

package somsuk.anyamanee.lab9;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AthleteFormV9 extends AthleteFormV8 {

    public AthleteFormV9(String string) {
        super(string);
    }

    //show window
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == nameTxtField) {
            JOptionPane.showMessageDialog(this, "Name is changed to " + nameTxtField.getText());
        } else if (src == weightTxtField) {
            JOptionPane.showMessageDialog(this, "Weight is changed to " + weightTxtField.getText());
        } else if (src == heightTxtField) {
            JOptionPane.showMessageDialog(this, "Height is changed to " + heightTxtField.getText());
        } else if (src == dofTxtField) {
            JOptionPane.showMessageDialog(this, "Date of birth is changed to " + dofTxtField.getText());
        } else if (src == nationality) {
            JOptionPane.showMessageDialog(this, "Nationality is changed to " + nationality.getSelectedItem());
        } else if (src == femaleButton) {
            JOptionPane.showMessageDialog(this, "Female is selected");
        } else if (src == maleButton) {
            JOptionPane.showMessageDialog(this, "Male is selected");
        } else if (src == newItem) {
            JOptionPane.showMessageDialog(this, "You click menu New");
        } else if (src == openItem) {
            JOptionPane.showMessageDialog(this, "You click menu Open");
        } else if (src == saveItem) {
            JOptionPane.showMessageDialog(this, "You click menu Save");
        } else if (src == exitItem) {
            System.exit(0);
        }

    }

    //show window when select hobby
    public void addComponents() {
        super.addComponents();
        readingBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (evt.getStateChange() == ItemEvent.SELECTED) {
                            JOptionPane.showMessageDialog(null, "Reading is also your hobby");
                        } else {
                            JOptionPane.showMessageDialog(null, "Reading is no longer your hobby");
                        }
                    }
                });
            }
        });

        gardenBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (evt.getStateChange() == ItemEvent.SELECTED) {
                            JOptionPane.showMessageDialog(null, "Gardening is also your hobby");
                        } else {
                            JOptionPane.showMessageDialog(null, "Gardening is no longer your hobby");
                        }
                    }
                });
            }
        });

        watchBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (evt.getStateChange() == ItemEvent.SELECTED) {
                            JOptionPane.showMessageDialog(null, "Watching movies is also your hobby");
                        } else {
                            JOptionPane.showMessageDialog(null, "Watching movies is no longer your hobby");
                        }
                    }
                });
            }
        });

        shoppingBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (evt.getStateChange() == ItemEvent.SELECTED) {
                            JOptionPane.showMessageDialog(null, "Shopping is also your hobby");
                        } else {
                            JOptionPane.showMessageDialog(null, "Shopping is no longer your hobby");
                        }
                    }
                });
            }
        });

        othersBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (evt.getStateChange() == ItemEvent.SELECTED) {
                            JOptionPane.showMessageDialog(null, "Others is also your hobby");
                        } else {
                            JOptionPane.showMessageDialog(null, "Others is no longer your hobby");
                        }
                    }
                });
            }
        });
    }

    //add Mnemonic and accelerator
    @Override
    public void addMenus() {
        super.addMenus();
        newItem.setMnemonic(KeyEvent.VK_N);
        openItem.setMnemonic(KeyEvent.VK_O);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_X);

        newItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_N, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        openItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_O, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        saveItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_S, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        exitItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_Q, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
    }

    public void addListener() {
        super.addListener();
        nameTxtField.addActionListener(this);
        weightTxtField.addActionListener(this);
        heightTxtField.addActionListener(this);
        dofTxtField.addActionListener(this);
        nationality.addActionListener(this);
        femaleButton.addActionListener(this);
        maleButton.addActionListener(this);
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        AthleteFormV9 msw = new AthleteFormV9("Athlete Form V9");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListener();
        msw.setFrameFeatures();
    }

}
