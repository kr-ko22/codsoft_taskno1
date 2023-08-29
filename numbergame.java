import java.util.Scanner;
import java.util.Random;

public class LimitedGuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random.nextInt(100) + 1;
        int maxAttempts = 5;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;
        System.out.println("I've chosen a number between 1 and 100. You have " + maxAttempts + " attempts to guess it.");
        
        while (attempts < maxAttempts && !hasGuessedCorrectly) {
            System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + ". Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess == secretNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts.");
                System.out.println("your score is" + attempts);
            } else if (userGuess < secretNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }
        
        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you've used all your attempts. The correct number was " + secretNumber + ".");
        }
       
        scanner.close();
    }
}