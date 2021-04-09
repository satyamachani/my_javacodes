/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package objects;

/**
 *
 * @author admin
 */
public class jaganload {
    String fname;
    String lname;
    int age;
    String prof;
    jaganload fload(String fname,String lname,int age,String prof)
    {
        this.fname=fname;
        this.lname=lname;
        this.age=age;
        this.prof=prof;
        return this;
     }
    jaganload fload(String f,String l,String p)
    {
        fname=f;
        lname=l;
        prof=p;
        return this;
    }
    jaganload fload(String f,String l)
    {
        fname=f;
        lname=l;
        return this;
    }
    jaganload fload(String f,String l,int a)
    {
        fname=f;
        lname=l;
        age=a;
        return this;
    }
    void print()
    {
        System.out.println(fname+" "+lname+" "+age+" "+prof);
        System.out.println("  ");
    }
    public static void main(String args[])
    {
        jaganload l=new jaganload();
        System.out.println("The various values supplied are as follows");
        System.out.println();
        l.fload("Jagan","nath",45,"engineer");
        l.print();
        l.fload("Revathi","revs","Engineer");
        l.print();
        l.fload("Geetha","Rani");
        l.print();
        l.fload("Ram","Gopal");
        l.print();
    }

}
