import java.util.Scanner;

public class Assignment14 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int numVal=0, p,cnt1=0,cnt2,rem=0,prod=1,res=0;
	System.out.println("Enter the number: ");
	numVal=input.nextInt();
	p=numVal;
	while(p!=0)
	{
		p/=10;
		cnt1++;
	}
	cnt2=cnt1;
	p=numVal;
	while(p!=0) {
		rem=p%10;
		while(cnt2!=0) {
			prod*=rem;
			cnt2--;
		}
		res+=prod;
		cnt2=cnt1;
		p/=10;
		prod=1;
	}
	if(res==numVal)
		System.out.println(numVal+ " is an armstrong number");
	else
		System.out.println(numVal+" is not an armstrong number");
}
}
