
public class challenge {
	public static void main(String[] args) {
		System.out.println(newLanguage("do not go"));
	}
	public static String newLanguage(String sentence) {
		
		String result = "";
       int count =0; 
       for(int i =0; i<sentence.length();i++) {
    	   if(sentence.substring(i,i+1).equals(" ")) {
    		   count++;
    	   }
       }
       String[] words = new String[count+1];
       for(int i =0; i<sentence.length(); i++) {
    	   if(sentence.substring(i,i+1).equals(" ")|| i==0 ){
    		   if(sentence.substring(i+1,i+2).equals("a")||sentence.substring(i+1,i+2).equals("e")||sentence.substring(i+1,i+2).equals("i")||sentence.substring(i+1,i+2).equals("o")||sentence.substring(i+1,i+2).equals("u")) {
    			   result+=sentence.substring(i,sentence.indexOf(" "))+"hey";}
       }}
       return result;
    }
}
