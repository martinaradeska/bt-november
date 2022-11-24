import enumarations.Level;

import java.util.Random;

public class Setup {
    private final Level level = Level.values()[new Random().nextInt(Level.values().length)];
    private final int max = level.getValue();
    private final int secretNumber = (int) (Math.random() * (max));

    public Level getLevel() {
        return level;
    }

    public int getMax() {
        return max;
    }

    public int getSecretNumber() {
        return secretNumber;
    }
}
