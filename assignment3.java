package idk;

import java.util.Scanner;

public class assignment3 {
public static void main(String [] args ) {
	//1
	double cir, area;
	Scanner scanner = new Scanner(System.in);

    int r = scanner.nextInt();

   cir= 2*Math.PI*r;
   area= Math.PI*Math.pow(r, 2);
   System.out.println("circumference: "+ cir+ " area: "+ area);
   //2
   double surface, volume;
   int r1 = scanner.nextInt();
   int h = scanner.nextInt();
   surface= 2*Math.PI*r1*h;
   volume = Math.PI*Math.pow(r1, 2)*h;
   System.out.println("side surface area: "+ surface+ " volume: "+ volume);
   //3
   double cir1, area1;
   int h1 = scanner.nextInt();
   int w = scanner.nextInt();
   cir1= 2*Math.PI*Math.sqrt(0.5*(Math.pow(h1/2,2)+Math.pow(w/2, 2)));
   area1= Math.PI*(h1/2)*(w/2);
   System.out.println("circumference: "+ cir1+ " area: "+ area1);
   //4
   double surface1, vol;
   int r2 = scanner.nextInt();
   surface1= 4*Math.PI*Math.pow(r2,2);
   vol= (4/3)*Math.PI*Math.pow(r2, 3);
   System.out.println("side surface area: "+ surface1+ " volume: "+ vol);
   //5
   
   double s, area2;
   int a = scanner.nextInt();
   int b = scanner.nextInt();
   int c = scanner.nextInt();
   s= (a+b+c)/2;
   area2= Math.sqrt(s*(s-a)*(s-b)*(s-c));
   System.out.println("area: "+ area2);
}
}
