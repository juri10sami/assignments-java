
public class  multiDiminsional{
public static void main(String[] args) {
	double sales[][]= { {4384, 2060, 2213, 4082},
			{3330, 2440,3847, 3294},
			{3305, 3796, 3823, 4054},
			{2867, 2345, 3428, 4094},
			{2721, 3901,2260,2427},
			{2703, 4267, 3574, 2958}
	};
	int a [][]= {{9,1,21,13,12},
			{22,23,5,18,25},
			{8,4,23,2,24},
			{16,4,21,17,20},
			{7,8,3,15,7}};
	monthlySales(sales, 2);
	highestSalesMonth(sales);
	isIncreasing(sales, 3);
	highestMonth(sales, 1);
	printMiddleRow(a);
	printMiddleCol(a);
	printUpperHalf(a);
	printLowerHalf(a);
}
//program 1
public static double monthlySales(double [][] sales, int month) {
		month-=1;
		int total =0;
		
			for(int col = 0; col<sales[month].length; col++) {
				total+=sales[month][col];
			}
		
		System.out.println("total: "+ total);
		return total;
}
//program 2
public static double highestSalesMonth(double [][] sales) {
	int tot1 =0, tot2=0, max=0;
	for(int row =0; row<sales.length; row++) {
		for(int col =0; col< sales[row].length; col++) {
			tot1 += sales[row][col];
			if(tot1>max) {
				max = tot1;
				tot2 = row+1;}
		}
		tot1=0;
	}
	System.out.println("max: "+ tot2);
	return max;
}
//program 3
public static boolean isIncreasing(double [][] sales, int month) {
	month-=1;
	boolean x = false;
	for(int row = month; row<= month; row ++) {
		for(int col =0; col+1<sales[row].length; col++) {
			if(sales[row][col+1]>sales[row][col])
				x = true;
		}
	}
	System.out.println("x: "+ x);
	return x;
}
//program 4
public static double highestMonth(double [][] sales, int salesperson) {
	double max=0, highestIndex=0;
	salesperson-=1;
	double x=0;
	for(int col =salesperson; col<sales[salesperson].length; col++) {
		for(int row =0; row < sales.length; row++) {
			x=sales[row][col];
			if(x>max) {
				max = sales[row][col];
				highestIndex = row+1;}
		}
	}
	System.out.println("highest month: "+ highestIndex);
	return highestIndex;
	}
	
//program 5
public static int printMiddleRow(int[][] a) {
	int x=0;
	for(int row =2; row<3;row++) {
		for(int col=0; col<a[row].length;col++) {
			System.out.print(a[row][col] + "   ");
		}
	}
	System.out.println("\n");
	return x;
}
//program 6
public static int printMiddleCol(int [][] a) {
	int x=0;
	for(int col = 2; col<3; col++) {
		for(int row = 0; row<a.length; row++) {
			System.out.print(a[row][col]+ "   ");
		}
	}
	System.out.println("\n");
	return x;
}
//program 7
public static int printUpperHalf(int [][] a) {
	int x =0;
	for(int row =0; row<a.length; row++) {
			for(int i=0; i<row;i++) {
				System.out.print("     ");
			}
			for(int col=row; col<a[row].length; col++) {
				System.out.print(a[row][col] + "    ");
			}
			System.out.print("\n");
	}
	return x;
}
//program 8
public static int printLowerHalf(int [][] a) {
	int x =0;
	for(int row =0; row<a.length; row++) {
		for(int col=0; col<=row; col++) {
			System.out.print(a[row][col] + "    ");
		}
		System.out.print("\n");
}
	return x;
}
}
