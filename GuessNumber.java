import java.util.Random;
import java.util.Scanner;
public class GuessNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int randomnum = random.nextInt(100) + 1;
		int guess;
		int attempts = 0;
		final int maxattempts = 3;
		
		while (attempts < maxattempts){
			System.out.println("Hello, Please write a number from 1-100: ");
			guess = scanner.nextInt();
			attempts++;
			
			if (guess > randomnum) {
				System.out.println("Your guess is too high");
			} else if (guess < randomnum) {
				System.out.println("Your guess is too low");
			} else {
				System.out.println("Your guess is right!\nAttempts taken:"+ attempts);
				scanner.close();
                return;
			}
		}
		
		
			System.out.println("The number was: " + randomnum + "\nYou have reached the max attempts.");
		scanner.close();
	}

}
