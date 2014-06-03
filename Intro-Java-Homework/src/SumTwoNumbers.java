import java.util.Scanner;

public class SumTwoNumbers {
	// Print the sum of two integer numbers.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two integer numbers.");
		System.out.print("First=");
		int firstNumber = input.nextInt();
		System.out.print("Second=");
		int secondNumber = input.nextInt();
		System.out.printf("The sum is: %d", firstNumber + secondNumber);
		input.close();
	}
}
