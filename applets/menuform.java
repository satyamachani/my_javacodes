/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package applets;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author admin
 */
class sai extends Frame
{
    Frame f=new Frame();
    Menu m=new Menu("File");
    Menu m1=new Menu("edit");
    sai()
    {
        MenuItem mt=new MenuItem("new");
        MenuItem mt1=new MenuItem("open");
        MenuItem mt2=new MenuItem("save");
        MenuItem mt3=new MenuItem("save as");
        m.add(mt);
        m.add(mt1);
        m.add(mt2);
        m.add(mt3);
        MenuItem mt5=new MenuItem("undo");
        MenuItem mt6=new MenuItem("cut");
        MenuItem mt7=new MenuItem("copy");
        MenuItem mt8=new MenuItem("cut");
        MenuItem mt9=new MenuItem("paste");
        m1.add(mt5);
        m1.add(mt6);
        m1.add(mt7);
        m1.add(mt8);
        m1.add(mt9);
        MenuBar mb=new MenuBar();
        mb.add(m);
        mb.add(m1);
        f.setMenuBar(mb);
        f.setMenuBar(mb);
        f.setVisible(true);
        
}
}
public class menuform extends Applet {
    public static void main(String args[])
    {
        sai s=new sai();
    }
}

    

