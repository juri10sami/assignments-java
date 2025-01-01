import java.util.ArrayList;
public class Switch {
 public static void main(String [] args) {
	 ArrayList <String> words = new ArrayList <String>();
	 words.add("four");
	 words.add("score");
	 words.add("and");
	 words.add("seven");
	 words.add("years");
	 words.add("ago");
	 Switch.switchPairs(words);
	 System.out.println(words);
 }
 public static void switchPairs(ArrayList<String> a) {
	 String temp;
	 for(int i =0; i+1<a.size(); i+=2) {
		 temp = a.get(i);
         a.set(i, a.get(i + 1));
         a.set(i + 1, temp);
	 }
 }
}
