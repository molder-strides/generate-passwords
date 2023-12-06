public class PasswordPolicy {
    private int minLength;

    public PasswordPolicy(int minLength) {
        this.minLength = minLength;
    }

    public boolean isValidPassword(String password) {
        return password.length() >= minLength;
    }
}
