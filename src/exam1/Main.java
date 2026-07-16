package exam1;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        demonstrateParking();
        System.out.println();
        demonstratePayroll();
        System.out.println();
    }

    private static void demonstratePayroll() {
        System.out.println("Payroll\n");

        Payroll payroll = new Payroll();
        Employee fixedSalary = new FixedSalaryEmployee("Laios", 3200);
        Employee seller = new Seller("Marcille", 1800, 12500, 0.07);
        Employee sellerWithNoSales = new Seller("Izutsumi", 1800, 0, 0.05);
        HourlySalaryEmployee hourlyWithNoHours = new HourlySalaryEmployee("Senshi", 45);
        HourlySalaryEmployee partTimeHourly = new HourlySalaryEmployee("Falin", 32, 18.5);

        payroll.addEmployee(fixedSalary);
        payroll.addEmployee(seller);
        payroll.addEmployee(sellerWithNoSales);
        payroll.addEmployee(hourlyWithNoHours);
        payroll.addEmployee(partTimeHourly);

        System.out.println("Laios' fixed salary: " + fixedSalary.getSalary());
        System.out.println("Marcille's salary with commission: " + seller.getSalary());
        System.out.println("Izutsumi's salary with zero sales (terrible saleswoman): " + sellerWithNoSales.getSalary());
        System.out.println("Senshi's salary with zero hours: " + hourlyWithNoHours.getSalary());
        System.out.println("Falin's part-time salary: " + partTimeHourly.getSalary());
        System.out.println("Total payroll: " + payroll.totalPayment());
    }

    private static void demonstrateParking() {
        System.out.println("Parking\n");

        Parking parking = new Parking(2);

        System.out.println("Free spaces: " + parking.getFreeSpaces());
        System.out.println("Park car 1: " + parking.park());
        System.out.println("Park car 2: " + parking.park());
        System.out.println("Try to park when full: " + parking.park());
        System.out.println("Free spaces: " + parking.getFreeSpaces());
        System.out.println("Car leaves: " + parking.leave());
        System.out.println("Car leaves: " + parking.leave());
        System.out.println("Try to leave when empty: " + parking.leave());
        System.out.println("Free spaces: " + parking.getFreeSpaces());
    }
}
