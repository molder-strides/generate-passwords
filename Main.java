public class Main {
    public static void main(String[] args) {
        PasswordGenerator generator = new PasswordGenerator();
        String password = generator.generatePassword(12);
        System.out.println("Generated Password: " + password);
    }
}
