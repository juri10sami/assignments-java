
public class Assignment2T2 {
	//program 1
public static void adjustRaceTime( double partiadj [] ) {
	for(int i =0; i<partiadj.length;i++)
	partiadj[i]= partiadj[i]- (partiadj[i]*0.01);
	}
//program 2
public static double fastestRun(double partiadj [] ) {
	double max=200;
	int count=0;
	for(int i =0;i<partiadj.length;i++) {
		if(partiadj[i]<max) {
		max = partiadj[i];
		count=i;}
	}
	System.out.println("fastest race: Participant" +count+" with "+ max);
	return max;
}
//program 3
public static double slowestRun(double partiadj []) {
	double min=0;
	int count=0;
	for(int i =0;i<partiadj.length;i++) {
		if(partiadj[i]>min) {
		min = partiadj[i];
		count=i;}
}
	
	System.out.println("slowest race: Participant "+ count+" with "+min);
	return min;
}
//program 4
public static double avgRun(double partiadj[]) {
	double avg = 0;
	double sum=0;
	for(int i=0; i<partiadj.length; i++) {
		sum +=partiadj[i];
	}
	avg = sum/partiadj.length;
	System.out.println("average race time: "+avg);
	return avg;
	
	}
//program 5
public static double countBelowAve(double partiadj[]) {
	int count=0;
	double avg = avgRun(partiadj);
	for(int i =0;i<partiadj.length;i++) {
		if(partiadj[i]<avg)
			count++;
	}
	System.out.println("Number of Participants below average race times: "+count);
	return count;
}
//program 6
public static double topThree(double partiadj[]) {
	double max=200;
	double max2=200;
	int count=0;
	int count2=0;
	double max3=200;
	int count3=0;
	int first =0;
	int second=0;
	int third=0;
	for(int i =0;i<partiadj.length;i++) {
		if(partiadj[i]<max) {
		max = partiadj[i];
		first=i;}
	}
	for( int i = 0;i<partiadj.length;i++) {
		if(partiadj[i]<max2&&partiadj[i]>max) {
			max2=partiadj[i];
			second=i;}
	}
 
	for(int i = 0;i<partiadj.length;i++) {
		if(partiadj[i]<max3&&partiadj[i]>max2) {
			max3=partiadj[i];
			third=i;}
	}
 

	System.out.println("Participant: " + first + ", "+ second+", "+ third);
	return first;}
//program 7
public static double eliteRun( double partiadj[]) {
	int count=0;
	for( int i =0; i<partiadj.length;i++) {
		if(partiadj[i]<100)
			count++;
		
	}
	System.out.println("number of elite race: " + count);
	return count;
}
}


