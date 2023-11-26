  import java.util.Random;
import java.util.Scanner;

    public class NumberGuessingGame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            // Set the range for the random number (1 to 100 in this example)
            int minRange = 1;
            int maxRange = 100;
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;

            int userGuess;
            int attempts = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have selected a random number between " + minRange + " and " + maxRange + ". Try to guess it.");

            do {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                }
            } while (userGuess != randomNumber);

            // Close the scanner
            scanner.close();
        }
    }