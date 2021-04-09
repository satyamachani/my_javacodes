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
public class customerbill
{
    public static void main(String args[]) throws IOException
    {
        String s;
        DataInputStream d=new DataInputStream(System.in);
        double total=0,cost,discount=0,count=0;
        for(;;)
        {
            System.out.println("1.T-Shirt\n2.Silk Saree\n3.Baba Suit\n4.Trousers\n5.Exit");
            System.out.println("Enter ur choice:");
            s=d.readLine();
            int code=Integer.parseInt(s);
            switch(code)
            {
                case 1:
                    discount=0.1;
                    break;
                case 2:
                    discount=0.3;
                    break;
                case 3:
                    discount=0.4;
                    break;
                case 4:
                    discount=0.15;
                    break;
                case 5:
                    System.out.println("The Total For Purchased Products="+total);
                    System.exit(0);

            }
            System.out.println("Enter the Cost");
            s=d.readLine();
            cost=Double.parseDouble(s);
            System.out.println("How many Items");
            s=d.readLine();
            count=Double.parseDouble(s);
            cost=(cost-cost*discount/100)*count;
            total=total+cost;
            System.out.println("Amount For Item"+code+"To Be paid="+cost);
        }
    }

}
