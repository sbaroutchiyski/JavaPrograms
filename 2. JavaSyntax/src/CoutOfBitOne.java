import java.util.Scanner;

public class CoutOfBitOne {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Calculate the count of bits 1 in the binary representation of given
		// integer number n.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Integer N.");
		System.out.print("N=");
		int number = input.nextInt();
		int countOne = 0;
		for (int i = 0; i < 32; i++) {
			int temp = number >> i;
			if ((temp & 1) == 1) {
				countOne++;
			}
		}
		String binary = Integer.toBinaryString(number);
		System.out.printf("Number: (%d) %s", number,
				String.format("%32s", binary).replace(' ', '0'));
		System.out.printf("\nCount: %d", countOne);
	}
}
