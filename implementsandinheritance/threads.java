/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package implementsandinheritance;

/**
 *
 * @author admin
 */
class one extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<=20;i++)
        {
            System.out.println("hello");
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
class two extends Thread
{
    @Override
    public void run()
    {
        for(int j=0;j<=20;j++)
        {
            System.out.println("Hai");
        
        try
        {
            Thread.sleep(500);
    }
        catch(Exception e)
        {
            e.printStackTrace();
        }
}
    }
}
public class threads {
    public static void main(String args[])
    {
        one t1=new one();
        two t2=new two();
        t1.start();
        t2.start();
    }

}
