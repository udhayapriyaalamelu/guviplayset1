package guviplayset123;
import java.util.*;
public class Pgm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char temp;
String s1=" ";
for(int i=0;i<s.length();i=i+2)
{
	char c=s.charAt(i);
	char cc=s.charAt(i+1);
	temp=c;
	c=cc;
	cc=temp;
	s1=s1+c+cc;
}
System.out.println(s1);
	}

}
