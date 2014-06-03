import java.util.Scanner;

public class PointsInsideTheHouseAdvansed {
	// Check whether a point is inside or outside the house.
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter X and Y coordinate of the point on the same line separated by space.");
		System.out.print("P(x,y)=");
		double xPos = input.nextDouble();
		double yPos = input.nextDouble();
		double positionAB = 8.5 - yPos;
		double positionAC = -xPos - yPos + 21;
		double positionBC = xPos - yPos - 14;
		boolean figureOne = false;
		boolean figureTwo = false;
		boolean figureThree = false;
		if (positionAB >= 0 && positionAC <= 0 && positionBC <= 0) {
			figureOne = true;
		}
		if (xPos >= 12.5 && xPos <= 17.5 && yPos >= 8.5 && yPos <= 13.5) {
			figureTwo = true;
		}
		if (xPos >= 20 && xPos <= 22.5 && yPos >= 8.5 && yPos <= 13.5) {
			figureThree = true;
		}
		if (figureOne == true || figureTwo == true || figureThree == true) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
	}
}
