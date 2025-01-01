
public class DNA {
	public static void main(String[] args) {
	
	 System.out.println(oneToOne());
	 System.out.println(nToN(2));
	 
     System.out.println("Compressed Sequence: " + compress());
     System.out.println(basePairAT());
     System.out.println(basePairCG());
     System.out.println(countUnique());
	 }
	
	
	public static String genSequence() {
		String m = "";
		int i =0;
		while(i<1000) {
			String ran = generateRandomLetter();
			if(ran.equals("A")||ran.equals("C")||ran.equals("T")||ran.equals("G")) {
				m+=ran;
				i++;}
		
		}
		return m;
			
	}
	String seq1 = genSequence();
	String seq2 = genSequence();
	public static String oneToOne() {
		int count =0;
		String seq1 = genSequence();
		String seq2 = genSequence();
		for(int i =0; i<1000; i++) {
			
			if(seq1.substring(i,i+1).compareTo(seq2.substring(i,i+1))==0) {
				count++;
			}	
		}
		
		double perc = (count/1000.0)* 100;
		
		if(perc>=50)
			return "IDENTICAL";
		else if(perc>= 30)
			return "IDEAL";
		else
			return "LOW";
	}

public static String nToN(int n) {
    int count = 0;
    String seq1 = genSequence();
    String seq2 = genSequence();

    for (int i = 0; i < 1000 - n + 1; i++) {
        String subSeq1 = seq1.substring(i, i + n);
        String subSeq2 = seq2.substring(i, i + n);

        if (subSeq1.compareTo(subSeq2) == 0) {
            count += n;
            i += n - 1;
        }
    }

    double perc = (count / 1000.0) * 100;

    if (perc >= 50)
        return "IDENTICAL";
    else if (perc >= 30)
        return "IDEAL";
    else
        return "LOW";
}
public static String compress() {
	String seq = genSequence();
	int stind = 0;
    String compressedSeq = "";

    for (int i = 0; i < seq.length() - 1; i++) {
        if (!(seq.substring(i,i+1).equals(seq.substring(i + 1,i+2)))) {
            compressedSeq += seq.substring(i,i+1);
        }
    }

    if (seq.length() > 0) {
        compressedSeq += seq.substring(seq.length() - 1,seq.length());
    }

    return compressedSeq;
}
public static int basePairAT() {
	String seq1 = genSequence();
    String seq2 = genSequence();
int count =0;
    for(int i =0 ; i<1000;i++) {
    	if((seq1.substring(i,i+1).equals("A")||seq1.substring(i,i+1).equals("A"))&&(seq2.substring(i,i+1).equals("A")||seq2.substring(i,i+1).equals("A")))
    		count++;
    }
    return count;
}
public static int basePairCG() {
	String seq1 = genSequence();
    String seq2 = genSequence();
int count =0;
    for(int i =0 ; i<1000;i++) {
    	if((seq1.substring(i,i+1).equals("C")||seq1.substring(i,i+1).equals("G"))&&(seq2.substring(i,i+1).equals("C")||seq2.substring(i,i+1).equals("G")))
    		count++;
    }
    return count;
}
public static int countUnique() {
    String seq3 = genSequence2();
    String seq4 = genSequence2();
    
    int count = 0, j = 0;
    for(int i =0; i<1000; i++) {
    while (j < seq3.length() && j < seq4.length()) {
        if (!seq3.substring(j, j + 1).equals(seq4.substring(j, j + 1))) {
            count++;
        }
        j++; 
    }
    
    }
    return count;
}


	
	public static String generateRandomLetter() {
		int ran = (int)(Math.random()*26);
		char letter = (char)('A' + ran );
		String s="";
		s+=letter;
		return s;
	}
	public static String genSequence2() {
		String m = "";
		int i =0;
		while(i<500) {
			String ran = generateRandomLetter();
			if(ran.equals("A")||ran.equals("C")||ran.equals("T")||ran.equals("G")) {
				m+=ran;
				i++;}
		
		}
		return m;
			
	}
	
}
