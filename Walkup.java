
public class Walkup extends Ticket{
	private int days;
	public Walkup(int d) {
		days= d;
	}
	public Walkup() {
	
	}
	public int getDays() {
		return days;
	}
 public double getPrice() {
	 int x =0;
	 if(days==0)
		 x= 50;
	 return x;
 }
 public String toString() {
	return	super.toString();
	}
}
