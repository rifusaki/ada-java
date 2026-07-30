package injection;

public class MockEmailSender implements EmailOperations {
    @Override
    public void sendWelcome(String name) {
        System.out.println("Mock email: welcome sent to " + name);
    }
}
