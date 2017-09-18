package a1;
import java.util.ArrayList;
import java.util.Scanner;
public class z2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<String> strArray = new ArrayList<String> ();
		int i=0;
		int q=0;
		
		if(n<0) {
			n=-n;
			q=1;
		}
		if(n==0)
			System.out.print("ling");
		while(n>0)
		{
			strArray.add(n%10+"");
			i++;
			n=n/10;
	    }
  		int a[]=new int[i];
  		for(int m=0;m<i;m++)
  			a[m]=Integer.parseInt(strArray.get(m));
		
		for(int p=0;p<i;p++)
			{
			switch(a[p]) {
			case 1: strArray.set(p, "yi");break;
			case 2: strArray.set(p, "er");break;
			case 3: strArray.set(p, "san");break;
			case 4: strArray.set(p, "si");break;
			case 5: strArray.set(p, "wu");break;
			case 6: strArray.set(p, "liu");break;
			case 7: strArray.set(p, "qi");break;
			case 8: strArray.set(p, "ba");break;
			case 9: strArray.set(p, "jiu");break;
			case 0: strArray.set(p, "ling");break;
//			case "2": a[p]="er";break;
//			case "3": a[p]="san";break;
//			case "4": a[p]="si";break;
//			case "5": a[p]="wu";break;
//			case "6": a[p]="liu";break;
//			case "7": a[p]="qi";break;
//			case "8": a[p]="ba";break;
//			case "9": a[p]="jiu";break;
//			case "0": a[p]="ling";break;
			}
			}
			if(q==1)
				System.out.print("fu ");
			for(int p=i-1;p>=0;p--) {
				System.out.print(strArray.get(p));
			if(p!=0)
				System.out.print(" ");
			}
			
	}

	
}
