import java.util.Scanner;

public class _2_GenerateThreeLetterWords {
	// Generate and print all 3-letter words consisting of given set of
	// characters.
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word");
		System.out.print("Word: ");
		String word = input.next();
		char[] combinations = word.toCharArray();
		for (int i = 0; i < combinations.length; i++) {
			for (int j = 0; j < combinations.length; j++) {
				for (int k = 0; k < combinations.length; k++) {
					System.out.printf("%c%c%c\n", combinations[i],
							combinations[j], combinations[k]);
				}
			}
		}
	}
}
