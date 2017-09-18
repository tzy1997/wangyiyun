package a1;
import java.util.Scanner;
public class zz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String a[]=in.nextLine().split(" ");
		int p =Integer.parseInt(a[0]);
		int q= Integer.parseInt(a[1]);
		StringBuffer str=new StringBuffer("");
		int cnt=0;
		for(int i=p;i<=q;i++)
			if(wan(i)) {
			str.append(i+" ");
				cnt++;
			}
		if(cnt==0)
			System.out.print("NIL");
		else
			str.deleteCharAt(str.length()-1);
		System.out.print(str);
	}

	
	public static boolean wan(int n) {
		int sum=0;
			for(int i=1;i<n;i++)
			{
			if(n%i==0) {
				sum=sum+i;
			}
			}
			if(sum==n)
				return true;
			else 
				return false;
			
		}
}
