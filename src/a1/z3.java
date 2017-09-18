package a1;
import java.util.Scanner;
public class z3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in=new Scanner(System.in);
	int n=Integer.parseInt(in.nextLine());
	int a[][]=new int[n][n];
	String b[]=new String[n];
	int g=4;
	int cnt1=0;
	int cnt2=0;
	for(int i=0;i<n;i++)
	{
		b=(in.nextLine().split(" "));
		for(int j=0;j<n;j++)
			a[i][j]=Integer.parseInt(b[j]);
	}
	asd:
	for(int j=0;j<n-1;j++) {
		for(int k=0;k<n-1;k++) {
			if(a[j][k]!=a[j][k+1])
				continue asd;
			else
				cnt1++;
		
			if(a[k][j]!=a[k][j+1])
				continue asd;
			else
				cnt2++;
			
		}
	if(cnt1==n-1)
		g=a[j][0];
	if(cnt2==n-1)
		g=a[0][j];
	cnt1=0;
	cnt2=0;
	}
		
	zxc:
	for(int j=0;j<n-1;j++) {
		if(a[j][j]!=a[j+1][j+1])
		continue zxc;
		else
			cnt1++;
			
		
		if(a[j][n-1]!=a[j+1][n-1-1])
		continue zxc;
		else
			cnt2++;
		if(cnt1==n-1)
			g=a[j][j];
		if(cnt2==n-1)
			g=a[j][j];
	}
	if(g==1)
		System.out.println("X");
	if(g==0)
		System.out.println("O");
	if(g==4)
		System.out.println("NIL");



	}

}
