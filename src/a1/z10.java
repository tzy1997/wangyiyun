package a1;
import java.util.Scanner;

public class z10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}

class Fraction{
	private int fenzi;
	private int fenmu;
	
	Fraction(int a,int b){
		this.fenzi=a;
		this.fenmu=b;
	}
	double toDouble() {
		return 1.0*fenzi/fenmu;
	}
	Fraction plus(Fraction r) {  
        Fraction m=new Fraction(0,1);
		m.fenzi=this.fenzi*r.fenmu+r.fenzi*this.fenmu;
        m.fenmu=this.fenmu*r.fenmu;
		return m;  
	}
	
	Fraction multiply(Fraction r) {
        Fraction m=new Fraction(1,1);
		m.fenzi=this.fenzi*r.fenzi;
		m.fenmu=this.fenmu*r.fenmu;
		return m;
	}
	
	void print() {
		int m,n,r;
		m=fenzi;
		n=fenmu;
		
		do {
			r=m%n;
			m=n;
			n=r;
		}while(n!=0);
		
		fenzi=fenzi/m;
		fenmu=fenmu/m;
		if(fenzi%fenmu==0)
			System.out.println(fenzi/fenmu);
		else {
		if(fenzi==fenmu)
			System.out.println(fenzi/fenmu);
		else
			System.out.println(fenzi+"/"+fenmu);
}}
}
