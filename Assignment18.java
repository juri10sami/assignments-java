
public class Assignment18 {

	public static int sumLimit(int n) {
		int sum=0;
		for(int i=0; i<n;i++) {
			sum+=i;
		}
		return sum;
	}
public static int sumLimit(int m, int n) {
	int sum=0;
	for(int i=m; i<n;i++) {
		sum+=i;
	}
	return sum;
	}
public static int sumLimit(int m, int n , int skipVal) {
	int sum=0;
	for(int i = m; i<n; i++) {
		if(i!= skipVal);
			sum+=i;
	}
	return sum;
}
public static int randBet(int n) {
	return (int)(Math.random()*(n-2))+2;
}
public static int randBet(int n, int m) {
	return (int)(Math.random()*(n-m+1))+m;
}
public static String myAdress(String name, String street) {
	return  name + " lives at"+ street;
}
public static String myAdress(String name, String street, String city) {
	
	return name + " lives at" + street+ ", " + city;
	}

}

