package activityDSA;

import java.util.Scanner;

public class FizzBuzz {
	static int number;
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		number = scanner.nextInt();
		
		if (number % 3 == 0 && number % 5 == 0)
		{
			System.out.println(number + " is FizzBuzz");
		}
		else if (number % 3 == 0)
		{
			System.out.println(number + " is Fizz");
		}
		else if (number % 5 == 0)
		{
			System.out.println(number + " Buzz");
		}
		
		else if (number != 3  && number != 5)
		{
		
			System.out.println(number);
		}
	}

}
