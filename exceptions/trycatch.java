/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptions;

/**
 *
 * @author admin
 */
public class trycatch {
    public static void main(String args[])
    {
        try
        {
            int a=20,b=0,c;
            c=a/b;
           
           
        }
        catch(Exception c)
        {
            System.out.println("iam caugth:="+c);
        }
    }

}
