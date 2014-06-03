import java.util.Scanner;

public class FormattingNumbers {
	// Format three numbers.
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter an integer (a) and two floating-point (b,c) numbers.");
		System.out.print("a=");
		int firstNumber = input.nextInt();
		if (firstNumber < 0 || firstNumber > 500) {
			System.out.println("Out of range (a >= 0 or a <= 500).");
			return;
		}
		System.out.print("b=");
		double secondNumber = input.nextDouble();
		System.out.print("c=");
		double thirdNumber = input.nextDouble();
		String binaryNumber = String.format("%10s",
				Integer.toBinaryString(firstNumber)).replace(' ', '0');
		System.out.printf("|%-10X|%s|%10.2f|%-10.3f|", firstNumber,
				binaryNumber, secondNumber, thirdNumber);
	}
}
