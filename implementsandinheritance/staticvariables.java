/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package implementsandinheritance;

/**
 *
 * @author admin
 */
class employee
{
    static int count;
    employee()
    {
        count++;
        System.out.println("employee appointed");
    }
    void getEmpCount()
    {
        System.out.println("no of employee appointed:="+count);
    }
}
public class staticvariables {
    public static void main(String args[])
    {
        System.out.println("no of the employee appointed:="+employee.count);
        employee e=new employee();
        e.getEmpCount();
        employee e2=new employee();
        e2.getEmpCount();
    }

}
