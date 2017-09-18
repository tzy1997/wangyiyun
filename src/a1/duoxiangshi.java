package a1;
import java.util.Scanner;
public class duoxiangshi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		StringBuffer str = new StringBuffer("");
		int a[]=new int[101];
		for(int i=0;i<101;i++)
			a[i]=0;
		boolean panduan=true;
		int sum=0;
		int i=0;
		int cnt=0;
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
		for(int c=0;c<max;c++)
			if(a[c]!=0)
				cnt++;
		if(cnt==0)
			panduan=true;
		if(panduan) {
		for(int n=max;n>=2;n--) {
			if(a[n]!=0) {
			    if(a[n]==1)
			   	str.append("+"+"x"+n);
			    else if(a[n]>0)
				str.append("+"+a[n]+"x"+n);
                
			    if(a[n]==-1)
              	str.append("-"+"x"+n);   
                else if(a[n]<0)
                str.append(a[n]+"x"+n);
			}	
		}
		//System.out.print(a[1]+" a1~~~");
		
		if(a[1]!=0) {
			if(a[1]==1) {
				str.append("+x");
			//System.out.print("~~~1");	
			}	
			if(a[1]==-1) 
				str.append("-x");
				//System.out.print("~~~2");	}
			if  (a[1]!=1&&a[1]!=-1) {
			if (a[1]>0) {
		     	str.append("+"+a[1]+"x");
				//System.out.print("~~~3");
			}
		     	else {
				str.append("-"+a[1]+"x");
				//System.out.print("~~~4");
		     	}
		     	}
	        		
		}
		
		if(a[0]!=0) {
			if(a[0]>0)
				str.append("+"+a[0]);
			if(a[0]<0)
				str.append(a[0]);
		}
		if(str.charAt(0)=='+')
		System.out.print(str.substring(1,str.length()));
		else
		System.out.print(str);		
		}
		else
			System.out.print("0");
	}
} 