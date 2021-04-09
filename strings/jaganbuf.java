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
public class jaganbuf {
    public static void main(String args[]) throws IOException
    {
        BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter the lines of Text.");
        System.out.println("Enter 'stop' to quit");
        do
        {
            str=a.readLine();
            System.out.println(str);
            }while(!str.equals("stop"));
        String foo="foo";
        String s="abc"+foo+"def"+Integer.toString(47);
        System.out.println(s);
        StringBuffer sb=new StringBuffer();
        sb.append(foo);
        sb.append("def");
        sb.append(Integer.toString(47));
        System.out.println(sb);
    }

}
