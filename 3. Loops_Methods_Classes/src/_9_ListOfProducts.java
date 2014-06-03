import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _9_ListOfProducts {
	// Read from a text file named "Input.txt" a list of products.Sort list and
	// save it to Output.txt.
	public static void main(String[] args) {
		List<Products> product = new ArrayList<>();
		List<String> arrangedList = new ArrayList<>();
		try {
			File in = new File("Input2.txt");
			Scanner input = new Scanner(in);
			while (input.hasNext()) {
				String temporaryText = input.nextLine();
				String[] textParts = temporaryText.split(" ");
				Products p = new Products(textParts[0],
						Double.parseDouble(textParts[1]));
				product.add(p);
			}
			input.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		for (int i = 0; i < product.size(); i++) {
			String arranged = product.get(i).getPrice() + " "
					+ product.get(i).getName();
			arrangedList.add(arranged);
		}
		Collections.sort(arrangedList);
		for (String temp : arrangedList) {
			System.out.println(temp);
		}
		try {
			File out = new File("Output.txt");
			PrintWriter printWriter = new PrintWriter(out);
			for (int i = 0; i < arrangedList.size(); i++) {
				printWriter.println(arrangedList.get(i));
			}
			printWriter.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
