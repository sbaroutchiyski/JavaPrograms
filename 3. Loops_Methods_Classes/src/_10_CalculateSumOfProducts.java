import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _10_CalculateSumOfProducts {
	// Calculate the sum of products.
	public static void main(String[] args) {
		List<Products> products = new ArrayList<>();
		List<String> ordered = new ArrayList<>();
		List<Double> quantity = new ArrayList<>();
		double sum = 0;
		try {
			File pInput = new File("Input3.txt");
			Scanner input = new Scanner(pInput);
			while (input.hasNext()) {
				String line = input.nextLine();
				String[] textParts = line.split(" ");
				products.add(new Products(textParts[0], Double
						.parseDouble(textParts[1])));
			}
			input.close();
		} catch (Exception e) {
			System.out.println(e + " FE");
		}
		try {
			File qInput = new File("Order.txt");
			Scanner input = new Scanner(qInput);
			while (input.hasNext()) {
				String line = input.nextLine();
				String[] separator = line.split(" ");
				quantity.add(Double.parseDouble(separator[0]));
				ordered.add(separator[1]);
			}
			input.close();
		} catch (Exception e) {
			System.out.println(e + "SE");
		}
		for (int i = 0; i < ordered.size(); i++) {
			String order = ordered.get(i);
			for (int j = 0; j < products.size(); j++) {
				if (order.equals(products.get(j).getName())) {
					sum += (quantity.get(i) * products.get(j).getPrice());
				}
			}
		}
		try {
			File out = new File("Output2.txt");
			PrintWriter print = new PrintWriter(out);
			print.printf("%.1f", sum);
			print.close();
		} catch (Exception e) {
			System.out.println(e + "TE");
		}
		System.out.printf("%.1f", sum);
	}
}
