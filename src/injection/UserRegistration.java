package injection;

public class UserRegistration {
    private final DatabaseOperations database;
    private final EmailOperations emailSender;

    public UserRegistration(DatabaseOperations database, EmailOperations emailSender) {
        this.database = database;
        this.emailSender = emailSender;
    }

    public void register(String name) {
        database.insert(name);
        emailSender.sendWelcome(name);
    }
}
