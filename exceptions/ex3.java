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
public class ex3 {
    public static void main(String args[]) throws Exception
    {
        DataInputStream ob=new DataInputStream(System.in);
        int a,b,c;
        float e,f,sum;
        System.out.println("Enter the value of A:");
        a=Integer.parseInt(ob.readLine());
        System.out.println("Enter the value of B:");
        b=Integer.parseInt(ob.readLine());
        System.out.println("Enter the value of e:");
        e=Float.parseFloat(ob.readLine());
        System.out.println("Enter the value of f:");
        f=Float.parseFloat(ob.readLine());
        c=a+b;
        sum=e+f;
        System.out.println("The value of a:"+a);
        System.out.println("The value of b:"+b);
        System.out.println("The value of c:"+c);
        System.out.println("The value of e:"+e);
        System.out.println("The value of f:"+f);
        System.out.println("The value of sum:"+sum);
    }

}
