/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package degree;

/**
 *
 * @author admin
 */
import java.applet.Applet;
import java.awt.*;
public class applet extends Applet {
    int i,s,c,j;
    String sq[],cube[],num[];
    public void init()
    {
        i=0;s=0;c=0;j=0;
        sq=new String[21];
        cube=new String[21];
        num=new String[21];
    }
    public void start()
    {
        for(i=0;i<=20;i++)
        {
            s=i*i;
            c=s*i;
            num[i]=Integer.toString(i);
            sq[i]=Integer.toString(s);
            cube[i]=Integer.toString(c);
                //repaint();
        }
    }
    public void paint(Graphics g)
    {
        for(j=0;j<=20;j++)
            g.drawString("Number:"+num[j]+"Its Square is:"+sq[j]+"Cubeis:"+cube[j],50,j*20);
        }


}
