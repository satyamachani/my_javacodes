/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package implementsandinheritance;

/**
 *
 * @author admin
 */
class car
{
    void movee()
    {
        System.out.println("every vehicle moves this way");
    }
}
class vehicle extends car
{
    @Override
    void movee()
    {
        System.out.println("As a car i want to move in my own way");
    }
}
public class overriddencar {
    public static void main(String args[])
    {
        vehicle v=new vehicle();
        car c=new car();
        v.movee();
        c.movee();
    }

}
