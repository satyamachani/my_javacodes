/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package implementsandinheritance;

/**
 *
 * @author admin
 */
class vehicle
{
    int wheels;
    vehicle()
    {
        wheels=4;
    }
    void move()
    {
        System.out.println("every vehicle will move this way");
    }
}
class car extends vehicle
{
    void display()
    {
        System.out.println("car has "+wheels+" wheels");
    }
}
public class inheritance {
    public static void main(String args[])
    {
            car c=new car();
            c.move();
            c.display();


}
}
