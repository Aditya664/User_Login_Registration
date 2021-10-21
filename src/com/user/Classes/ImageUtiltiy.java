/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery.db;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author star
 */
public class ImageUtiltiy {
    public static void resizeLabelImage(JLabel lbl){
        ImageIcon imgicon=(ImageIcon)lbl.getIcon();
        Image img=imgicon.getImage();
        img=img.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);
        imgicon.setImage(img);
        lbl.setIcon(imgicon);
    }
    public static void setLabelImage(File fname,JLabel lbl){
        ImageIcon img=new ImageIcon(fname.getAbsolutePath()); //file fullpath
        //Resize Image - get Image class object from img
        //Image im=img.getImage().getScaledInstance(100, 100,Image.SCALE_SMOOTH);        
        Image im=img.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight() ,Image.SCALE_SMOOTH);        
        img.setImage(im);
        
        lbl.setIcon(img);
    }
    public static void changeFrameBackgroundImage(JFrame frame,String path){                
        //frame.setLayout(new BorderLayout());
        frame.add(new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
                //System.out.println(new File(path).getAbsolutePath());
                ImageIcon imgicon=new ImageIcon(new File(path).getAbsolutePath());
                Image img=imgicon.getImage();                
                //using Graphics object we can draw anything on panel surface
                g.drawImage(img,0,0,this.getWidth() , this.getHeight(), this);
                //Image img,int x,int y,int width, int height,ImageObserver io);
                
            }
           
        });
        
        
    }
    
    public static void changeFrameIcon(JFrame frame,File file){                
        ImageIcon imgicon=new ImageIcon(file.getAbsolutePath());
        Image img=imgicon.getImage();                
        frame.setIconImage(img);
        
    }
    
}
