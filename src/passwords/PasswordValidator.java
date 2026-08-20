package passwords;

import java.util.Optional;
import java.util.function.Predicate;

public class PasswordValidator {

    private Predicate<String> AT_LEAST_8_CHARS = password -> password.length() >= 8;
    private Predicate<String> HAS_NUMBER = password -> password.chars().anyMatch(Character::isDigit);
    private Predicate<String> HAS_UPPERCASE = password -> password.chars().anyMatch(Character::isUpperCase);

    private Predicate<String> IS_VALID = AT_LEAST_8_CHARS.and(HAS_NUMBER).and(HAS_UPPERCASE);

    public Optional<String> validate(String password) {
        if (IS_VALID.test(password)) {
            return Optional.of(password);
        }
        return Optional.empty();
    }
}
