import java.util.Scanner;

public class CountOfEqualBitPairs {
	// Count how many sequences of two equal bits ("00" or "11") can be found in
	// the binary representation of given integer number n (with overlapping).
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer N.");
		System.out.print("N=");
		int number = input.nextInt();
		int zeroPairs = countEqualDigits(number, '0');
		int onePairs = countEqualDigits(number, '1');
		System.out.printf("Number:(%d) %s", number,
				Integer.toBinaryString(number));
		System.out.printf("\nCount=%d", onePairs + zeroPairs);
	}

	private static int countEqualDigits(int number, char digit) {
		int totalCount = 0;
		int counter = 0;
		String stringNumber = Integer.toBinaryString(number);
		for (int i = 0; i < stringNumber.length(); i++) {
			char tempChar = stringNumber.charAt(i);
			if (tempChar == digit) {
				counter++;
			} else {
				counter = 0;
			}
			if (counter > 1) {
				totalCount++;
			}
		}
		return totalCount;
	}
}
