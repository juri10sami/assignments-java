
public class StudentAdvance extends Advance{
	private int days;
	
	public StudentAdvance(int d) {
		super(d);
	}
	public StudentAdvance() {
		// TODO Auto-generated constructor stub
	}
	public int getDays() {
		return days;
	}
	public double getPrice() {
		int x =0;
		if(days>=10)
			x=15;
		else if(days<10)
			x=20;
		return x;
		
	}
	public String toString() {
		return	super.toString() + "student ID is required";}

}
