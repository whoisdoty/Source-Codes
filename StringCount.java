package activityDSA;
import java.util.Scanner;
public class StringCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter a string: ");
		String word = scanner.nextLine();
		
		//count the letter of the string
		int stringLength = word.length();
		
		System.out.println(word + " has " + stringLength + " letters.");

	}

}
