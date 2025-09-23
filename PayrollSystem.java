import java.util.*; // will import all the utilities from jvm

// makina class of employee 
class Employee{
    String name;
    String id;
    Double payrate;
    Double hoursworked;
    // method to clculate salary
    double Salary(){
        return hoursworked * payrate;
    }
    
}

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creatng employee object
        Employee A = new Employee();
         // Take input
        System.out.print("Enter Employee ID: ");
        A.id = sc.nextLine();

        System.out.print("Enter Employee Name: ");
        A.name = sc.nextLine();

        System.out.print("Enter Hours Worked: ");
        A.hoursworked = sc.nextDouble();

        System.out.print("Enter Pay Rate per Hour: ");
        A.payrate = sc.nextDouble();
        // Calculate salary
        double salary = A.Salary();
        System.out.println("\n--- Employee Payroll ---");
        System.out.println("Employee ID: " + A.id);
        System.out.println("Employee Name: " + A.name);
        System.out.println("Hours Worked: " + A.hoursworked);
        System.out.println("Pay Rate: " + A.payrate);
        System.out.println("Salary: " + salary);
        sc.close();
    }
}

    
