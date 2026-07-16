package vehicles;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("Kia", "Stonic", 5),
            new Motorcycle("Yamaha", "??", 150)
        };

        for (Vehicle vehicle : vehicles) {
            System.out.println("");
            vehicle.displayInfo();
            vehicle.accelerate(50);
            vehicle.displayInfo();
            vehicle.brake(20);
            vehicle.displayInfo();
            vehicle.brake(50);
            vehicle.displayInfo();
            System.out.println("-------------------------");
        }
    }
}
