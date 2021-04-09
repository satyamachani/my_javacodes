/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package forloopandswitch;

/**
 *
 * @author admin
 */
public class jaganwhile {
    public static void main(String args[])
    {
        int a=0;
        int b=1;
        int fib;
        while(a<=25)
        {
            System.out.println("the fibnaccii series is"+a);
            fib=a+b;
            a=b;
            b=fib;
        }
    }

}
