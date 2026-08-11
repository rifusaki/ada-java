package exam2.system;

import java.util.ArrayList;
import java.util.List;

public class Fleet<T extends Vehicle> {
    private List<T> vehicles;
    private Channel channel;

    public Fleet(Channel channel) {
        this.vehicles = new ArrayList<T>();
        this.channel = channel;
    }

    public void add(T vehicle) {
        this.vehicles.add(vehicle);
    }

    public void alert(String message) {
        for (T vehicle : this.vehicles) {
            this.channel.send(vehicle.description() + ": " + message);
        }
    }
}
