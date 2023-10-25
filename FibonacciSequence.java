package activityDSA;
import java.util.*;
public class FibonacciSequence {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Enter nth term series: ");
		int term = scanner.nextInt();
		
		int n1 = 0, n2 = 1, nextTerm = 0;
		for(int i = 1; i < term; i++) {
			if(i == 2) {
				System.out.print(n2 + " ");
			}
			
			nextTerm = n1 + n2;
			n1 = n2;
			n2 = nextTerm;
			
			System.out.print(nextTerm + " ");
		}
	}

}
