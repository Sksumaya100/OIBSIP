import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
               System.out.println("Welcome to the Number Guessing Game!");
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        final int MAX_TRIES = 10;

        while (win == false) {
            
            System.out.println("Guess a number between 1 and 100:");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                 System.out.println("Congratulations! You've guessed the correct number: " + numberToGuess);
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high");
            }

            if (numberOfTries == MAX_TRIES) {
                System.out.println("You've reached the maximum number of tries. The number was " + numberToGuess);
                break;
            }
        }

        if (win) {
            System.out.println("You win!");
            System.out.println("The number was " + numberToGuess);
            System.out.println("It took you " + numberOfTries + " tries");
        }
    }
}
