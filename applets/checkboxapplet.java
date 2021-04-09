/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package applets;

import java.applet.Applet;

/**
 *
 * @author admin
 */
import java.awt.*;
import java.applet.Applet;
import javax.swing.*;
class radha extends JFrame
{
    radha()
    {
        setSize(200,500);
        Container c=getContentPane();
        c.setLayout(null);
        JButton b1=new JButton("om");
        b1.setBounds(20,20,70,60);
        c.add(b1);
        JCheckBox ch=new JCheckBox("click");
        ch.setBounds(120,250,100,100);
        c.add(ch);
        setVisible(true);
    }
}
public class checkboxapplet extends Applet {
    public static void main(String args[])
    {
        radha r=new radha();
    }

}
