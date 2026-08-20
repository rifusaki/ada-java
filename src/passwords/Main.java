package passwords;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();

        List<String> passwords = List.of("abc123", "Password1", "short", "Password123");

        passwords.stream()
                .map(password -> validator.validate(password)
                .map(valid -> "'" + valid + "' is valid.")
                .orElse("'" + password + "' does not meet all rules."))
                .forEach(System.out::println);
    }
}
