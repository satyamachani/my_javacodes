/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package implementsandinheritance;

/**
 *
 * @author admin
 */
class person
{
    protected int age;
    protected String name;
    void givedatatoanyperson(int age,String name)
    {
        this.age=age;
        this.name=name;
}
    void display()
    {
        System.out.println("age="+age);
        System.out.println("name="+name);
    }
}
class employee extends person
{
    int empno;
    float salary;
    void givedatatoemployee(int age,String name,int eno,float sal)
    {
        givedatatoanyperson(age,name);
        empno=eno;
        salary=sal;
    }
    void displayemployeedetails()
    {
        display();
        System.out.println("empno="+empno);
        System.out.println("salary="+salary);
        System.out.println("************&&&&&&&&&&&&****************");

    }
}
class student extends person
{
    int rollno;
    int mark;
    void givedatatoanystudent(int age,String name,int rno,int m)
    {
        givedatatoanyperson(age,name);
        rollno=rno;
        mark=m;
    }
    void displaystudentdetails()
    {
        display();
        System.out.println("rollno="+rollno);
        System.out.println("mark:"+mark);
    }
}

public class inheritancemark {
    public static void main(String args[])
    {
        employee e=new employee();
        e.givedatatoemployee(23, "Satya", 10123, 80000);
        System.out.println("employee details");
        e.displayemployeedetails();
        student s1=new student();
        s1.givedatatoanystudent(18, "Satya sai", 12, 65);
        System.out.println("Student details");
        s1.displaystudentdetails();
    }

}
