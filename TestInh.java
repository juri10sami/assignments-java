
public class TestInh {
	public static void main(String[] args) {
		book b = new book("War and Peace", 450);
		Dictionary d = new Dictionary("damian ", 350, 5);
		
		System.out.println(b.getTitle());
		System.out.println(d.getTitle());
		System.out.println(b.toString());
		System.out.println(d.GetDef());
		System.out.println(d.toString());
	}
}
