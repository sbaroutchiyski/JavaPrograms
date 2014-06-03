import java.util.Scanner;

public class CalculateTriangleArea {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Calculate triangle area.
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter the coordinates (X and Y) of triangle on the same line separated by space.");
		double[] xPos = new double[3];
		double[] yPos = new double[3];
		double sideA;
		double sideB;
		double sideC;
		double halfPerimeter;
		double triangleArea;
		for (int i = 0; i < 3; i++) {
			System.out.printf("P(x%d,y%d)=", i + 1, i + 1);
			xPos[i] = input.nextDouble();
			yPos[i] = input.nextDouble();
		}
		sideA = Math.sqrt(Math.pow(xPos[1] - xPos[0], 2)
				+ Math.pow(yPos[1] - yPos[0], 2));
		sideB = Math.sqrt(Math.pow(xPos[2] - xPos[1], 2)
				+ Math.pow(yPos[2] - yPos[1], 2));
		sideC = Math.sqrt(Math.pow(xPos[2] - xPos[0], 2)
				+ Math.pow(yPos[2] - yPos[0], 2));
		halfPerimeter = 0.5 * (sideA + sideB + sideC);
		triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - sideA)
				* (halfPerimeter - sideB) * (halfPerimeter - sideC));
		System.out.printf("Triangle area is: %.0f", triangleArea);
	}
}
