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
class pradam extends Frame
{
    pradam()
    {
        setSize(250,250);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g)
    {
        g.drawLine(100,100,180,180);
    }
}
public class line extends Applet {
    public static void main(String args[])
    {
        pradam r=new pradam();
    }

}
