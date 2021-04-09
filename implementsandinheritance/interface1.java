/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package implementsandinheritance;

/**
 *
 * @author admin
 */
interface a
{
    int a=88;
    void show();
}
interface b extends a
{
    int b=65;
    void showa();
    
}
class c implements b
{
    public void show()
    {
        System.out.println("a:="+a);
    }
    public void showa()
    {
        System.out.println("b:="+b);
    }
}
public class interface1 {
    public static void main(String args[])
    {
        c c1=new c();
        c1.show();
        c1.showa();
    }
}
