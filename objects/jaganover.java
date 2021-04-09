/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package objects;

/**
 *
 * @author admin
 */
public class jaganover {
    String pname;
    int qty;
    int price;
    int bill;
    jaganover(String prodname,int prodqty,int prodprice,int nbill)
    {
        pname=prodname;
        qty=prodqty;
        price=prodprice;
        bill=nbill;
    }
    jaganover(int p,String p1name,int b)
    {
        pname=p1name;
        price=p;
        qty=price/10;
        bill=b;
    }
    jaganover(String ppname,int pprice,int b1)
    {
        pname=ppname;
        price=(int)(pprice-(0.1));
        bill=b1;
    }
    void print()
    {
        System.out.println("Product name"+pname);
        System.out.println("Quantity:"+qty);
        System.out.println("Price:"+price);
        System.out.println("Bill:"+bill);

    }
    public static void main(String args[])
    {
        jaganover prods;
        prods=new jaganover(" Apples",10,10,10*10);
        prods.print();
        prods=new jaganover(10," Oranges",10*5);
        prods.print();
        prods=new jaganover(" Grapes",25,20*10);
        prods.print();
    }

}
