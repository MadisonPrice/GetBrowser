/*
 * Madison Price
 * 7/20/2020
 */
import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class browser {

	public static void main(String args[]) throws Exception {
		boolean input1 = false;
		Scanner input = new Scanner(System.in);

		// Use a do statement to catch invalid inputs

		do {
			System.out.println("Type the browser you would like to use:");
			System.out.println("Type Google for Google:");
			System.out.println("Type Bing for Bing:");
			System.out.println("Type Yahoo for Yahoo:");
			
			// Use nextLine to receive strings for users to input which browser they want to
			

			String select = input.nextLine();
			switch (select) {

			case "Google":
				Desktop d = Desktop.getDesktop();
				d.browse(new URI("https://www.google.com/webhp?authuser=1"));
				input1 = true;
				break;
			case "Bing":
				Desktop e = Desktop.getDesktop();
				e.browse(new URI("https://www.bing.com/"));
				break;

			case "Yahoo":
				Desktop f = Desktop.getDesktop();
				f.browse(new URI("https://www.bing.com/"));
				break;
			default:
				System.out.println("\n" + "Invalid Choice, Please Try Again" + "\n");
				System.out.println("\n" + "--------------------------------" + "\n");
				input1 = false;
				break;
			}
		// Use the input1 variable for the while loop to restart the 
		// loop if the user inputs incorrect option
		} while (input1 == false);

	}
}
