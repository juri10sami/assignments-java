
public class recursion {
public static void main(String [] args) {
	System.out.println(recursion.sum(5));
	System.out.println(recursion.countDigits(50));
}
public static int sum(int n) {
	if(n >=1) {
		return sum(n-1)+n ;
		
	}
	return n;
}

  public static int countDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + countDigits(n / 10);
        }
    }
}
