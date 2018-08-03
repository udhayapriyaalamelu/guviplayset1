package guviplayset123;
import java.util.*;
public class Pgm24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char ch[]=s.toCharArray();
boolean bool=false;
for(int i=0;i<ch.length;i++)
{
	if(ch[i]>='0'&&ch[i]<='9')
	bool=true;
	else 
		bool=false;
}
if(bool)
	System.out.println("yes");
else
	System.out.println("no");
	}

}
