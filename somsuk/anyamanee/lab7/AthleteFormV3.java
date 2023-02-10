    /*
     * this is the program that will show you the window that has form in there and you can fill your name, weight, height, dste of birth, choose gender,
     * nationality, sport and you can also write something that you want on your bio. this window has menu bar which has file and config menu you can save, create new file or save 
     * , choose color or text size
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 10/02/2023
     */


package somsuk.anyamanee.lab7;

import javax.swing.*;


public class AthleteFormV3 extends AthleteFormV2{
    protected JMenuItem newItem, openItem, saveItem, exitItem, rItem, gItem, bItem, s16Item, s20Item, s24Item ;
    protected JMenuBar menuBar;
    protected JMenu fileMenu, configMenu, colorMenu, sizMenu;


    public AthleteFormV3(String string) {
        super(string);
    }

    public void addMenus() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        configMenu = new JMenu("Config");
        
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");

        //file menu
        exitItem = new JMenuItem("Exit");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        
        //config menu
        colorMenu = new JMenu("Color");
        sizMenu = new JMenu("Size");
        //color
        rItem = new JMenuItem("Red");
        gItem = new JMenuItem("Green");
        bItem = new JMenuItem("Blue");
        colorMenu.add(rItem);
        colorMenu.add(gItem);
        colorMenu.add(bItem);
        //size
        s16Item = new JMenuItem("16");
        s20Item = new JMenuItem("20");
        s24Item = new JMenuItem("24");
        sizMenu.add(s16Item);
        sizMenu.add(s20Item);
        sizMenu.add(s24Item);
        
        //insert icon image
        ImageIcon newIcon = new ImageIcon(getClass().getResource("../lab7/icon/Newicon.png"));
        newItem.setIcon(newIcon);
        ImageIcon openIcon = new ImageIcon(getClass().getResource("../lab7/icon/Open-icon.png"));
        openItem.setIcon(openIcon);
        ImageIcon saveIcon = new ImageIcon(getClass().getResource("../lab7/icon/Save-icon.png"));
        saveItem.setIcon(saveIcon);
        configMenu.add(colorMenu);
        configMenu.add(sizMenu);
        
        menuBar.add(fileMenu);
        menuBar.add(configMenu);
        
        this.setJMenuBar(menuBar);
        
    }
    
    public void addComponents(){
        super.addComponents();
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
        AthleteFormV3 msw = new AthleteFormV3("Athlete Form V3");
        msw.addComponents();
        msw.setFrameFeatures();
        msw.addMenus();

    }
    
}
