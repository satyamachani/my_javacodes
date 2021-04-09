/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package objects;

/**
 *
 * @author admin
 */
class vehicle
{
    void move()
    {
            System.out.println("every vehicle moves this way");
    }
}
class car extends vehicle
{
    @Override
    void move()
    {
        System.out.println("as a car i want to move in my own way");
    }
}
public class dynamicmethod {
    public static void main(String args[])
    {
        vehicle v=new car();
        v.move();
    }

}
