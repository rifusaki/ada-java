package injection;

/**
 * `UserRegistration` receives its dependencies through the constructor, so a test can inject `MockDatabase` and `MockEmailSender` without connecting to a database or sending real emails.
 * Before, `UserRegistration` depended directly on `MySQLConnection` and `EmailSender`. Now it depends on interfaces, and concrete implementations depend on those abstractions.
 */

public class Main {
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration(
            new MockDatabase(),
            new MockEmailSender()
        );

        registration.register("Izutsumi");
        registration.register("Falin");
    }
}
