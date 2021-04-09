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
public class ex7 {
    public static void main(String args[]) throws Exception
    {
        DataInputStream ob=new DataInputStream(System.in);
        int a,b,c;
        System.out.println("Enter the value of A:");
        a=Integer.parseInt(ob.readLine());
        System.out.println("Enter value of B:");
        b=Integer.parseInt(ob.readLine());
        System.out.println("Enter the value of C:");
        c=Integer.parseInt(ob.readLine());
        System.out.println("Before swaping");
        System.out.println("The value of A:"+a);
        System.out.println("The value of B:"+b);
        System.out.println("The value of C:"+c);
        a=b;
        b=c;
        c=a;
        System.out.println("After Swapping");
        System.out.println("The value of A:"+a);
        System.out.println("The value of B:"+b);
        System.out.println("The value of C:" +c);
        
    }


}
