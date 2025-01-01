import java.util.ArrayList;

public class ArrayList2 {
public static void main (String [] args) {
	ArrayList <String> firstName= new ArrayList <String>();
	firstName.add("Cora");
	firstName.add("Elise");
	firstName.add("Liz");
	firstName.add("Alex");
	firstName.add("Shania");
	firstName.add("John");
	firstName.add("Hazel");
	firstName.add("Mya");
	firstName.add(0,"Susan");
	firstName.add("Francis");
	
	ArrayList <String> lastName= new ArrayList <String>();
	lastName.add("Reid");
	lastName.add("Kennedy");
	lastName.add("Wagner");
	lastName.add("Miles");
	lastName.add("Hardy");
	lastName.add("Peterson");
	lastName.add("Mueller");
	lastName.add("Munoz");
	lastName.add(0, "Chan");
	lastName.add("Getz");
	ArrayList <Integer> age= new ArrayList <Integer>();
	age.add(32);
	Integer b = new Integer(32);
	age.add(b);
	Integer c = new Integer(42);
	age.add(c);
	Integer d = new Integer(31);
	age.add(45);
	Integer e = new Integer(45);
	age.add(e);
	Integer f = new Integer(35);
	age.add(f);
	Integer g = new Integer(55);
	age.add(g);
	Integer h = new Integer(24);
	age.add(h);
	Integer i = new Integer(49);
	age.add(0, i);
	Integer j = new Integer (32);
	age.add(j);
	ArrayList <Integer> salary= new ArrayList <Integer>();
	Integer aa = new Integer(1400);
	salary.add(aa);
	Integer bb = new Integer(1700);
	salary.add(bb);
	Integer cc = new Integer(2300);
	salary.add(cc);
	Integer dd = new Integer(1850);
	salary.add(dd);
	Integer ee = new Integer(2200);
	salary.add(ee);
	Integer ff = new Integer(1900);
	salary.add(ff);
	Integer gg = new Integer(4500);
	salary.add(gg);
	Integer hh = new Integer(1200);
	salary.add(hh);
	Integer ii = new Integer(4700);
	salary.add(0,ii);
	Integer jj = new Integer(2200);
	salary.add(jj);
	ArrayList <String> department= new ArrayList <String>();
	
	department.add("Admin");
	department.add("Sales");
	department.add("Management");
	department.add("Sales");
	department.add("Sales");
	department.add("Sales");
	department.add("Management");
	department.add("Admin");
	department.add(0, "Admin");
	department.add("Sales");
	ArrayList <Integer> rating= new ArrayList <Integer>();
	Integer aaa = new Integer(6);
	rating.add(aaa);
	Integer bbb = new Integer(6);
	rating.add(bbb);
	Integer ccc = new Integer(7);
	rating.add(ccc);
	Integer ddd = new Integer(5);
	rating.add(ddd);
	Integer eee = new Integer(7);
	rating.add(eee);
	Integer fff = new Integer(8);
	rating.add(fff);
	Integer ggg = new Integer(7);
	rating.add(ggg);
	Integer hhh = new Integer(9);
	rating.add(hhh);
	Integer iii = new Integer (8);
	rating.add(0, iii);
	Integer jjj = new Integer (6);
	rating.add(jjj);
	
	for(int r =1; r<=salary.size(); r++) {
		System.out.println(firstName.get(r-1)+ ": " + salary.get(r-1));
		
	}
	System.out.println("tot salary: "+ totSalary(salary));
	System.out.println("");
	for(int r =1; r<=salary.size(); r++) {
		salAdjust(rating, salary, r);
		System.out.println(firstName.get(r-1)+ ": " + salary.get(r-1));
	}
	
	for(int r =0; r<department.size(); r++) {
		if(department.get(r).equals("Sales")) {
			System.out.println("first name: " + firstName.get(r) + ", last name: " + lastName.get(r)+ " , age: "+ age.get(r) + " , salary: "+ salary.get(r)+ " , department: "+ department.get(r)+ " , perf rating: "+ rating.get(r)+" , years to retire: " + yearToRetire(age, r));
		}
	}
	System.out.println("");
	
	for(int r =0; r<department.size(); r++) {
		if(department.get(r).equals("Management")) {
			System.out.println("first name: " + firstName.get(r) + ", last name: " + lastName.get(r)+ " , age: "+ age.get(r) + " , salary: "+ salary.get(r)+ " , department: "+ department.get(r)+ " , perf rating: "+ rating.get(r) +" , years to retire: " + yearToRetire(age, r));
		}
	}
	System.out.println("tot adjusted salary: " + totSalaryAdjustment(salary));
}

public static void setFirst(ArrayList<String> a, int n, String b) {
	n -=1;
	a.set(n, b);
}
public static void setLast(ArrayList<String> a, int n, String b) {
	n -=1;
	a.set(n, b);
}
public static void setAge(ArrayList<Integer> a, int n, int b) {
	n -=1;
	Integer aa= new Integer(b);
	a.set(n, aa);
}
public static void setSalary(ArrayList<Integer> a, int n, int b) {
	n -=1;
	Integer aa= new Integer(b);
	a.set(n, aa);
}
public static void setDep(ArrayList<String> a, int n, String b) {
	n -=1;
	a.set(n, b);
}
public static void setRating(ArrayList<Integer> a, int n, int b) {
	n -=1;
	Integer aa= new Integer(b);
	a.set(n, aa);
}
public static String getFirst(ArrayList<String> a, int n) {
	n-=1;
	return a.get(n);
}
public static String getLast(ArrayList<String> a, int n) {
	n-=1;
	return a.get(n);
}
public static int getAge(ArrayList<Integer> a, int n) {
	n-=1;
	return a.get(n);
}
public static int getSalary(ArrayList<Integer> a, int n) {
	n-=1;
	return a.get(n);
}
public static String getDep(ArrayList<String> a, int n) {
	n-=1;
	return a.get(n);
}
public static int getRating(ArrayList<Integer> a, int n) {
	n-=1;
	return a.get(n);
}

public static int yearToRetire(ArrayList<Integer> a, int n) {
	n-=1;
	return 60 - a.get(n);
}
public static void salAdjust(ArrayList<Integer> a,ArrayList <Integer> b, int n) {
	n-=1;
	double newSal=0;
	if(a.get(n)<=6) {
		
		newSal = b.get(n) *1.03;
		double aa= new Double(newSal);
		b.set(n, (int) aa);
	}
	else if(a.get(n)<=8) {
		newSal = b.get(n) *1.04;
		double aa= new Double(newSal);
		b.set(n, (int) aa);
	}
	else {
		newSal = b.get(n) *1.05;
		double aa= new Double(newSal);
		b.set(n, (int) aa);
	}
}
public static int totSalary(ArrayList<Integer> a) {
	int sum =0;
	for(int i = 0; i<a.size(); i++) {
		sum+=a.get(i);
	}
	return sum;
}
public static int totSalaryAdjustment(ArrayList<Integer> a) {
	int sum =0;
	for(int i =0; i<a.size(); i++) {
		if(a.get(i)%100!=0)
			sum+=a.get(i);
	}
	return sum;
}

}
