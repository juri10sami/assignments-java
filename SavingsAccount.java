
public class SavingsAccount extends Account{
	private double interest;
	
	public SavingsAccount(String n, String a, double b, double i) {
		super(n, a, b);
		interest = i;
	}
	
	public double deposit(double b) {
		 return getBal()+ b + (getBal()*interest);
	 }
	 public double withdraw(double b) {
		 return getBal() - b -5;
	 }
}
