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
class bank
{
    String name;
    int bal;
    bank(String n,int in)
    {
        name=n;
        bal=in;
    }
    void deposit(int no)
    {
        bal=bal+no;
    }
    void withdraw(int b)
    {
        if(b<=(bal-500))
            bal=bal-b;
        else
            System.out.println("Can't Withdraw");
    }
    void display()
    {
        System.out.println("***************************");
        System.out.println("Name:"+name);
        System.out.println("Balance:"+bal);
        System.out.println("***************************");
    }
}
public class bankprg {
    public static void main(String args[])throws IOException
    {
        String name,s;
        int choice;
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the name");
        name=d.readLine();
        System.out.println("Enter the initial amount");
        s=d.readLine();
        int init=Integer.parseInt(s);
        bank b1=new bank(name,init);
        
        do
        {
            
            System.out.println("U want to perform deposit or withdraw or exit?press(1/2/3)");
            choice=Integer.parseInt(d.readLine());
        
        switch(choice)
        {
            case 1:
                System.out.println("Enter the depositing amount");
                s=d.readLine();
                int dep=Integer.parseInt(s);
                b1.deposit(dep);
                b1.display();
                break;
                case 2:
                    System.out.println("Enter the withdrawing amount");
                    s=d.readLine();
                    int wit=Integer.parseInt(s);
                    b1.withdraw(wit);
                    b1.display();
                    break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Enter 1 or 2 only");
        }
        }while(choice!=3);
    


    }}
