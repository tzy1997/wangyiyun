package a1;
import java.util.Scanner;
public class z1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s[]=in.nextLine().split(" ");
		int p=Integer.parseInt(s[0]);
		int q=Integer.parseInt(s[1]);
		int a[]=new int[200];
		for(int i=0;i<200;i++)
			a[i]=1;
		int cnt=1;
		int x;
		int sum=0;
		a[0]=2;
		asd:
		for(x=3;cnt<q;x++) {
			
			for(int i=0;i<cnt;i++) {
				if(x%a[i]==0)
					continue asd;
				}
		a[cnt++]=x;
		
		
		}
		
		for(int i=p-1;i<q;i++)
				sum=sum+a[i];
	System.out.println(sum);

	}

}
