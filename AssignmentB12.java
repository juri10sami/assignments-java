import java.util.Scanner;
public class AssignmentB12 {
private static int x;

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//program 1
	for(int x=10,y=0; x>=10&&x<=20;x++) {
	y=(int) Math.pow(x, 2);
	
	System.out.println("integer: " + x + " and its square: " + y);}
	//program 2
	int sum2=0;
	for(int x=1; x<=100; x++) {
		sum2+=x;
	}
	System.out.println(" the sum: " + sum2);
	//program 3
	int sum=0;
	for(int x=2; x<=200; x+=2) {
		sum+=x;
	}
	System.out.println("the sum: " + sum);
	//program 4
	double res = 0;
	for(int i = 1; i <=10; i++) {
		res = 3*Math.pow(i, 2) + 4.5;
		System.out.println(" result: " + res);
	}
	
	//program 5
	double ress = 0, t = 0;
	for(int i = 1; i < 12; i++) {
		res = 3*Math.pow(t, 2) + 4.5;
		System.out.println(" resultt: " + res);
		t+=0.5;
	}
	//program 6
	double resss = 0, k = 0;
	for(int m=1;m<=10; m++) {
		k = 2 * m - (int)Math.pow(m, 2);
		System.out.println(" k: " + k);
	}
	///////////////////////////////////////////////////////////////
	//program 7
	double fin;
	System.out.println(" enter final: ");
	fin= input.nextDouble();
	for (double x = 0, y = 0; x<=fin; x+=0.5) {
		y = x*x;
		System.out.println("x: " + x + " x squared: " + y + " ");
	}
	
	//program 8
	for(double a=0,p=1000,n=1,r =1.05; n<=10; n++) {
		a = p * Math.pow(((1+0.05)), n);
		System.out.println("amount of money: " + a );
	}
	//program 9
	for(int side1 =1; side1<= 500; side1++) {
		for ( int side2 = side1; side2<=500; side2++ ) {
			for(int hypo = side2; hypo<=500;hypo++) {
				if(side1 * side1+ side2*side2 == hypo* hypo) {
					System.out.println(side1 + ", " + side2 + ", " + hypo);
				}
			}
		}
	}
	//program 10
	for(int num, i =0; i<3; i++) {
		System.out.print("Enter a nonnegative integer.");
		num = input.nextInt();
		long factorial = 1;
	
		if (num<0) {
			System.out.println("input must be a nonegative integer.");
		}
		else {
			for ( int j = 1; j<= num; j++) {
				factorial *= j;
			}System.out.println(num + "! = " + factorial);
		}
	
	}
}
}
