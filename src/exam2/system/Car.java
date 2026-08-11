package exam2.system;

public class Car implements Vehicle {
    private String plate;

    public Car(String plate) {
        this.plate = plate;
    }

    public String description() {
        return "car " + this.plate;
    }
}
