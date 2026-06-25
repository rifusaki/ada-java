package employee;

public class Employee {
    
    private String name;
    private int age;
    private String position;
    private double salary;
    private int seniorityDays;

    public Employee(String name, int age, String position, double salary, int seniorityDays) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.seniorityDays = seniorityDays;
    }

    public double computeBonus() {
        double bonusPercentage = 0.0;

        if (seniorityDays >= 365*5) {
            bonusPercentage = 0.2;
        } else {
            bonusPercentage = 0.1;
        }

        return salary * bonusPercentage;
    }

    public double computeTotalSalary() {
        return salary * (1 + computeBonus());
    }
    
    public void increaseAge(int years) {
        this.age += years;
        this.seniorityDays += years * 365;
        this.salary *= Math.pow(1.03, years); 
    }

    public void printEmployeeDetails() {
        System.out.printf("""
            EMPLOYEE PROFILE: %s
            
            Position:       %s
            Age:            %d years old
            Seniority:      %d days
            Current Salary: $%,.2f
            %n""", 
            name, position, age, seniorityDays, salary);
    }
}