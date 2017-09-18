package a1;
import java.util.Scanner;
public class z4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		StringBuffer str = new StringBuffer("");
		int a[]=new int[101];
		for(int i=0;i<101;i++)
			a[i]=0;
		int sum=0;
		int i=0;
		int p=0,q=0;
		int max=0;
		String s[];
		String str1[]={};
		s=in.nextLine().split(" ");
		max=Integer.parseInt(s[0]);
		
		while(i<2) {		
			p=Integer.parseInt(s[0]);
			q=Integer.parseInt(s[1]);
			if(p==0)
				i++;
			if(a[p]==0)
			a[p]=q;
			else
			a[p]=a[p]+q;
			if(i==2)
				break;
			s=in.nextLine().split(" ");
		}
		
		if(a[max]!=1&&a[max]!=-1)
			str.append(a[max]+"x"+max);
		if(a[max]==1)
			str.append("x"+max);
		if(a[max]==-1)
			str.append("-x"+max);
		
		for(int n=max-1;n>=2;n--) {
			if(a[n]!=0) {
			if(a[n]>0)
				str.append("+");
			else
			{
			str.append("-");
			}
			if(a[n]==1&&a[n]==-1)
				str.append("x");
			else 
				str.append(Math.abs(a[n])+"x"+n);
			}
			
		}
		
	if(a[1]!=0)
		if(a[1]>0)
			str.append("+");
		else
			str.append("-");
		if(a[1]==1&&a[1]==-1)
			str.append("x");
		else
			str.append(Math.abs(a[1])+"x");
		if(a[0]>0)
			str.append("+"+a[0]);
		if(a[0]<0)
			str.append("-"+a[0]);
	
		System.out.println(str);
	}
	
		
	

}
