/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package strings;

/**
 *
 * @author admin
 */
import java.io.*;
public class stringsread2 {
    public static void main(String args[])throws IOException
    {
        DataInputStream s=new DataInputStream(System.in);
         BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        System.out.println("Enter a and b values");
        a=Integer.parseInt(s.readLine());
        b=Integer.parseInt(s.readLine());
        c=a+b;
        System.out.println("the addition of a and b is ="+c);
        String str[]=new String[100];
        System.out.println("Enter the string");
        for(int i=0;i<100;i++)
        {
            str[i]=d.readLine();
            if(str[i].equals("stop")) break;
        }
        System.out.println("The Entered Strings are:");
        for(int i=0;i<100;i++)
        {
            if(str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
        
     }

}
