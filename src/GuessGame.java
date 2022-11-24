public class GuessGame {
    public static boolean guessNumber(int start, int end, int secretNumber) {
        int guessingNumber = start + ((end - start) / 2);
        if (start > end) {
            return false;
        }
        if (secretNumber == guessingNumber) {
            System.out.println("The one!");
            return true;
        } else if (guessingNumber < secretNumber) {
            System.out.println("Bigger!");
            return guessNumber(guessingNumber + 1, end, secretNumber);
        } else {
            System.out.println("Smaller!");
            return guessNumber(start, guessingNumber - 1, secretNumber);
        }
    }
}
