package a1;
import java.util.Scanner;  
  
public class test {  
  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        Scanner in=new Scanner(System.in);  
                String str = new String();  
                String time = null;  
                str = in.nextLine();  
                char ch,s;  
                while(str.equals("END")==false)  
                {  
                    String[] ss = str.split(",");  
                    if(ss[0].equals("$GPRMC")==false)  
                    {  
                        str = in.nextLine();  
                        continue;  
                    }  
                    int j = str.indexOf("*");  
                    int result = str.charAt(1);  
                    for(int i=2;i<j;i++)  
                    {  
                        ch = str.charAt(i);  
                        result^=(int)ch;                  
                    }  
                    String num = str.substring(j+1);  
                    boolean state=false;  
                    if(ss[2].charAt(0)=='A')  
                    {  
                        state=true;  
                    }  
                    if(result%65536==Integer.parseInt(num,16) && state )  
                    {  
                        time = ss[1];  
                    }  
                    str = in.nextLine();  
                      
                }  
                if(time == null )  
                {  
                    System.exit(0);  
                }  
                int hour = Integer.parseInt(time.substring(0, 2));
				int minute =Integer.parseInt(time.substring(2, 4));	
				int second = Integer.parseInt(time.substring(4, 6));
				if(hour>16)
					hour=hour-16;
				else
					hour=hour+8;  
                System.out.printf("%02d:%02d:%02d",hour,minute,second);
                
                      
                  
                      
                  
    }  
  
}  
