package guviplayset123;
import java.util.*;
public class Pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String rev="";
int len=s.length();
for(int i=len-1;i>=0;i--)
{
	rev=rev+s.charAt(i);
}
System.out.println(rev);
	}

}
