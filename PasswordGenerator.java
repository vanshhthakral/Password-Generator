import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+<>?/{}[]|";

    private SecureRandom random = new SecureRandom();

    public String generatePassword(PasswordOptions options) {
        StringBuilder pool = new StringBuilder();

        if (options.includeUppercase) pool.append(UPPERCASE);
        if (options.includeLowercase) pool.append(LOWERCASE);
        if (options.includeDigits) pool.append(DIGITS);
        if (options.includeSymbols) pool.append(SYMBOLS);

        if (pool.length() == 0) {
            throw new IllegalArgumentException("At least one character type must be selected.");
        }

        StringBuilder password = new StringBuilder(options.length);
        for (int i = 0; i < options.length; i++) {
            int index = random.nextInt(pool.length());
            password.append(pool.charAt(index));
        }

        return password.toString();
    }
}
