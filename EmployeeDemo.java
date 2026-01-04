// Abstract class Employee
abstract class Employee {
    // Instance variable
    protected String name;
    
    // Constructor to initialize name
    public Employee(String name) {
        this.name = name;
    }
    
    // Abstract method to calculate salary
    public abstract double calculateSalary();
    
    // Concrete method to show details
    public void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + calculateSalary());
    }
}

// Subclass FullTimeEmployee
class FullTimeEmployee extends Employee {
    private double monthlySalary;
    
    // Constructor
    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);  // Call parent constructor
        this.monthlySalary = monthlySalary;
    }
    
    // Implement abstract method
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Main class to demonstrate
public class EmployeeDemo {
    public static void main(String[] args) {
        // Create a FullTimeEmployee object
        Employee emp = new FullTimeEmployee("Abir Khan", 8000.0);
        emp.showDetails();
    }
}