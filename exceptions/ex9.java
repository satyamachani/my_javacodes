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
public class ex9 {
    public static void main(String args[]) throws Exception
    {
        DataInputStream ob=new DataInputStream(System.in);
        int eno;
        float bsal,hra,ta,pf,gsal,nsal;
        System.out.println("Enter the Employee Number:");
        eno=Integer.parseInt(ob.readLine());
        System.out.println("Enter the basic salary:");
        bsal=Float.parseFloat(ob.readLine());
        hra=bsal*12/100;
        ta=bsal*15/100;
        pf=bsal*20/100;
        gsal=bsal+hra+ta;
        nsal=gsal-pf;
        System.out.println("Employee Number:"+eno);
        System.out.println("Basic salary:"+bsal);
        System.out.println("HRA:"+hra);
        System.out.println("TA:"+ta);
        System.out.println("PF:"+pf);
        System.out.println("Gross salary:"+gsal);
        System.out.println("Net salary:"+nsal);


}
}
