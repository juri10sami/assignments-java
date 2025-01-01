import java.util.ArrayList;
public class MountainTrek {
	public static void main(String[] args) {
 int[][] meow = new int[4][7];
 
 for(int i =0; i<4; i++) {
	 for(int c =0; c<7; c++) {
		 meow[i][c]= (int)(Math.random()*401)+500;
	 }
 }
 
 
 meow[1][0]=0;
 meow[3][1]=0;
 meow[1][2]=0;
 meow[2][3]=0;
 meow[0][4]=0;
 meow[3][4]=0;
 for(int i =0; i<4; i++) {
	 for(int c =0; c<7; c++) {
		System.out.print(meow[i][c]+ " ");
	 }
 }
 System.out.println( " ");
 ArrayList <Integer> record = new ArrayList<Integer>();
 for(int i =0; i<4; i++) {
	 for(int c =0; c<7; c++) {
		record.add(meow[i][c]);
	 }
 }
 for(int i =0; i<record.size();i++) {
	 System.out.print(record.get(i)+ " ");
 }
 System.out.println( " ");
 
System.out.println(aveDiff(record));
}
	
public static int highestPair(ArrayList<Integer> a) {
	int total=0;
	for(int i =0; i+1<a.size();i++) {
		if(total<a.get(i)+a.get(i+1)){
			total = a.get(i)+a.get(i+1);
		}
		
	}
	return total;
}
public static int lowestPair(ArrayList<Integer> a) {
	int total=0;
	for(int i =0; i+1<a.size();i++) {
		if(total>a.get(i)+a.get(i+1)){
			total = a.get(i)+a.get(i+1);
		}
		
	}
	return total;
}
public static double[] aveDiff(ArrayList<Integer> a) {
    double[] woof = new double[a.size()];
    int sum = 0;
    for (int i = 0; i < a.size(); i++) {
        sum += a.get(i);
    }
    double avg = (double) sum / a.size();
    for (int i = 0; i < a.size(); i++) {
        woof[i] = avg - a.get(i);
    }
    for(int i =0; i<woof.length; i++) {
    	System.out.print(woof[i]+", ");
    }
    return woof;
}
}