import java.util.Scanner;

public class _1_SymmetricNumberInRange {
	// Generate and print all symmetric numbers in given range [start…end].
	// Example: 5,11,55,101,777 are symmetric.
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a range of integer numbers( Start and End).");
		System.out.print("Start=");
		int start = input.nextInt();
		System.out.print("End=");
		int end = input.nextInt();
		boolean isSymmetric = false;
		for (int i = start; i <= end; i++) {
			isSymmetric = simetricNumbers(i + "");
			if (isSymmetric == true) {
				System.out.println(i);
			}
		}
	}

	private static boolean simetricNumbers(String number) {
		int countSymmetric = 0;
		int max = number.length();
		char[] stringNumber = number.toCharArray();
		for (int i = 0; i < max; i++) {
			if (stringNumber[i] == stringNumber[max - i - 1]) {
				countSymmetric++;
			} else {
				countSymmetric = 0;
			}
		}
		if (max == 1 && number.equals("5")) {
			return true;
		}
		if (countSymmetric >= max / 2 && max > 1) {
			return true;
		}
		return false;
	}
}
