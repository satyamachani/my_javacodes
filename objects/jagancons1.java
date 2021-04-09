/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package objects;

/**
 *
 * @author admin
 */
public class jagancons1 {
    int x,y,z;
    jagancons1(int x,int y,int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    jagancons1()
    {
        this(-1,-1,-1);
    }
    public static void main(String args[])
    {
        jagancons1 c=new jagancons1();
        System.out.println("x:"+c.x+",y:"+c.x);
        c=new jagancons1(10,10,15);
        System.out.println("x:"+c.x+",y"+c.y);
        System.out.println("x:"+c.x+",y"+c.z);
    }

}
