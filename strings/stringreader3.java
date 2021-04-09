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
public class stringreader3 {
    public static void main(String args[])throws IOException
    {
        BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
        String name[]=new String[100];
        String street[]=new String[100];
        String town[]=new String[100];
        String dist[]=new String[100];
        String pin[]=new String[10];
       System.out.println("Enter name");
       name[20]=s.readLine();
       System.out.println("Enter Street");
       street[20]=s.readLine();
       System.out.println("Enter town");
       town[20]=s.readLine();
       System.out.println("Enter dist");
       dist[20]=s.readLine();
       System.out.println("Enter pin");
       pin[6]=s.readLine();
       System.out.println("name:"+name[20]);
       System.out.println("Street:"+street[20]);
       System.out.println("town:"+town[20]);
       System.out.println("dist:"+dist[20]);
       System.out.println("pin:"+pin[6]);

    }

}
