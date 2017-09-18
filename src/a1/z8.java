package a1;
import java.util.Scanner;

public class z8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		StringBuffer str=new StringBuffer("");
		String a = in.nextLine();
		String b[]=null;
		a=a.substring(0,a.length()-1);
		
		b=a.split("\\s+");

		for(int i=0;i<b.length;i++)
			str.append(sumi(b[i])+" ");
			str.deleteCharAt(str.length()-1);
			System.out.print(str);
	}
	
	public static int sumi(String n){
		return n.length();
	}

}
