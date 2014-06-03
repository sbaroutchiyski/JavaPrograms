import java.util.Scanner;

public class DecimalToHexadecimal {
	// enters a positive integer number num and converts and prints it in
	// hexadecimal form
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Convert decimal number to hexadecimal.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal number N.");
		System.out.print("N=");
		int decimalNumber = input.nextInt();
		String hexadecimal = Integer.toHexString(decimalNumber);
		System.out.printf("hexadecimal representation: %s",
				hexadecimal.toUpperCase());
	}
}
