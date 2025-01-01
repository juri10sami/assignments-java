import java.util.Scanner;
public class Assignment13 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//program 1
	for(int  x=1; x<=10; x++) {
		System.out.println("x: "+ x +" x squard: " + Math.pow(x, 2)+ " x cubed: " + Math.pow(x, 3));
	}
	//program 2

	double sum =1;
	for ( int i = 2; i<=100; i+=2) {
		sum+= 1.0/i;
	}
	System.out.println("sum of the series: " + sum);
	
	//program 3
	for( double c=0, f=0; c<=100; c+=5) {
		f = 1.8*c +32;
		System.out.println("degrees in fahrenheit: " + f);
	}
	//program 4
	double a, b, c;
	System.out.println("Enter the following values: a, b,c ");
	a = input.nextDouble();
	b=input.nextDouble();
	c=input.nextDouble();
	for( double x=1, value=0; x<=10;x++) {
	value = a*(Math.pow(x, 2)) + b*x + c;
	 System.out.println("values of the polynomial: " + value);
	}
	//program 5
	 double z, pi = 0, sign = 1;

     System.out.print("Enter the number of computations: ");
     z = input.nextDouble();

     for (double k = 0; k < z; k++) {
         double e = 4.0 / (2 * k + 1);
         pi += sign * e;
         sign = -sign; // Toggle the sign for the next term
     }

     System.out.println("Approximation of pi after " + z + " computations: " + pi);

	//program 6
	 int n = 10; // Number of partial sums to calculate
     double partialSum = 1, term = 1;

     System.out.println("First " + n + " partial sums of the series:");
     System.out.println("Partial Sum 1: " + partialSum);

     for (int i = 1; i < n; i++) {
         term /= i;
         partialSum += term;
         System.out.println("Partial Sum " + (i + 1) + ": " + partialSum);
     }
 }
}

