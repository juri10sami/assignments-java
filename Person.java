
public class Person {
	private String name;
	private int age, ID;
	public Person() {
		
	}
	public Person(String n, int a, int i) {
		name = n;
		age = a;
		ID = i;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age; 
		}
	public int getID() {
		return ID;
	}
	public String toString() {
		return "name: " + name +" age: " + age + " ID: "+ ID; }
	}
