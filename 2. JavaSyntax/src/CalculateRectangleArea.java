import java.util.Scanner;

public class CalculateRectangleArea {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Calculate the area of rectangle.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the height and width of rectangle.");
		System.out.print("Height=");
		int height = input.nextInt();
		System.out.print("Width=");
		int width = input.nextInt();
		int rectangleArea = height * width;
		System.out.printf("The area of rectangle is: %d", rectangleArea);
	}
}
