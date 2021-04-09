/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package implementsandinheritance;

/**
 *
 * @author admin
 */
interface x
{
    int a=24;
    void show();
}
interface y
{
    int b=72;
    void showb();
}
class z implements x,y
{
    public void show()
    {
        System.out.println("a="+a);
    }
    public void showb()
    {
        System.out.println("b="+b);
    }
}
public class interface3 {
    public static void main(String args[])
    {
        z z1=new z();
        z1.show();
        z1.showb();
    }

}
