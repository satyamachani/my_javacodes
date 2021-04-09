/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package degree;

/**
 *
 * @author admin
 */
import java.io.*;
public class additionofmatrices {
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
        int p,q;
        int a[][]=new int[100][100];
        int b[][]=new int[100][100];
        int c[][]=new int[100][100];

        System.out.println("Enter the size of matrix");
        p=Integer.parseInt(d.readLine());
        q=Integer.parseInt(d.readLine());
        System.out.println("Enter the elements of first matrix");

        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
                a[i][j]=Integer.parseInt(d.readLine());
        }

        System.out.println("Enter the elements of second matrix");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
                b[i][j]=Integer.parseInt(d.readLine());
        }
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
                c[i][j]=a[i][j]+b[i][j];
        }
        System.out.println("The elements of first matix is\n");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
                System.out.println(a[i][j]);
        }
        System.out.println("The elements of second matrx is\n");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
                System.out.println(b[i][j]);
        }
        System.out.println("The addion of two matrcies is");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
                System.out.println(c[i][j]);
        }


    }

}
