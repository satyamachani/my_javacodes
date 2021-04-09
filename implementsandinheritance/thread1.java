/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package implementsandinheritance;

/**
 *
 * @author admin
 */
class y extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("i"+i);
        }
    }
    
}
class x extends Thread
{
    @Override
    public void run()
    {
        for(int j=0;j<=10;j++)
        {
            System.out.println("j"+j);
    }
}
}
public class thread1 {
    public static void main(String args[])
    {
        y y1=new y();
        x x1=new x();
        y1.start();
        x1.start();
        System.out.println("i am main Thread");

    }

}
