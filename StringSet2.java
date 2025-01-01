import java.util.Arrays;

public class StringSet2 {
	public static void main(String[] args) {
		System.out.println(firstWord("Do not go gentle into that good night, Old age should burn and rave at close of day; Rage, rage against the dying of the light."));
		System.out.println(lastWord("Do not go gentle into that good night, Old age should burn and rave at close of day; Rage, rage against the dying of the light."));
		System.out.println(swapWords("Do not go gentle into that good night, Old age should burn and rave at close of day; Rage, rage against the dying of the light."));
		System.out.println(wordCount("Do not go gentle into that good night, Old age should burn and rave at close of day; Rage, rage against the dying of the light."));
		System.out.println(countNWords("every day can be a great day", 3));
		System.out.println(Arrays.toString(saveNWords("every day can be a great day",3)));
		System.out.println(longestWord("every day can be a great day bobbbby"));
		System.out.println(reverseLongestWord("every day"));
		System.out.println(countSymbols("hey! hey! "));
	}

	public static String firstWord(String sentence) {
		String m = "";
		int count =0;
		for(int i =0; i <sentence.length(); i++) {
			if(sentence.substring(i,i+1).equals(" ")&&count<1) {
				m+=sentence.substring(0,i);
				count++;
			}
		}
		return m;
	}
	
	public static String lastWord(String sentence) {
		 String f = "";
		    int count1 = 0;
		    int ind = 0;
		    for (int i = sentence.length() - 1; i >= 0; i--) {
		        if (sentence.substring(i, i + 1).equals(" ")) {
		            count1++;
		            if (count1 == 1)
		                ind = i;
		        } 
		    }
		    f += sentence.substring(ind + 1, sentence.length());
		    return f;
	}
	
	
	
	public static String swapWords(String sentence) {
		String m = "";
		int count =0;
		int ind1=0;
		for(int i =0; i <sentence.length(); i++) {
			if(sentence.substring(i,i+1).equals(" ")&&count<1) {
				m+=sentence.substring(0,i);
				count++;
				ind1=i;
			}
		}
		 String f = "";
		    int count1 = 0;
		    int ind = 0;
		    for (int i = sentence.length() - 1; i >= 0; i--) {
		        if (sentence.substring(i, i + 1).equals(" ")) {
		            count1++;
		            if (count1 == 1)
		                ind = i;
		        } 
		    }
		    f += sentence.substring(ind + 1, sentence.length());
		    
		   String d ="";
		   d= f+ sentence.substring(ind1,ind+1)+ m;
		   return d;
		
	}
	
	public static int wordCount(String sentence) {
		int count =0;
		for(int i =0; i<sentence.length();i++) {
			if(sentence.substring(i,i+1).equals(" "))
				count++;
		}
		return count+1;
	}
	
	public static int countNWords(String sentence, int n) {
	    int countalp = 0, countwords = 0;

	    for (int i = 0; i < sentence.length(); i++) {
	        if (!sentence.substring(i, i + 1).equals(" ")) {
	            countalp++;

	            if (i < sentence.length() -1 && sentence.substring(i + 1, i + 2).equals(" ")) {
	               
	                if (countalp == n) {
	                    countwords++;
	                }
	                countalp = 0;
	            }
	        }
	    }

	    if (countalp == n) {
	        countwords++;
	    }

	    return countwords;
	}
	
	
	public static String[] saveNWords(String sentence, int n) {
	    int countalp = 0, count = 0;

	    
	    int numberOfWords = countNWords(sentence, n);

	   
	    String[] m = new String[numberOfWords];

	    for (int i = 0; i < sentence.length(); i++) {
	        if (!sentence.substring(i, i + 1).equals(" ")) {
	            countalp++;

	            if (i < sentence.length() - 1 && sentence.substring(i + 1, i + 2).equals(" ")) {
	                if (countalp == n) {
	                    
	                    m[count] = sentence.substring(i - n + 1, i + 1);
	                    count++;
	                }
	                countalp = 0;
	            }
	        }
	    }

	    if (countalp == n) {
	        m[count] = sentence.substring(sentence.length() - countalp);
	    }

	    return m;
	}
	
	public static String longestWord(String sentence) {
		 int countalp = 0, count = 0,max =0;
		
		 String m ="";
		    for (int i = 0; i < sentence.length(); i++) {
		        if (!sentence.substring(i, i + 1).equals(" ")) {
		            countalp++;

		            if (i < sentence.length() - 1 && sentence.substring(i + 1, i + 2).equals(" ")) {
		                if (countalp>max) {
		                    
		                   max = countalp;
		                   m=sentence.substring(i-countalp+1, i+1);
		                }
		             countalp=0;
		            }
		        }
		    }

		    if (countalp >max) {
		    	 m=sentence.substring(sentence.length()-countalp);
		    }

		    return m;
	}
	public static String reverseLongestWord(String sentence) {
		int countalp = 0, count = 0,max =0;
		
		 String m ="", k="";
		    for (int i = 0; i < sentence.length(); i++) {
		        if (!sentence.substring(i, i + 1).equals(" ")) {
		            countalp++;

		            if (i < sentence.length() - 1 && sentence.substring(i + 1, i + 2).equals(" ")) {
		                if (countalp>max) {
		                    
		                   max = countalp;
		                   m=sentence.substring(i-countalp+1, i+1);
		                }
		             countalp=0;
		            }
		        }
		    }

		    if (countalp >max) {
		    	max = countalp;
		    	 m=sentence.substring(sentence.length()-countalp);
		    }
		    
		    for(int i =max; i>=0;i--) {
		    	
		    	m+=sentence.substring(i,i+1);
		    }
		    return m;
	}
	public static int countSymbols(String sentence) {
		int count = 0;
		for(int i = 0; i<sentence.length();i++) {
			if(isNotLetter1(sentence,i)&& !sentence.substring(i,i+1).equals(" "))	{
				count++;
			}
		}
		return count;
		
	}
	public static boolean isNotLetter1(String sentence, int index) {
	  
	    String character = sentence.substring(index, index + 1);

	    return !(character.compareTo("A") >= 0 && character.compareTo("Z") <= 0) &&
	            !(character.compareTo("a") >= 0 && character.compareTo("z") <= 0);}}
