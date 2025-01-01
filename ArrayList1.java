import java.util.ArrayList;
public class ArrayList1 {
	
	public static boolean findInList(String title, ArrayList a) {
	    boolean check = false;
	    for(int i =0; i<a.size(); i++) {
	        if(a.get(i).equals(title)) {
	            check = true;
	            i = a.size(); 
	        }
	    }
	    return check;
	}
	public static void main(String []args) {
ArrayList<String> Books = new ArrayList<String>();
Books.add("Zero is not nothing.");
Books.add("What counting theory");
Books.add("I can count in Octal!");
Books.add(1, "I can pass this test!");
Books.remove(1);
Books.set(2, "Ducks are life!");

System.out.println(ArrayList1.findInList("Zero is not nothing.", Books));



}
}