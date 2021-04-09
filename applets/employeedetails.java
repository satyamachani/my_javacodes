/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package applets;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author admin
 */
class satya extends JFrame
{
    JLabel l1,l2,l3,title;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4,exit;
    satya()
    {
        setSize(355,300);
        setLocation(100,200);
        Container c=getContentPane();
        title=new JLabel("employee details");
        l1=new JLabel("emp no");
        l2=new JLabel("Name");
        l3=new JLabel("salary");
        title.setFont(new Font("dailog",Font.BOLD,15));
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        b1=new JButton("insert");
        b2=new JButton("delet");
        b3=new JButton("update");
        b4=new JButton("display");
        exit=new JButton("exit");
        c.setLayout(null);
        title.setBounds(60,10,160,20);
        c.add(title);
        l1.setBounds(40,40,108,20);
        c.add(l1);
        t1.setBounds(95,40,108,20);
        c.add(t1);
        l2.setBounds(40,70,50,20);
        c.add(l2);
        t2.setBounds(95,70,108,20);
        c.add(t2);
        l3.setBounds(40,100,50,20);
        c.add(l3);
        t3.setBounds(95,100,108,20);
        c.add(t3);
        b1.setBounds(10,140,65,40);
        c.add(b1);
        b2.setBounds(77,140,65,40);
        c.add(b2);
        b3.setBounds(144,140,65,40);
        c.add(b3);
        b4.setBounds(211,140,65,40);
        c.add(b4);
        exit.setBounds(278,140,65,40);
        c.add(exit);
        setVisible(true);
        
    }
}
public class employeedetails extends Applet {
    public static void main(String args[])
    {
        satya r=new satya();
    }
}

    