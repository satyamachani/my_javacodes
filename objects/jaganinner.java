/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package objects;

/**
 *
 * @author admin
 */
public class jaganinner
{
    class contents
    {
        private int i=16;
        private int value()
        {
            return i;
        }
    }
    class destination
    {
        private String label;
        destination(String whereTo)
        {
            label=whereTo;
        }

    String readLabel()
    {
        return label;
    }
    }
    public void ship(String dest)
    {
        contents c=new contents();
        destination d=new destination(dest);
        System.out.println("Shipped "+c.value()+" item(s) to"+dest);
    }
    public static void main(String args[])
    {
        jaganinner i=new jaganinner();
        i.ship("  Congo");
    }
}
