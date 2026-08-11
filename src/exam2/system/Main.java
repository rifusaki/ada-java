package exam2.system;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        // channel injected in the constructor of fleet
        Fleet<Vehicle> fleet = new Fleet<Vehicle>(new ConsoleChannel());

        fleet.add(new Car("IZU123"));
        fleet.add(new Truck("TSMI456"));

        fleet.alert("needs maintenance");
        System.out.println();
    }
}
