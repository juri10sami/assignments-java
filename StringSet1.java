
public class StringSet1 {
	public static void main(String[] args) {
			
			System.out.println(replaceChar("please work","e","#"));
			System.out.println(countChar("bobby help", "b"));
			System.out.println(capitalize("bobby help please"));
			System.out.println(capitalizeAlternate("bobby meow"));
			System.out.println(isAlpha("bobby "));
	}
	
	

	public static int findChar(String sentence , String target) {
		String x = new String(sentence);
			return x.indexOf(target);
			
	}
	public static int findPart(String sentence, String target) {
		String x = new String(sentence);
		return x.indexOf(target);
	}
	public static boolean removeChar(String sentence, String target) {
		boolean removed = false;
		int ind =1;
		for(int i = 0 ; i<sentence.length(); i++) {
			if(sentence.substring(i,i+1).equals(target)) {
				ind = i;
				String k = new String(sentence.substring(0, ind)+ sentence.substring(ind+1, sentence.length()));
				removed = true;
			}
		}
		
		return removed;
	}
	
	public static String removeSpace(String sentence) {
		String k="";
		int ind = 0;
		
		for(int i = 0 ; i<sentence.length(); i++) {
			if(sentence.substring(i,i+1).equals(" ")) {
				ind=i;
				k = sentence.substring(0, ind)+ sentence.substring(ind+1, sentence.length());
				sentence = k;
				}
	}
		return k;
	}
	
	public static String addSpace(String sentence) {
		String k="";
		int ind = 0;
		
		for(int i = 0 ; i<sentence.length(); i++) {
			if(sentence.substring(i,i+1).equals(" ")) {
				ind=i;
				k = sentence.substring(0, ind)+ " " +sentence.substring(ind, sentence.length());
				sentence = k;
				}
	}
		System.out.println("meowwwwwww");
		return k;
	}
	public static String replaceChar(String sentence, String val, String rep) {
		String k="";
		int ind = 0;
		
		for(int i = 0 ; i<sentence.length(); i++) {
			if(sentence.substring(i,i+1).equals(val)) {
				ind=i;
				k = sentence.substring(0, ind)+ rep +sentence.substring(ind+1, sentence.length());
				sentence = k;
				}
	}
		
		return k;
	}
	public static int countChar(String sentence, String target) {
		int count =0;
		int ind = 0;
		for(int i = 0 ; i<sentence.length(); i++) {
			if(sentence.substring(i,i+1).equals(target)) {
				count++;
				
				}
			
	}
		return count;
	}
	public static String capitalize(String sentence) {
		String k="";
		int ind = 0;
		for(int i = 0 ; i<sentence.length(); i++) {
			if(sentence.substring(i,i+1).equals(" ")) {
				ind=i;
				k = sentence.substring(0,0+1).toUpperCase()+  sentence.substring(1, ind+1)+ sentence.substring(i+1,i+2).toUpperCase()+ sentence.substring(ind+2, sentence.length());
				sentence = k;
				}
	}
		
		return k;
	
	}
	public static String capitalizeAlternate(String sentence) {
		
		String k= "";
		
		for(int i = 0 ; i <sentence.length(); i++) {
			
			if(i%2==0) {
				
				k +=(sentence.substring(i,i+1)).toUpperCase();
				}
			else {
				k+=sentence.substring(i,i+1);
			}
	}
		
		return k;
	
	}
	
	public static boolean isAlpha(String sentence) {
		boolean alpha = true;
		String m[] = new String [sentence.length()];
				for(int i =0; i<sentence.length();i++) {
			m[i]= sentence.substring(i);
					}
				
				for(int i =0; i<m.length; i++) {
					
					if(!isLetter1((sentence.substring(i))) ){
						alpha = false;
							
					}
				}
				return alpha;
	}
	
	private static boolean isLetter1(String sentence) {
		boolean m = false;
		for(int i =0; i <sentence.length();i++) {
		int x=sentence.substring(i,i+1).compareTo("A")+65;
		if((x>=65&&x<=90)||(x>=97&&x<=122)) {
			m = true;
		}
		
		}
	  return m;
	}
}
