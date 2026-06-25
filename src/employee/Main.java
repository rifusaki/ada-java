package employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Izutsumi", 17, "Developer", 60000, 2000);
        Employee employee2 = new Employee("Falin", 23, "Manager", 80000, 4000);
        Employee employee3 = new Employee("Marcille", 50, "Intern", 30000, 1000);

        System.out.println("Before increasing age:\n");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();
        employee3.printEmployeeDetails();

        employee1.increaseAge(2);

        System.out.println("-------------------\nAfter increasing age:\n");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();
        employee3.printEmployeeDetails();
    }
}
