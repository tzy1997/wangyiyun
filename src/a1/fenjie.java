package a1;
import java.util.Scanner;
public class fenjie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	//System.out.print(sushu(n));
	if(sushu(n))
	System.out.print(n+"="+n);
	else {
		System.out.print(n+"=");
	while(!sushu(n)) {
		for(int i=2;i<n;i++)
			if(n%i==0) {
			System.out.print(i+"x");
				n=n/i;
				break;
			}
	}
	System.out.print(n);
	}
	}
	public static boolean sushu(int n) {
		int a=0;
		int cnt=0;
		if(n==2)
		return true;
		else {
		for(int i=2;i<=Math.sqrt(n);i++)
			if(n%i==0)
			{
				cnt++;
			}
		if(cnt==0)
			return true;
		else 
			return false;
		}
		}
}
