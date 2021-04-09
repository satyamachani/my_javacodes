/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package objects;

/**
 *
 * @author admin
 */
public class jaganconvert {
    double x;
    double y;
    int z;
    void prod(double a,double b)
    {
        x=a;
        y=b;
        z=(int)(a*b);

    }
    void print()
    {
        System.out.println("The value is:"+z);
    }
public static void main(String args[])
{
    jaganconvert c=new jaganconvert();
    c.prod(10.97,15.54);
    c.print();
}
}
