package somsuk.anyamanee.lab8;

import java.io.*;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.*;


public class ReadImage extends JPanel {
    Image img;
    String filename = "somsuk/anyamanee/Athlete.png";//image file pathway

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);

    }

    public ReadImage(){
    try{
            img = ImageIO.read(new File(filename));  
    }catch (IOException e){
        e.printStackTrace(System.err);
    }
}

}
