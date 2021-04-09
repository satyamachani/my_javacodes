/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package applets;

import javax.swing.JApplet;

/**
 *
 * @author admin
 */
import java.applet.Applet;
import javax.swing.*;
import java.awt.*;
class mywindow extends JFrame
{
    mywindow()
    {
        setSize(200,200);
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        JButton b=new JButton("one");
        add(b);
        setVisible(true);
    }
}

public class firstswings extends Applet {
    public static void main(String args[])
    {
        mywindow m=new mywindow();

}
}
