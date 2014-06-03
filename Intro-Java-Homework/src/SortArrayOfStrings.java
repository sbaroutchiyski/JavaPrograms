import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings {
	// Sort an array of strings (towns).
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of towns N.");
		System.out.print("N=");
		int townNumbers = input.nextInt();
		String[] towns = new String[townNumbers];
		input.nextLine();
		System.out.printf("Enter %d towns\n", townNumbers);
		for (int i = 0; i < towns.length; i++) {
			System.out.printf("Town[%d]:", i + 1);
			towns[i] = input.nextLine();
		}
		Arrays.sort(towns);
		for (String city : towns) {
			System.out.println(city);
		}
		input.close();
	}
}
