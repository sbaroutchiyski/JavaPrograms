import java.util.Scanner;

public class _4_LongestIncreasingSequence {
	// Find all increasing sequences inside an array of integers.
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number's count (N).");
		System.out.print("N=");
		int n = input.nextInt();
		int[] numbers = new int[n + 1]; // (n+1) - because miss the last number.
		int maxCount = 0;
		int count = 0;
		int indexBegin = 0;
		int indexEnd = 0;
		System.out.printf(
				"Enter %d numbers on the same line separated by space.", n);
		System.out.print("\nNumbers: ");
		for (int i = 0; i < numbers.length - 1; i++) {
			numbers[i] = input.nextInt();
		}
		for (int i = 0; i < numbers.length - 1; i++) {

			if (numbers[i] < numbers[i + 1]) {
				System.out.printf("%d ", numbers[i]);
				count++;
			} else {
				System.out.println(numbers[i]);

				count = 0;
			}
			if (count > maxCount) {
				maxCount = count;
				indexEnd = i + 1;
				indexBegin = indexEnd - maxCount;
			}
		}
		System.out.println(indexEnd);
		System.out.print("Longest: ");
		for (int i = indexBegin; i <= indexEnd; i++) {
			System.out.printf("%d ", numbers[i]);
		}
	}
}
