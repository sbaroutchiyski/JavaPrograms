import java.util.Scanner;

public class TheSmallestOfThreeNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Find the smallest of three numbers.
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[3];

		System.out.println("Enter three numbers.");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		double minNumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < minNumber) {
				minNumber = numbers[i];
			}
		}
		System.out.printf("Smallest: %.1f", minNumber);
	}
}
