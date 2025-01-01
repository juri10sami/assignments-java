import java.util.ArrayList;
public class Wrapper {
public static void main(String[] args) {
	ArrayList <Integer> meow = new ArrayList<Integer>();
	meow.add(43);
	meow.add(23);
	meow.add(12);
	meow.add(67);
	meow.add(90);
	meow.add(33);
	meow.add(45);
	meow.add(12);
	int max=0, min=1000, sum =0;
	double max1=0, min1=1000, sum1 =0, avg1=0, avg=0;
	double rand;
	for(int i =0; i<meow.size();i++) {
	
		if(max<meow.get(i)) {
			max = meow.get(i+1);
		}
	}
	System.out.println("max: "+ max);
	
	for(int i =0; i<meow.size();i++) {
		
		if(min>meow.get(i)) {
			min = meow.get(i);
		}
	}
	System.out.println("min: "+ min);
	for(int i =0; i<meow.size();i++) {
		sum+=meow.get(i);
	}
	System.out.println("sum: "+ sum);
	
	for(int i =0; i<meow.size();i++) {
		sum+=meow.get(i);
		
	}
	avg = (double)sum / meow.size();
	System.out.println("avg: "+ avg);
	
	ArrayList <Double> woof = new ArrayList<Double>(100);
	for(int i=0; i<100; i++) {
		rand = Math.random()*100;
		woof.add(rand);
	}
	for(int i =0; i<woof.size();i++) {
		
		if(max1<woof.get(i)) {
			max1 = woof.get(i+1);
		}
	}
	System.out.println("max: "+ max1);
	
	for(int i =0; i<woof.size();i++) {
		
		if(min1>woof.get(i)) {
			min1 = woof.get(i);
		}
	}
	System.out.println("min: "+ min1);
	for(int i =0; i<woof.size();i++) {
		sum1+=woof.get(i);
	}
	System.out.println("sum: "+ sum1);
	
	for(int i =0; i<woof.size();i++) {
		sum1+=woof.get(i);
	}
	avg1 = (double)sum1 / woof.size();
	System.out.println("avg: "+ avg1);
	
	
}


}
