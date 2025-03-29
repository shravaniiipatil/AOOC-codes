import employee.Emp;
import java.util.Scanner;
class Emppay {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int empid = sc.nextInt();
        System.out.print("Enter Employee Category: ");
        sc.nextLine(); 
        String category = sc.nextLine();
        System.out.print("Enter Basic Pay: ");
        double bpay = sc.nextDouble();
        sc.close();
        Emp e = new Emp(name, empid, category, bpay);
        e.calculateSalary();
        e.displaySalaryDetails();
    }
}
