
public class MailOrder extends Purchase {
 public MailOrder() {
	 super();
	 
 }
public MailOrder(double p, double w, int c) {
	super(p, w, c);
}
public double shipping() {
	return 2 * super.getWeight();
}
public double cost() {
	return super.cost() + shipping();
}
public String toString() {
	return super.toString() +" shipping: "+ shipping();
}
}
