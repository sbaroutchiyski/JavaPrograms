import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintTheCurrentDataAndTime {
	// Print current date and time.
	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		Date date = new Date();
		System.out.println("Current date and time: " + dateFormat.format(date));
	}
}
