package activityDSA;
import java.util.Scanner;
public class Discount {
	//global declaration
		public static double calculateFinalPrice(int originalPrice, int discountPercentage) {
		   double discountAmount = (discountPercentage / 100.0) * originalPrice;
		   double finalPrice = originalPrice - discountAmount;
		   return finalPrice;
			    
		}
	

	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.print("Enter Original Price: ");
	        int originalPrice = scanner.nextInt();
	        System.out.print("Enter Discounted Percentage: ");
	        int discountPercentage = scanner.nextInt();

	        double finalPrice = calculateFinalPrice(originalPrice, discountPercentage);

	        System.out.println("The final price after a " + discountPercentage + "% discount is: " + finalPrice);
	    }
	}


