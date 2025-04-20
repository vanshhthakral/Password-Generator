import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🔐 Welcome to the Java Password Generator!");
        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        System.out.print("Include uppercase letters? (y/n): ");
        boolean includeUpper = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include lowercase letters? (y/n): ");
        boolean includeLower = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include digits? (y/n): ");
        boolean includeDigits = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include symbols? (y/n): ");
        boolean includeSymbols = scanner.next().equalsIgnoreCase("y");

        PasswordOptions options = new PasswordOptions(length, includeUpper, includeLower, includeDigits, includeSymbols);
        PasswordGenerator generator = new PasswordGenerator();

        try {
            String password = generator.generatePassword(options);
            System.out.println("Generated Password: " + password);
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        scanner.close();
    }
}
