/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package objects;

/**
 *
 * @author admin
 */
public class jaganpriv {
    private int x=10;
    void var()
    {
        System.out.println("The private value is:"+x);


}
    public static void main(String args[])
    {
        jaganpriv p=new jaganpriv();
        p.var();
    }
}
