import java.util.Scanner;

public class _2_SequencesOfEqualStrings {
	// Enters an array of strings and finds in it all sequences of equal
	// elements.
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter sequence of words on the same line separated by space.");
		System.out.print("Text: ");
		String text = input.nextLine();
		String[] separator = text.split(" ");
		String checked = separator[0];
		for (int i = 1; i < separator.length; i++) {
			if (checked.equals(separator[i])) {
				System.out.print(checked + " ");
			} else {
				System.out.println(checked);
				checked = separator[i];
			}
		}
		System.out.println(separator[separator.length - 1]);
	}
}
