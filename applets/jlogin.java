/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package applets;



/**
 *
 * @author admin
 */
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
class raghu extends JFrame
{
    raghu()
    {
        setSize(500,600);
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        setTitle("Login Screen");
        Label l1=new Label("Username");
        Label l2=new Label("Password");
        TextField t1=new TextField(15);
        TextField t2=new TextField(12);
        Button b1=new Button("login");
        t2.setEchoChar('*');
        c.add(l1);
        c.add(l2);
        c.add(t1);
        c.add(t2);
        c.add(b1);
        setVisible(true);
}
}
public class jlogin extends Applet {
    public static void main(String args[])
    {
        raghu r=new raghu();
        
    }


   
}
