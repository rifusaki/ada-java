package exam2.system;

public class ConsoleChannel implements Channel {
    public void send(String message) {
        System.out.println("[console] " + message);
    }
}
