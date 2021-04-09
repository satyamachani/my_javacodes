/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package implementsandinheritance;

/**
 *
 * @author admin
 */
class mythread extends Thread
{
    String name;
    @Override
    public void run()
    {
        name=getName();
        if(name.equals("one"))
            for(int i=0;i<=20;i++)
                System.out.println("hello");
        else
            for(int i=0;i<=20;i++)
                System.out.println("hai");
            
            
    }
}
public class multithread {
    public static void main(String args[])
    {
        mythread t1=new mythread();
        mythread t2=new mythread();
        t1.setName("one");
        t2.setName("two");
        t1.start();
        t2.start();
    }

}
