
public class testPerson {
	public static void main(String[] args) {
		Person p = new Person("nora", 18, 1111);
		Student s = new Student("sarah", 20, 2222, "Biology", 15);
		Student z = new Student("zain", 19, 3333, "Business", 12);
		
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(z.toString());
	}
}
