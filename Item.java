
public class Item {
 private double price;
 private double weight;
 public Item() {
	 
 }
 public Item(double p, double w) {
	 price = p;
	 weight = w;
 }
 public double getPrice() {
	 return price;
 }
 public double getWeight() {
	 return weight;
 }
 public String toString() {
	 return "price: " + price + " weight: "+ weight;
 }
}
