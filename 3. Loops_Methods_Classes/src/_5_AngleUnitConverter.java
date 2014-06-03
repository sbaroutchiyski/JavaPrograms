import java.util.Scanner;

public class _5_AngleUnitConverter {
	// Convert from degrees to radians and from radians to degrees.
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of conversions N.");
		System.out.print("N=");
		int numberOfConversions = input.nextInt();
		double[] angles = new double[numberOfConversions];
		String[] results = new String[numberOfConversions];
		System.out
				.printf("Enter %d angles and angle type(deg or rad) on the same line separated by space.\n",
						numberOfConversions);
		for (int i = 0; i < numberOfConversions; i++) {
			System.out.printf("T(%d)=", i + 1);
			angles[i] = input.nextDouble();
			String angleType = input.next();
			double tempAngle = 0;
			String tempType = "";
			if (angleType.equals("deg")) {
				tempAngle = convertDegreeToRadians(angles[i]);
				tempType = " rad";
			}
			if (angleType.equals("rad")) {
				tempAngle = convertRadianToDegrees(angles[i]);
				tempType = " deg";
			}
			results[i] = String.format("%.8s", tempAngle) + tempType;
		}
		for (String angle : results) {
			System.out.printf("%s\n", angle);
		}
	}

	private static double convertRadianToDegrees(double angle) {
		double degree = (180 * angle) / Math.PI;
		return degree;
	}

	private static double convertDegreeToRadians(double angle) {
		double radian = (angle * Math.PI) / 180;
		return radian;
	}

}
