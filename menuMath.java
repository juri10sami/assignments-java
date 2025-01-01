import java.util.Scanner;

public class menuMath {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter choice");
		String choice = input.next();
		
		System.out.println("Enter the number: ");
		double x = input.nextDouble();
		
		if(choice.equals("l"))
			log10(x);
		else if(choice.equals("s"))
			sine(x);
		else if(choice.equals("c"))
			cosine(x);
		else if(choice.equals("t"))
			tangent(x);
		else if(choice.equals("e"));
	}
			
		
	
	
	public static void log10(double x) {
		System.out.println(Math.log10(x));}
	
	public static void sine(double x) {
		Math.toRadians(x);
		System.out.println(Math.sin(x));
	}
	public static void cosine(double x) {
		Math.toRadians(x);
		System.out.println(Math.cos(x));
	}
	public static void tangent(double x) {
		Math.toRadians(x);
		System.out.println(Math.tan(x));
	}
	public static void exponential(double x) {
		
		System.out.println(Math.exp(x));
	}
	
}
