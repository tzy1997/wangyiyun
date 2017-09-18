package a1;
import java.util.ArrayList;
import java.util.Scanner;
public class z12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<String> city=new ArrayList<String>();
		String a;
		String s[];
		int sum=0;
//		a=in.nextLine();
//		s=a.substring(0,a.length()-3).split(" ");
//		sum=s.length;
		while(true){
			a=in.next();
			if(a.equals("###"))
				break;
			else {
				city.add(a);
				sum++;
			}
			}
//		System.out.print(sum.length);
//		while(true) {
//		a=in.next();
//			if(!a.equals("###")) {
//		    city.add(a);
//			sum++;
//			}
//			else 
//				break;
//		}
//		
		int gl[][]=new int[sum][sum];
		for(int p=0;p<sum;p++) {
			a=in.nextLine();
			//System.out.println("a="+a);
			//System.out.println(s[0]+" "+s[1]+" "+s[2]);
			for(int q=0;q<sum;q++) {
				gl[p][q]=in.nextInt();
			//System.out.print(gl[p][q]+"!");
			}
		}
		String A=in.next();
		String B=in.next();
		
		//System.out.println("A="+A);	
		//System.out.print("B="+B);
		for(int i=0;i<sum;i++) {
			if(city.get(i).equals(A))
			{A=i+"";}
			if(city.get(i).equals(B))
			{B=i+"";}
		}
		int p1=Integer.parseInt(A);
		int p2=Integer.parseInt(B);
		//System.out.print(p1+" "+p2);
		System.out.print(gl[p1][p2]);
	}
	

}

