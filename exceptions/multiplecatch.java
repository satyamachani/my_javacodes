/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptions;

/**
 *
 * @author admin
 */
import java.io.DataInputStream;
public class multiplecatch {
    public static void main(String args[]) throws Exception
    {
        int a,b,c;
        try
        {
            DataInputStream ob=new DataInputStream(System.in);
            System.out.println("Enter the value of a:");
            a=Integer.parseInt(ob.readLine());
            System.out.println("Enter the valueof b:");
            b=Integer.parseInt(ob.readLine());
            c=a/b;
            System.out.println("The result of divisions is"+c);

        }
        catch(ArithmeticException e)
        {
           System.out.println("please ensure that second argument is a non zero"+e); 
        }
        catch(NumberFormatException e)
        {
            System.out.println("Only digits as arguments pleas.");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("supply z arguments pleas."+e);
    }
    }
}


