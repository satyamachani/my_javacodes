/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package strings;

/**
 *
 * @author admin
 */
public class jaganstr1 {
    int i;
    String names[]={"revathi","bhanu","prakash","prasad","prasad"};
    void show()
    {
        System.out.println("My Favourite names are:");
        for(int i=0;i<5;i++)
        System.out.println(names[i]);



    }
    public static void main(String args[])
    {
        jaganstr1 s=new jaganstr1();
        s.show();
    }
}
