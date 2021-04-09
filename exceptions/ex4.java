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
public class ex4 {
    public static void main(String args[]) throws Exception
    {
        DataInputStream ob=new DataInputStream(System.in);
        int m1,m2,m3,tot;
        float avg;
        System.out.println("Enter the value of m1:");
        m1=Integer.parseInt(ob.readLine());
        System.out.println("Enter the value of m2:");
        m2=Integer.parseInt(ob.readLine());
        System.out.println("Enter the value of m3:");
        m3=Integer.parseInt(ob.readLine());
        tot=m1+m2+m3;
        avg=tot/3;
        System.out.println("The value of m1:"+m1);
        System.out.println("The value of m2:"+m2);
        System.out.println("The value of m3:"+m3);
        System.out.println("Total:"+tot);
        System.out.println("Average:"+avg);

    }

}
