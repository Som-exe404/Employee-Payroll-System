import java.util.*;  // Importing the java.util package to use Scanner for input

// Employee class to represent an employee and calculate salary
class Employee {
    String name;        // Variable to store employee's name
    String id;          // Variable to store employee's ID
    Double payrate;     // Variable to store pay rate (per hour)
    Double hoursworked; // Variable to store total hours worked
    
    // Method to calculate salary = hours worked × pay rate
    double Salary() {
        return hoursworked * payrate;
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object for taking user input
       
        Employee A = new Employee();  // Creating an object 'A' of Employee class
         
        // Taking Employee details from user
        System.out.print("Enter Employee ID: ");
        A.id = sc.nextLine();  // Reading employee ID

        System.out.print("Enter Employee Name: ");
        A.name = sc.nextLine();  // Reading employee name

        System.out.print("Enter Hours Worked: ");
        A.hoursworked = sc.nextDouble();  // Reading total hours worked

        System.out.print("Enter Pay Rate per Hour: ");
        A.payrate = sc.nextDouble();  // Reading pay rate per hour
       
        // Calculating salary using the Salary() method
        double salary = A.Salary();

        // Displaying the payroll details
        System.out.println("\n--- Employee Payroll ---");
        System.out.println("Employee ID: " + A.id);
        System.out.println("Employee Name: " + A.name);
        System.out.println("Hours Worked: " + A.hoursworked);
        System.out.println("Pay Rate: " + A.payrate);
        System.out.println("Salary: " + salary);

        sc.close();  // Closing Scanner to avoid memory leaks
    }
}
