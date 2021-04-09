/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package degree;

/**
 *
 * @author admin
 */
import java.io.*;
public class student {
    public static void main(String args[]) throws IOException
    {
        DataInputStream s=new DataInputStream(System.in);
        BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
        int tel,hin,eng,mat,sci,so,total;
        float avg;
        String name,result;
        String grade="";
        System.out.println("enter name");
        name=d.readLine();
        System.out.println("Enter marks");
        System.out.println("telugu");
        tel=Integer.parseInt(s.readLine());
        System.out.println("hindi");
        hin=Integer.parseInt(s.readLine());
        System.out.println("english");
        eng=Integer.parseInt(s.readLine());
        System.out.println("maths");
        mat=Integer.parseInt(s.readLine());
        System.out.println("science");
        sci=Integer.parseInt(s.readLine());
        System.out.println("social");
        so=Integer.parseInt(s.readLine());
        total=tel+hin+eng+mat+sci+so;
        avg=total/6;
        if(tel>=35 && hin>=35 && eng>=35 && mat>=35 && sci>=35 && so>=35)
            result="pass";
        else
            result="fail";
        if(result=="pass")
        {
            if(avg>=35 && avg<50)
                grade="Third class";
            else if(avg>=50 && avg<60)
                grade="second class";
            else if(avg>60 && avg<75)
                grade="First class";
            else if(avg>=75)
                grade="Dist";
        }
        else
            grade="Reaapear";
        System.out.println("Student Name:"+name);
        System.out.println("telugu:"+tel);
        System.out.println("Hindi:"+hin);
        System.out.println("English:"+eng);
        System.out.println("maths:"+mat);
        System.out.println("science:"+sci);
        System.out.println("social:"+so);
        System.out.println("total:"+total);
        System.out.println("average:"+avg);
        System.out.println("Result:"+result);
        System.out.println("Grade:"+grade);


}
}
