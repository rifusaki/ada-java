package vehicles;

public class Vehicle {
    protected String brand;
    protected String model;
    protected int speed;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public void accelerate(int amount){
        if (amount< 0){
            throw new IllegalArgumentException("Acceleration amount cannot be negative.");
        }

        this.speed += amount;
    }

    public void brake(int amount){
        if (amount< 0){
            throw new IllegalArgumentException("Brake amount cannot be negative.");
        }
        
        if ((this.speed - amount) < 0) { this.speed = 0; }
        else { this.speed -= amount; }
    }

    public void displayInfo() {
        System.out.println("""
            Vehicle Information:
            Brand: %s
            Model: %s
            Current Speed: %d km/h""".formatted(brand, model, speed));
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: %s\n".formatted(numberOfDoors));
    }
}

class Motorcycle extends Vehicle {
    private int cilinderCapacity;

    public Motorcycle(String brand, String model, int cilinderCapacity) {
        super(brand, model);
        this.cilinderCapacity = cilinderCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cilinder Capacity: %s\n".formatted(cilinderCapacity));
    }
}
