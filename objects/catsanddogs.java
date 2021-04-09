/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package objects;

/**
 *
 * @author admin
 */
import java.util.*;
class cat
{
    private int catnum;
    cat(int i)
    {
        catnum=i;
    }
    void print()
    {
        System.out.println("cat #"+catnum);
    }
}
class dog
{
    private int dognum;
    dog(int i)
    {
        dognum=i;

    }
    void print()
    {
        System.out.println("Dog #"+dognum);
 }
}
public class catsanddogs {
    public static void main(String args[])
    {
        Vector cats=new Vector();
         Vector dogs=new Vector();
        for(int i=0;i<7;i++)
        {
             dogs.addElement(new cat(i));
            cats.addElement(new dog(i));
        }
        cats.addElement(new cat(7));
        dogs.addElement(new dog(7));
        for(int i=0;i<cats.size();i++)
        {
         ((cat)dogs.elementAt(i)).print();
        ((dog)cats.elementAt(i)).print();
    }
       
       
}
}