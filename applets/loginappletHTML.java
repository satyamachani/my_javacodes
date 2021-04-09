/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package applets;

import java.awt.*;
import javax.swing.*;
import java.applet.Applet;

/**
 *
 * @author admin
 */

public class loginappletHTML extends JApplet {
    
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1;
    @Override
    public void init() {
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        l1=new JLabel("Username");
        l2=new JLabel("password");
        t1=new JTextField(10);
        t2=new JPasswordField(10);
        b1=new JButton("login");
        c.add(l1);
        c.add(l2);
        c.add(t1);
        c.add(t2);
        c.add(b1);

        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods

}
