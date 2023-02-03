package somsuk.anyamanee.lab7;

import javax.swing.*;

public class AthleteForm extends MySimpleWindow{
    protected JTextField nameTextField;
    protected JLabel 


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

    public static void createAndShowGUI(){
        AthleteForm msw = new AthleteForm("Athlete Form");
        msw.addComponents();
        msw.setFrameFeatures();
    }
    
}
