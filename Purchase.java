
public class Purchase extends Item {
 public Purchase() {
	 super();
 }
 private int count;
 public Purchase(double p, double w, int c) {
	 super(p, w);
	 count = c;
 }
 public int getCount() {
	 return count;
 }
 public double cost() {
	 return super.getPrice()* count;
 }
 public double getWeight() {
	 return super.getWeight()* count;
 }
 public String toString() {
	 return super.toString() +" total weight: " + getWeight()+ " cost: "+ cost();
 }
}
