import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        boolean guessed = false;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println(" The number is between 1 and 100. Try to guess it.");

        while (!guessed) {
            System.out.print("Your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                guessed = true;
                System.out.println("Congratulations! You've guessed the number " + secretNumber + "!");
            }
        }
    }
}
