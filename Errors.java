import java.util.InputMismatchException;
import java.util.Scanner;
public class Errors {
	 public static void main(String[] args) {
		 //program 1
	       Scanner scanner = new Scanner(System.in);
	        //System.out.println("Enter a number:");
	        //int num = scanner.nextInt();

	        //try {
	          //  int result = 10 / num;
	            //System.out.println("The result is: " + result);
	        //} catch (ArithmeticException e) {
	          //  System.out.println("Cannot divide by zero!");
	        //}
	        //program 2
	      //  int[] arr = {1, 2, 3, 4, 5};
	        //try {
	          //  int index = 5;
	            //int value = arr[index];
	            //System.out.println("Value at index " + index + " is: " + value);
	        //} catch (ArrayIndexOutOfBoundsException e) {
	          //  System.out.println("index out of bounds!");
	        //}
	        //program 3
	     //   System.out.println("Enter an integer:");
	       // boolean validInput = false;
	       // int number = 0;
	        //while (!validInput) {
	          //  try {
	            //    number = scanner.nextInt();
	              //  validInput = true;
	            //} catch (Exception e) {
	              //  System.out.println("invalid input! please enter an integer.");
	                //scanner.nextLine(); 
	            //}
	        //}
	        //System.out.println("You entered: " + number); 
	        //program 4
	        //String str = null;
	        //try {
	          //  int length = str.length();
	        //} catch (NullPointerException e) {
	          //  System.out.println("Null pointer encountered!");
	        //}
	        //program 5
	        System.out.println("Enter a positive number:");
	        int num = scanner.nextInt();
	        if (num < 0) {
	            throw new IllegalArgumentException("Negative number entered!");
	        }
	        System.out.println("You entered: " + num);
	        //program 6
	        System.out.println("Enter an integer:");
	        boolean validInput = false;
	        int nums = 0;
	        while (!validInput) {
	            try {
	                num = scanner.nextInt();
	                validInput = true;
	            } catch (InputMismatchException e) {
	                System.out.println("invalid input! please enter an integer.");
	                scanner.nextLine(); // consume the invalid input
	            } catch (Exception e) {
	                System.out.println("An unexpected error occurred.");
	                e.printStackTrace();
	            }
	        }
	        System.out.println("You entered: " + num);
	        //program 8
	        try {
	            int sum = addTwo(2, (int) 3.5);
	            System.out.println("The sum is: " + sum);
	        } catch (ClassCastException e) {
	            System.out.println("Illegal cast exception caught!");
	        }
	        //program 9
	        int[] arr = {1, 2, 3};
	        int value = arr[3];
	        System.out.println("Value at index 3 is: " + value);
	    //program 10
	        try {
	            method1();
	        } catch (Exception e) {
	            System.out.println("An exception occurred: " + e.getMessage());
	        }
	    }
	 
public static int addTwo(int a, int b) {
    return a + b;
    
}
public static void method1() {
    try {
        method2();
    } catch (NullPointerException e) {
        System.out.println("Null pointer encountered");
    }
}

public static void method2() {
    String str = null;
    int len = str.length();
}
}
