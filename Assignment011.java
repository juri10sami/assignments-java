 import java.util.Scanner;

public class Assignment011 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//program 1
	for(double inch, cm,count=1; count<=3; count++) {
		System.out.println(" Enter the value in inches:");
		inch = input.nextDouble(); 
		
		cm = inch * 2.54;
		
		System.out.println( "cm: " + cm);
	}
	System.out.println(" ");
	//program2
	
	for(int count=1; count<=10 ; count++) {
		System.out.print("*");
	}
	System.out.println(" ");
	//program 3
	int k;
	System.out.print("Enter the value of k: ");
	k = input.nextInt();
	for(int count=1; count<=k; count++)
	{
		System.out.print("*");
	}
	System.out.println(" ");
	//program 4
	for(int row = 1; row <=8; row++) 
	{
		for(int col =1; col<=8-row; col++) 
			System.out.print("*");
		System.out.println("*");
		
	}
	System.out.println(" ");
	for(int row =8; row>=1 && row<=8 ; row++) {
		for(int col =1; col<=8-row; col++)
			System.out.print("*");
		System.out.print("*");
	}
	
}
}
