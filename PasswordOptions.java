public class PasswordOptions {
    public int length;
    public boolean includeUppercase;
    public boolean includeLowercase;
    public boolean includeDigits;
    public boolean includeSymbols;

    public PasswordOptions(int length, boolean includeUppercase, boolean includeLowercase,
                           boolean includeDigits, boolean includeSymbols) {
        this.length = length;
        this.includeUppercase = includeUppercase;
        this.includeLowercase = includeLowercase;
        this.includeDigits = includeDigits;
        this.includeSymbols = includeSymbols;
    }
}
