
public class CurrentAccount extends Account{
	private double limit;
	
	private String accountName;
	 private String accountCode;
	 private double accountBal;
	CurrentAccount(String n, String a, double b, double l){
		super(n, a, b);
		limit = l;
	}
	public double deposit(double b) {
		 return accountBal+ b;
	 }
	 public double withdraw(double b) {
		 return accountBal - b -12 - (accountBal*0.002);
	 }
}
