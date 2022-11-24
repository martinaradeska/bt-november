import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Setup setup = new Setup();
        GuessGame.guessNumber(0, setup.getMax(), setup.getSecretNumber());
    }
}
