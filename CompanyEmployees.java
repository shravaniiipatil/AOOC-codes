
import java.util.Scanner;

class Employee {

    String name, address, jobTitle;
    double salary;

    Employee(String n, String a, String j, double s) {
        name = n;
        address = a;
        jobTitle = j;
        salary = s;
    }

    double calculateBonus() {
        return salary * 0.10;
    }

    void generatePerformanceReport() {
        System.out.println("Performance Report for " + name + ":");
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Bonus: ₹" + calculateBonus());
        System.out.println("Address: " + address);
    }

    void manageProject() {
        System.out.println(name + " is working on company projects.");
    }
}

class Manager extends Employee {

    Manager(String n, String a, double s) {
        super(n, a, "Manager", s);
    }

    double calculateBonus() {
        return salary * 0.20;
    }

    void manageProject() {
        System.out.println(name + " is managing multiple projects and teams.");
    }
}

class Developer extends Employee {

    Developer(String n, String a, double s) {
        super(n, a, "Developer", s);
    }

    void manageProject() {
        System.out.println(name + " is developing and maintaining software projects.");
    }
}

class Programmer extends Employee {

    Programmer(String n, String a, double s) {
        super(n, a, "Programmer", s);
    }

    void manageProject() {
        System.out.println(name + " is writing and testing code for projects.");
    }
}

public class CompanyEmployees {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Manager manager = new Manager("Alice", "Pune, Maharashtra", 80000);
        Developer developer = new Developer("Bob", "Mumbai, Maharashtra", 60000);
        Programmer programmer = new Programmer("Charlie", "Bangalore, Karnataka", 50000);

        manager.generatePerformanceReport();
        manager.manageProject();

        developer.generatePerformanceReport();
        developer.manageProject();

        programmer.generatePerformanceReport();
        programmer.manageProject();

        Employee employee = new Employee("David", "Delhi, India", "Employee", 40000);
        employee.generatePerformanceReport();
        employee.manageProject();

        scanner.close();
    }
}
