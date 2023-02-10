    /*
     * this is the program that will show you simple window that has 3 buttons in there which is cancel button, reset button and submit button
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 10/02/2023
     */


package somsuk.anyamanee.lab7;

import java.awt.*;
import javax.swing.*;

public class MySimpleWindow extends JFrame {
    protected JButton cancelButton;
    protected JButton resetButton;
    protected JButton submiButton;
    protected JPanel mainPanel, buttonPanel;

    public MySimpleWindow(String string) {
        super(string);
    }

    public  void addComponents(){
        cancelButton = new JButton("Cancel");
        resetButton = new JButton("Reset");
        submiButton = new JButton("Submit");
        buttonPanel = new JPanel();
        mainPanel = new JPanel(new BorderLayout());
        buttonPanel.add(cancelButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(submiButton);
        mainPanel.add(buttonPanel);
        add(mainPanel);
    }

    public void setFrameFeatures(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

        
    }


}
