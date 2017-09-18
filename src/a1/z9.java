package a1;

import java.util.Scanner;

public class z9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String time;
		int hour1;
		int hour2;
		int minute1;
		int minute2;
		int second1;
		int second2;

		StringBuffer str = new StringBuffer("");

		while (true) {
			int yz = 0;
			String mid = "";
			int q;
			boolean ni = true;
			int p = 0;
			String b[];
			String a = in.nextLine();
			if(a.equals("END"))
				break;
			b = a.split(",");
			for (int i = 0; i < b.length - 1; i++)
				mid = mid + b[i];
			mid = mid + b[b.length - 1].split("\\*")[0];
			yz = Integer.parseInt(b[b.length - 1].split("\\*")[1], 16);
			q = mid.charAt(1)^mid.charAt(2);
			 //System.out.println(q);
			for (int i = 3; i < mid.length(); i++) {
				q = q ^ mid.charAt(i);
		//		System.out.println(p+" "+mid.charAt(i));
			}
		//	System.out.println('G'^'P');
		//	System.out.println("yz="+yz+" p%65536="+p%65536);
		//	System.out.println(126%65536);
		//	System.out.println('G'^'P'^'R'^'M'^'C'^'0'^'2'^'4'^'8'^'1'^'3'^'.'^'6'^'4'^'0'^'A'^'3'^'1'^'5'^'8'^'.'^'4'^'6'^'0'^'8'^'N'^'1'^'1'^'8'^'4'^'8'^'.'^'3'^'7'^'3'^'7'^'E'^'1'^'0'^'.'^'0'^'5'^'3'^'2'^'4'^'.'^'2'^'7'^'1'^'5'^'0'^'7'^'0'^'6'^'A');
			if (q % 65536 == yz) {
				time = b[1];
				hour1 = Integer.parseInt(b[1].substring(0, 2));
				minute1 =Integer.parseInt(b[1].substring(2, 4));	
				second1 = Integer.parseInt(b[1].substring(4, 6));
				if(hour1>16)
					hour1=hour1-16;
				else
					hour1=hour1+8;
			//	System.out.printf("%02d:%02d:%02d",hour1,minute1,second1);
			str.append(String.format("%02d:%02d:%02d",hour1,minute1,second1));
			
			}
			
		}
		System.out.print(str);
	}
}
