
public class testMail {
	public static void main(String[] args) {
	MailOrder p = new MailOrder(100, 3, 5);
	
	System.out.println(p.shipping());
	System.out.println(p.cost());
	System.out.println(p.toString());
}}
