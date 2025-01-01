
public class Dice {
	private int numb; 
	//program 1
public  int roll() {
	return ((int)(Math.random()*6))+1;
}
	public Dice(int n)
	{
		numb=n;
	}
	public void setn(int n) {
		numb = n;
	}
	public int getn() {
		return numb;
	}
	
	//program 2
	public int luckyNine(Dice d[]) {
		int x=0, g=0,z=0;
		
		for(int i =0;i<d.length-1;i++) {
			x=d[i].getn();
			g=d[i+1].getn();
			z=x+g;
			if((z==9))
			System.out.print("d["+i+"]= "+d[i].getn()+" and d["+(i+1)+"]= "+d[i+1].getn()+",  ");
		}
		System.out.println("\n");
		return z;
	}
	//program 3
	public int twins(Dice d[]) {
		int x=0, g=0;
		for(int i =0; i<d.length-1;i++) {
			x=d[i].getn();
			g=d[i+1].getn();
			
			if((g==x&&x!=1))
			System.out.print("d["+i+"]= "+d[i].getn()+" and d["+(i+1)+"]= "+d[i+1].getn()+",  ");
		}
		System.out.println("\n");
		return x;
	}
	//program 4
	public int snakeEyes(Dice d[]) {
		int x=0, g=0;
		for(int i =0; i<d.length-1;i++) {
			x=d[i].getn();
			g=d[i+1].getn();
			
			if((g==x&&x==1))
			System.out.print("d["+i+"]= "+d[i].getn()+" and d["+(i+1)+"]= "+d[i+1].getn()+",  ");
		}
		System.out.println("\n");
		return x;
	}
	//program 5
	public int evenOnEven(Dice d[]) {
		int x=0;
		for(int i = 0; i<d.length-2; i++) {
			x=d[i].getn();
			if(i%2==0 && d[i].getn()%2 ==0)
				System.out.print("d["+i+"]= "+d[i].getn()+",  ");
		}
		System.out.println("\n");
		return x;
	}
	//program 6
	public int threePeat(Dice d[]) {
		int x=0, g=0, f=0;
		for(int i =0; i<d.length-2;i++) {
			x=d[i].getn();
			g=d[i+1].getn();
			f=d[i+2].getn();
			if((g==x&&x==f))
			System.out.print("d["+i+"]= "+d[i].getn()+" and d["+(i+1)+"]= "+d[i+1].getn()+" and d["+(i+2)+"]= "+d[i+2].getn()+",    ");
		}
		System.out.println("\n");
		return x;
	}
	public int diceCount(Dice d[]) {
		int x=0, g=0, f=0;
		for(int i =0; i<d.length-2;i++) {
			x=d[i].getn();
			g=d[i+1].getn();
			f=d[i+2].getn();
			if((g==(x+1)&&f==(g+1)))
			System.out.print("d["+i+"]= "+d[i].getn()+" and d["+(i+1)+"]= "+d[i+1].getn()+" and d["+(i+2)+"]= "+d[i+2].getn()+",   ");
		}
		System.out.println("\n");
		return x;
	}
}


