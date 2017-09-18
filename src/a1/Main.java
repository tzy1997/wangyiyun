package a1;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int[]a=new int[101];
        int[]b=new int[101];
        int[]c=new int[101];
        int n=0;
        int m=0;
        int max;
        int x;
        int y;
        for(int i=0;i<101;i++)
        {
            String s1=s.next();
            String s2=s.next();
            x=Integer.parseInt(s1);
            a[x]=Integer.parseInt(s2);    
            if(x>n)
                n=x;
            if(x==0)
                break;
        }
        for(int i=0;i<101;i++)
        {
            String s3=s.next();
            String s4=s.next();
            y=Integer.parseInt(s3);
            b[y]=Integer.parseInt(s4);
            if(y>m)
                m=y;
            if(y==0)
                break;
        }
    /*    for(int i=n;i>=0;i--)
        {
            System.out.print("a["+i+"]="+a[i]+" ");
        }
        System.out.println("");
        for(int i=m;i>=0;i--)
        {
            System.out.print("b["+i+"]="+b[i]+" ");
        }    */
        if(n>m)
            max=n;
        else
            max=m;
        for(int i=max;i>=0;i--)
        {
            c[i]=a[i]+b[i];
            if(c[i]<-1&&i!=0)
                System.out.print(c[i]+"x");
            else if(c[i]==-1&&i!=0)
                System.out.print("-x");
            else if(c[i]==0&&i!=0)
                continue;
            else if(c[i]==1&&i!=0)
            {
                if(i==max)
                    System.out.print("x");
                else
                    System.out.print("+x");
            }
            else if(c[i]>1&&i!=0)
            {
                if(i==max)
                    System.out.print(c[i]+"x");
                else
                    System.out.print("+"+c[i]+"x");
            }
            if(i>1)
                System.out.print(i);
            else if(i==0)
            {
                if(max==0||c[i]<0)
                    System.out.print(c[i]);
                else if(max>0&&c[i]>0)
                    System.out.print("+"+c[i]);
            }
        }
    }
}