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
public class studentapplet extends Applet{
     double avg;
     int n1,n2,n3,sum,large;
     String s1,s2,s3;
    public void init()
    {
        large=0;
        sum=0;avg=0;
        s1=getParameter("one");
        s2=getParameter("two");
        s3=getParameter("three");
        n1=Integer.parseInt(s1);
        n2=Integer.parseInt(s2);
        n3=Integer.parseInt(s3);

        }
    public void start()
    {
        sum=n1+n2+n3;
        avg=sum/3;
        large=n1>n2?n1:n2;
        large=large>n3?large:n3;
        s1=Integer.toString(sum);
        s2=Integer.toString(large);
        s3=Double.toString(avg);

}
    public void paint(Graphics g)
    {
        g.drawString("Sum:"+s1,50,60);
        g.drawString("Large:"+s2,50,100);
        g.drawString("Average:"+s3,50,140);

    }
}
