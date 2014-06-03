import java.io.File;
import java.util.Scanner;

public class _8_SumNumbersFromTextFile {
	// Read a text file "Input.txt" holding a sequence of integer numbers, each
	// at a separate line. Print the sum of the numbers at the console.
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int sum = 0;
		try {
			File file = new File("input.txt");
			Scanner input = new Scanner(file);
			while (input.hasNextInt()) {
				int number = input.nextInt();
				sum += number;
			}
		} catch (Exception err) {
			System.out.println("Error.");
			return;
		}
		System.out.printf("The sum is: %d", sum);
	}
}
