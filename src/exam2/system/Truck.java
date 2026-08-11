package exam2.system;

public class Truck implements Vehicle {
    private String plate;

    public Truck(String plate) {
        this.plate = plate;
    }

    public String description() {
        return "truck " + this.plate;
    }
}
