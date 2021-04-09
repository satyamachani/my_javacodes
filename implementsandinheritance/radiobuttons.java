/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package implementsandinheritance;

import java.applet.Applet;

/**
 *
 * @author admin
 */
import java.awt.*;
import java.awt.event.*;
class satya extends Frame implements ItemListener
{
    CheckboxGroup cbg;
    Checkbox cb1,cb2,cb3,cb4;
    TextField tf;
    satya()
    {
        setTitle("checkgroup");
        setSize(320,250);
        setLocation(250,360);
        setLayout(new FlowLayout());
        cbg=new CheckboxGroup();
        cb1=new Checkbox("below 19years",cbg,true);
        cb2=new Checkbox("20-39 years",cbg,false);
        cb3=new Checkbox("40-59 years",cbg,false);
        cb4=new Checkbox("60 years",cbg,false);
        tf=new TextField(20);
        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);
        add(tf);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        cb4.addItemListener(this);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==cb1)
            tf.setText("teenager..");
        else
            if(e.getSource()==cb2)
                tf.setText("young and dynamic..");
            else
                if(e.getSource()==cb3)
                    tf.setText("middle age");
                else
                    tf.setText("getting..");

    }
}
public class radiobuttons extends Applet
{
    public static void main(String args[])
    {
        satya r=new satya();
}
}
