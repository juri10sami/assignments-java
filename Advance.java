
public class Advance extends Ticket{
	private int days;
	public Advance(int d) {
		days= d;
	}
	public Advance() {
		// TODO Auto-generated constructor stub
	}
	public int getDays() {
		return days;
	}
	public double getPrice() {
		int x =0;
		if(days>=10)
			x=30;
		else if(days<10)
			x=40;
		return x;
	}
	public String toString() {
		return	super.toString();}
}
