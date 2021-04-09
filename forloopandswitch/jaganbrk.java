/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package forloopandswitch;

/**
 *
 * @author admin
 */
public class jaganbrk {
    public static void main(String args[])
    {
        boolean t=true;
        a:
        {
            b:
            {
                c:
                {
                    System.out.println("Before the break");
                    if(t)
                    
                        break b;
                    System.out.println("This will not execute:");
                    
                }
                System.out.println("This is after a");
            }
            System.out.println("This is after b");

                }
            }
        }



