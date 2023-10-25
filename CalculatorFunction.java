package activityDSA;

import java.util.Scanner;

public class CalculatorFunction {
static double a;
static double b;
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter First Number: ");
		a = scanner.nextDouble();
		System.out.print("Enter Second Number: ");
		b = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.print("Enter Operator: ");
		String op = scanner.nextLine();
		
		switch (op)
		{
		case "+":
			Addition();
			break;
		case "-":
			Subtraction();
			break;
		case "*":
			Multiplication();
			break;
		case "/":
			Division();
			break;
			
		}
	}
	//functions for addition
	public static void Addition()
	{
		double add = a+b;
		System.out.println(a + " + " + b + " is equals to " + add);
	}
	//functions for subtraction
	public static void Subtraction()
	{
		double sub = a-b;
		System.out.println(a + " - " + b + " is equals to " + sub);
	}
	//functions for multiplication
	public static void Multiplication()
	{
		double mul = a*b;
		System.out.println(a + " * " + b + " is equals to " + mul);
	}
	//functions for division
	public static void Division()
	{
		double div = a/b;
		System.out.println(a + " / " + b + " is equals to " + div);
	}
	

}


















