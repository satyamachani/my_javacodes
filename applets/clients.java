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
class mywindow extends Frame
{
    mywindow()
    {
        setSize(200,200);
        setLayout(new FlowLayout());
        Button b=new Button("one");
        add(b);
        setVisible(true);
        
    }
}
public class clients {
    public static void main(String args[])
    {
        mywindow m=new mywindow();
    }


}
