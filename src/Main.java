import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        int randomNumber = random.nextInt(10) + 1;
        System.out.println("Guess a number from 1 to 10: ");
        int guess = sc.nextInt();
        while (guess != randomNumber) {
            if (randomNumber < guess){
                System.out.println("Try less. ");
                guess = sc.nextInt();
            }
            else if (randomNumber > guess){
                System.out.println("Try greater. ");
                guess = sc.nextInt();
            }
            attempts++;
        }
        sc.close();
        System.out.println("You guessed: " + guess);
        System.out.println("You attempted " + attempts + " times.");
    }
}
