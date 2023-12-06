import java.util.Random;

public class PasswordGenerator {
    private CharacterGenerator charGenerator;
    private Random random;

    public PasswordGenerator() {
        this.charGenerator = new CharacterGenerator();
        this.random = new Random();
    }

    public String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomChar = charGenerator.getRandomCharacter();
            password.append(randomChar);
        }
        return password.toString();
    }
}
