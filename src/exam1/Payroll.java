package exam1;

import java.util.ArrayList;
import java.util.List;

/**
 * Same as Parking, I won't add any particularly careful validation. I just assume this is a
 * logical exercise, not a user-facing application. I will, however, add basic checks to keep 
 * some sanity (no one is working for free under my watch, and time is usually positive).
 */

public class Payroll {
    private List<Employee> employees;

    public Payroll() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    /**
     * The exercise explcitly asks for a totalPayment(list) method, so I'll implement it as an
     * internal helper method. It will be called by the public totalPayment() method, which will
     * use the internal list of employees in the payroll.
     */
    public double totalPayment() {
        return this.totalPayment(this.employees);
    }

    private double totalPayment(List<Employee> employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}


// -- Employees down below :D
abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double getSalary();
}


// We assume FixedSalary is a monthly salary, and no one is working for free
// This means the salary must be positive.
class FixedSalaryEmployee extends Employee {
    private double salary;

    public FixedSalaryEmployee(String name, double salary) {
        super(name);
        if (salary <= 0) { throw new IllegalArgumentException("Salary cannot be negative"); }
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }
}


// Commissions depend on sales. We accept 0 sales only, but rate must be positive:
// A seller with 0 commission rate is not a seller.
class Seller extends FixedSalaryEmployee {
    private double sales;
    private double commissionRate;

    public Seller(String name, double salary, double sales, double commissionRate) {
        super(name, salary);
        if (sales < 0 || commissionRate <= 0) { throw new IllegalArgumentException("Sales cannot be negative and commission rate must be positive"); }
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + (this.sales * this.commissionRate);
    }
}


// These ones usually have flexible hours. They must have a positive rate (they 
// better not working for free, I hope), but work hours can be 0.
class HourlySalaryEmployee extends Employee {
    private double hourlyRate;
    private double workedHours;

    /**
     * In real life, worked hours can vary over time. That's the flexibility of this contract.
     * We will assume the possibility of constructing an instance with set workedHours
     * for simplicity. Thus, constructor is public. However, it should be open to modification.
     */
    public HourlySalaryEmployee(String name, double hourlyRate, double workedHours) {
        super(name);
        if (hourlyRate <= 0 || workedHours < 0) { throw new IllegalArgumentException("Arguments cannot be negative"); }

        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
    }

    // Real life could be more like this
    public HourlySalaryEmployee(String name, double hourlyRate) {
        super(name);
        if (hourlyRate <= 0) { throw new IllegalArgumentException("Hourly rate cannot be negative or zero"); }

        this.hourlyRate = hourlyRate;
        this.workedHours = 0;
    }

    // And updating the worked hours later on
    public void setWorkedHours(double workedHours) {
        if (workedHours < 0) { throw new IllegalArgumentException("Worked hours cannot be negative"); }
        this.workedHours = workedHours;
    }

    @Override
    public double getSalary() {
        return this.hourlyRate * this.workedHours;
    }
}
