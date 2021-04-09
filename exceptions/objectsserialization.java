/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptions;

/**
 *
 * @author admin
 */
import java.io.*;
class student implements Serializable
{
    int rollno;
    student(int r1)
    {
        rollno=r1;
    }
    void display()
    {
        System.out.println("roll no"+rollno);
    }
}
public class objectsserialization {
    public static void main(String args[]) throws IOException
    {
        FileOutputStream fos=new FileOutputStream("student.dat");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        student s=new student(1002);
        oos.writeObject(s);
        oos.close();
        s.display();
        
    }


}
