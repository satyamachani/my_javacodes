/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package implementsandinheritance;

/**
 *
 * @author admin
 */
class a extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<=25;i++)
        {
            System.out.println("i="+i);
        }
    }
}
class b extends Thread
{
    @Override
    public void run()
    {
        for(int j=0;j<=26;j++)
        {
            System.out.println("j="+j);
        }
    }
}
public class thread {
    public static void main(String args[])
    {
        a a1=new a();
        b b1=new b();
        a1.start();
        b1.start();
        System.out.println("i am main threads");

}
}
