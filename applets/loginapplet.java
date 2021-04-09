/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package applets;

/**
 *
 * @author admin
 */
import java.awt.*;

import java.applet.Applet;
class raghu extends Frame
{
    raghu()
    {
        setSize(500,600);
        setLayout(new FlowLayout());
        setTitle("login screen");
        Label l1=new Label("username");
        Label l2=new Label("password");
        TextField t1=new TextField(15);
        TextField t2=new TextField(15);
        Button b1=new Button("login");
        t2.setEchoChar('#');
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        setVisible(true);
    }
}
public class loginapplet extends Applet {
    public static void main(String args[])
    {
     raghu r=new raghu();
    }

}
