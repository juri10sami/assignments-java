import java.util.Scanner;
public class menuCalc {
	static 	Scanner input = new Scanner(System.in);

public static void main(String[] args) {
	System.out.println("press 1 for addition \n press 2 for subtraction \n press 3 for multiplication \n press 4 for division \n press 5 for power \n press 6 for exit");
	int x = input.nextInt();

	while(x!=6) {
	if(x==1)
		addition();
	else if(x==2)
		subtraction();
	else if ( x== 3)
		multiplication();
	else if (x==4)
		division();
	else if (x==5)
		power();
	System.out.println("press 1 for addition \n press 2 for subtraction \n press 3 for multiplication \n press 4 for division \n press 5 for power \n press 6 for exit");
	 x = input.nextInt();
	}

}
public static void addition() {
	System.out.println("enter y+z");
	double y = input.nextDouble();
	double z = input.nextDouble();
	
	double result = y + z;
	System.out.println("result: "+ result);
}
public static void subtraction() {
	System.out.println("enter y-z");
	double y = input.nextDouble();
	 double z = input.nextDouble();
	double result =y - z;
	System.out.println("result: "+ result);
}
public static void multiplication() {
	System.out.println("enter y*z");
	double y = input.nextDouble();
	 double z = input.nextDouble();
	double result =y * z;
	System.out.println("result: "+ result);
}
public static void division() {
	System.out.println("enter y/z");
	double y = input.nextDouble();
	 double z = input.nextDouble();
	double result =y / z;
	System.out.println("result: "+ result);
}
public static void power() {
	System.out.println("enter y to the power z");
	double y = input.nextDouble();
	 double z = input.nextDouble();
	double result =Math.pow(y, z);
	System.out.println("result: "+ result);
}

}
