import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _7_DaysBetweenTwoDates {
	// Calculate the difference between two dates in number of days.
	@SuppressWarnings("resource")
	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter two dates using format(dd-MM-yyyy).");
		System.out.print("First date: ");
		String dateOne = input.nextLine();
		System.out.print("Second date: ");
		String dateTwo = input.nextLine();
		Date firstDate = dateFormat.parse(dateOne);
		Date secondDate = dateFormat.parse(dateTwo);
		differenceOfDays(firstDate, secondDate);
	}

	private static void differenceOfDays(Date firstDate, Date secondDate) {
		long dateOne = firstDate.getTime();
		long dateTwo = secondDate.getTime();
		System.out.println(Math.abs((dateTwo - dateOne) / 86400000));
	}
}
