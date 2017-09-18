package a1;

import java.util.Scanner;
public class z5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		if (su(n))
			System.out.print(n);
		else
			System.out.print(n+"=");
		while(!su(n)) {
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0) {
				System.out.print(i+"x");
				n=n/i;
				i=2;
				}
			if(su(n))
			{	System.out.print(n);
			    break;
		}}
		}
	
	
	}
	public static boolean su(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
		if(n%i==0) 
		return false;
	    }
		return true;
	}
}