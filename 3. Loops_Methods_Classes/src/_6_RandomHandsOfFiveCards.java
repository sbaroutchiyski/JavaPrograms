import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class _6_RandomHandsOfFiveCards {
	// Generate n random hands of 5 different cards form a standard suit of 52
	// cards.
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String[] deck = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		String[] suits = { "♠", "♣", "♥", "♦" };
		List<String> cards = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		for (int i = 0; i < deck.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				cards.add(deck[i] + suits[j]);
			}
		}
		System.out.println("Enter the number of the card hands (N).");
		System.out.print("N=");
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				String randomNumber = cards.get(generator.nextInt(52));
				System.out.print(randomNumber + " ");
			}
			System.out.println();
		}
	}
}
