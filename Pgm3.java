package guviplayset123;
import java.util.*;
public class Pgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();
int len=n.length();
String rev="";
for(int i=len-1;i>=0;i--)
{
	rev=rev+n.charAt(i);
}
System.out.println(rev);
	}

}
