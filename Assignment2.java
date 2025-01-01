import java.util.Scanner;

public class Assignment2 
{
	public static void main(String args [])
	{
		//Declare variables 
		int number1, number2, result;
	
		//create a scanner object
		Scanner input= new Scanner(System.in);
	
		System.out.print("Enter the first number: ");
	   	number1 = input.nextInt();
		
		System.out.print("Enter the second number: ");
		number2 = input.nextInt();
		
		//calculate the sum
		result = number1 + number2;
		
		//Display the result
		System.out.println("The sum is " + result);
		
		//calculate the difference 
		result = number1 - number2;
		
		System.out.println("the difference is " + result);
		
		result = number1 * number2;
		
		System.out.println("the product is " + result);
		
		int X,Square, Z, Y;
		
		//problem 2 
		System.out.print("Enter the first number: ");
		X = input.nextInt();
		
		System.out.print("Enter the second number: ");
		Y = input.nextInt();
		
		result = X + Y;
		Square = result * result;
		
		//in order to summon a value that can vary depending on the person i have to use printf however you asked us to use println so this was the only solution i could think of
		System.out.println("The square of the sum of 3 and 4 is " + Square);
		
		//problem 3
		
		System.out.print("enter number of items: ");
		X = input.nextInt();
		
		System.out.print("enter cost per item: ");
		Y = input.nextInt();
		
		result = X * Y;
		System.out.println("the cost of items is: " + result);
		
		//Problem 4
		double x, y, z, result4;
	
		System.out.print("Enter the first exam's score: ");
		x = input.nextDouble();
		
		System.out.print("Enter the second exams's score: ");
		y = input.nextDouble();
	
		System.out.print("Enter the third exam's score: ");
		z =  input.nextDouble();
		
		result4 = (x + y + z) / 3;
		
		System.out.println("average score is " + result4);
		
		//problem 5
		int result1, result2;
		
		System.out.println("Enter the number of items: ");
		X = input.nextInt();
		
		result1 = X/12;
		result2 = X - 12*result1;
		
		System.out.println("The company produced " + result1 + " dozens and " + result2 +" items");
	
	}
	}

