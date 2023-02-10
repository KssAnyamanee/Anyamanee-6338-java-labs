    /*
     * this is the program that will show you the window that has form in there and you can fill your name, weight, height, dste of birth, choose gender,
     * nationality, sport and you can also write something that you want on your bio
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 10/02/2023
     */


package somsuk.anyamanee.lab7;
import java.awt.*;
import javax.swing.*;

public class AthleteFormV2 extends AthleteForm{
    protected JLabel nationalityLabel, sportLabel, bioLabel;
    protected JComboBox<String> nationality;
    protected JList<String> sportList;
    protected JTextArea bioTxt;
    protected JScrollPane bioSP;
    protected String[] sport = {"Badminton", "Boxing", "Foootball", "Running"};
    protected JPanel allPanel, bioPanel, gPanel, nationPanel, sportPanel;

    public AthleteFormV2(String string) {
        super(string);
    }

    @Override
    public void addComponents(){
        super.addComponents();
        nationalityLabel = new JLabel("Nationality : ");
        sportLabel = new JLabel("Sport : ");
        bioLabel = new JLabel("Bio : ");
        bioTxt = new JTextArea();
        bioSP = new JScrollPane(bioTxt);
        allPanel = new JPanel(new BorderLayout());
        bioPanel = new JPanel(new GridLayout(2,1));
        gPanel = new JPanel(new BorderLayout());
        
        nationality = new JComboBox<String>();
        sportList = new JList<String>();
        
        
        nationality.addItem("American");
        nationality.addItem("Chinese");
        nationality.addItem("Indonesian");
        nationality.addItem("Japanese");
        nationality.addItem("Thai");
        nationality.setSelectedItem("Thai");
        nationality.addItem("Vietnamese");
        nationality.setEditable(true);
        
        sportList = new JList<>(sport);
        
        
        bioPanel.add(bioLabel);
        bioPanel.add(bioSP);

        //nationalPanel
        nationPanel = new JPanel(new GridLayout(1,1));
        nationPanel.add(nationalityLabel);
        nationPanel.add(nationality);

        //sportpanel
        sportPanel = new JPanel(new GridLayout(1,1));
        sportPanel.add(sportLabel);
        sportPanel.add(sportList);
        
        //allpanel
        allPanel = new JPanel(new BorderLayout());
        allPanel.add(nationPanel, BorderLayout.NORTH);
        allPanel.add(sportPanel, BorderLayout.SOUTH);
        
        //gpanel
        gPanel.add(allPanel, BorderLayout.NORTH);
        gPanel.add(bioPanel, BorderLayout.CENTER);

        //mainpanel
        mainPanel.add(gPanel, BorderLayout.CENTER);

    }

    public void setFrameFeatures(){
        super.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
            }        
        });
    }

    public static void createAndShowGUI(){
        AthleteFormV2 msw = new AthleteFormV2("Athlete Form");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    
}
