package exam2.system;

public class EmailChannel implements Channel {
    public void send(String message) {
        System.out.println("[email] " + message);
    }
}
