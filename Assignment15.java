import java.util.Scanner;
public class Assignment15 {
	public static double perimeter(double length, double width) {
		double result;
		result = 2*(length+ width);                  /* public static double perimeter(double length, double width){return 2 * (length +width)}*/
		return result;
	}
	
	public static double area(double length, double width) {
		return length* width; 
	}
	public static double circumference(double radius) {
		return 2*radius*Math.PI;
	}
	public static double area(double radius) {
		return Math.pow(radius, 2) *Math.PI;
	}
	public static double UStoCanadian(double UsDollars) {
		return UsDollars*1.317;
	}
	public static double CanadiantoUS(double CanadianDollars) {
		return CanadianDollars/1.317;
	}
	public static double wage(double numberOfHours, double payRate) {
		return numberOfHours*payRate;
	}
	public static double perimeter(double a, double b, double c) {
		return a+ b+ c;
	}
	public static double area (double a, double b, double c, double s) {
		return Math.sqrt((s*(s-a)*(s-b)*(s-c)));
	}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		//program 1
		System.out.print("Enter the length and width: ");
		double len = input.nextDouble();
		double wid = input.nextDouble();
		
		double perimeter = perimeter (len, wid);
		System.out.println("perimeter: " + perimeter);
		
		double area = area(len, wid);
		System.out.println("area: " + area);
		
		// program 2
		System.out.print("Enter the radius: ");
		double rad= input.nextDouble();
		double circumference = circumference(rad);
		 area = area(rad);
		 System.out.println("circumference: " + circumference + " area" + area);
		 //program 3
		 System.out.println("Enter the amount in US dollars: ");
		 double US = input.nextDouble();
		 double UStoCanadian = UStoCanadian(US);
		 System.out.println("in CAD: " + UStoCanadian);
		 System.out.println("Enter the amount in CAD dollars");
		 double CAD = input.nextDouble();
		 double CanadiantoUS =CanadiantoUS(CAD);
		 System.out.println("in US dollars: " + CanadiantoUS);
		 //program 4
		 System.out.println("Enter thr number of hours worked and the hourly pay rate: ");
		 double hoursWorked =input.nextDouble();
		 double payRate = input.nextDouble();
		 double wage=wage(hoursWorked, payRate);
		 System.out.println("wages earned: " + wage);
		 //program 5
		 System.out.println("Enter a, b, c: ");
		 double a = input.nextDouble();
		 double b = input.nextDouble();
		 double c = input.nextDouble();
		 perimeter =perimeter(a, b,c);
		 double s = 0.5 * perimeter;
		 area = area(a, b, c, s);
		 System.out.println("perimeter: " + perimeter+ " area: " + area);
	}
	
}
