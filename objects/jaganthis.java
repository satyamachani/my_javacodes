/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package objects;

/**
 *
 * @author admin
 */
class jaganthis1 {
    int x,y;
    void init(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    void disp()
    {
        System.out.println("x:"+this.x);
        System.out.println("y:"+y);

    }
}
    public class jaganthis
    {
        public static void main(String args[])
        {
            jaganthis1 th=new jaganthis1();
            th.init(4,6);
            th.disp();
        }


}
