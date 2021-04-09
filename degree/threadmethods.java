/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package degree;

/**
 *
 * @author admin
 */
class a extends Thread
    {
        public void run()
        {
            for(int i=5;i<=15;i++)
            {
                try
                {
                    if(i==8)
                    {
                        sleep(1000);
                    }
                }catch(Exception e)
                {
                    System.out.println("i="+i);
                }
            }
        }
    }
    class b extends Thread
    {
        public void run()
        {
            for(int j=20;j<=30;j++)
            {
                if(j==25)
                {
                    yield();
                }
                System.out.println("j="+j);
            }
        }
    }
    class c extends Thread
    {
        public void run()
        {
            for(int k=35;k<=45;k++)
            {
                if(k==40)
                {
                    stop();

                }
                System.out.println("k="+k);
            }
        }
    }
public class threadmethods {
        public static void main(String args[])
        {
            a a1=new a();
            b b1=new b();
            c c1=new c();
            b1.setPriority(10);
            a1.start();
            b1.start();
            c1.start();
        }

}
