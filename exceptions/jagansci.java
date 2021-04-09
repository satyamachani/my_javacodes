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
public class jagansci {
    public static void main(String args[])throws Exception
    {
        int a;
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the value of a:");
        a=Integer.parseInt(d.readLine());
        System.out.println("value:"+a);
    }

}
