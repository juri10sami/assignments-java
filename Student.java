

public class Student extends Person {
 public Student() {
	 super();
 }
  private String major;
  private int creditHours;
  
  public Student(String n, int a, int i, String m, int c) {
	  super(n, a, i);
	  major = m;
	  creditHours = c;
  }
  public String getMajor() {
	  return major;
  }
  public int getCredit() {
	  return creditHours;
  }
  public String toString() {
	  return super.toString()+ " major: " + major + " credit hours: "+ creditHours; }
  public int tuition() {
	  return 500*creditHours;
	  
  }
  }