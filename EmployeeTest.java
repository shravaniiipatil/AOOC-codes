
import java.util.*;

class Employee {

    String firstname;
    String lastname;
    double monthlysal;
    double yearsal, inc;

    Employee() {
        firstname = " ";
        lastname = " ";
        monthlysal = 0;
    }

    void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        firstname = sc.nextLine();
        System.out.println("Enter Last Name: ");
        lastname = sc.nextLine();
        System.out.println("Enter Monthly Salary: ");
        monthlysal = sc.nextInt();
        if (monthlysal < 0) {
            monthlysal = 0.0;
        }
    }

    void setInfo() {
        System.out.println("First Name= " + firstname);
        System.out.println("Last Name= " + lastname);
        System.out.println("Monthly Salary= " + monthlysal);
        yearsal = 12 * monthlysal;
        System.out.println("Yearly Salary= " + yearsal);
    }

    void raise() {
        inc = yearsal * 0.10;
        System.out.println("Incremented Salary= " + inc);
    }
}

public class EmployeeTest {

    public static void main(String args[]) {
        Employee ob1 = new Employee();
        Employee ob2 = new Employee();
        ob1.getInfo();
        ob1.setInfo();
        ob1.raise();
        ob2.getInfo();
        ob2.setInfo();
        ob2.raise();
    }
}
