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
import java.awt.event.*;
class raghu extends Frame implements AdjustmentListener
{
    Scrollbar h1,h2,v1;
    raghu()
    {
        setTitle("colour test");
        setSize(320,240);
        setLocation(100,100);
        h1=new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,260);
        h2=new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,250);
        v1=new Scrollbar(Scrollbar.VERTICAL,0,5,0,250);
        add(h1,"North");
        add(h2,"South");
        add(v1,"East");
        h1.addAdjustmentListener(this);
        h2.addAdjustmentListener(this);
        setVisible(true);
    }
    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        setBackground(new Color(h1.getValue(),h2.getValue(),v1.getValue()));
        
    }
}
public class appletadjustment extends Applet {
    public static void main(String args[])
    {
        raghu sa=new raghu();

    }
}
