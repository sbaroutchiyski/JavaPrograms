import java.util.Locale;
import java.util.Scanner;

public class PointInsideTheFigure {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Check whether a point is inside or outside of the figure.
		Locale.setDefault(Locale.ROOT);
		Scanner input = new Scanner(System.in);
		double x;
		double y;
		System.out
				.println("Enter coordinate (X and Y) of a point on the same line separated by space.");
		System.out.print("P(x,y)=");

		try {
			x = input.nextDouble();
			y = input.nextDouble();
		} catch (NumberFormatException e) {
			System.out.println(e);
			input.close();
			return;
		}
		boolean first = checkFirstRectangle(x, y);
		boolean second = checkSecondRectangle(x, y);
		boolean third = checkThirdRectangle(x, y);
		if (first == true || second == true || third == true) {
			System.out.printf("Inside");
		} else {
			System.out.printf("Outside");
		}
	}

	private static boolean checkThirdRectangle(double x, double y) {
		if ((x >= 20.0 && x <= 22.5) && (y >= 8.5 && y <= 13.5)) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean checkSecondRectangle(double x, double y) {
		if ((x >= 12.5 && x <= 17.5) && (y >= 8.5 && y <= 13.5)) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean checkFirstRectangle(double x, double y) {
		if ((x >= 12.5 && x <= 20.5) && (y >= 6.0 && y <= 8.5)) {
			return true;
		} else {
			return false;
		}
	}
}
