import java.util.Scanner;

public class _3_LargestSequenceOfEqualStrings {
	// Enters an array of strings and finds in it the largest sequence of equal
	// elements.(Example: hi yes yes yes bye =>yes yes yes).
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter string sequense on the same line separated by space.");
		System.out.print("Text=");
		String text = input.nextLine();
		String[] textParts = text.split(" ");
		String longestString = "";
		int maxCount = 0;

		for (int i = 0; i < textParts.length; i++) {
			int count = 1;
			for (int j = i + 1; j < textParts.length; j++) {
				if (textParts[i].equals(textParts[j])) {
					count++;
				}
				if (count > maxCount) {
					maxCount = count;
					longestString = textParts[j];
				}
			}
		}

		for (int i = 0; i < maxCount; i++) {
			System.out.printf("%s ", longestString);
		}
	}
}
