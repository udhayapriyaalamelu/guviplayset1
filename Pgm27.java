package guviplayset123;
import java.util.*;
public class Pgm27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String str="";
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)>='a'&&s.charAt(i)<='z')
	{
		str+=(char) (s.charAt(i)-32);
	}
	if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
		str+=(char) (s.charAt(i)+32);
}
System.out.println(str);
	}

}
