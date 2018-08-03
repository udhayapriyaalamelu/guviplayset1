package guviplayset123;
import java.util.*;
public class Pgm30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
int len=0;
if(s1.length()==s2.length())
	len=s1.length();
int k=sc.nextInt();
int count1=0;
for(int i=0;i<len;i++)
{
	count1=0;
	if(s1.charAt(i)!=s2.charAt(i))
		count1=count1+1;
}
if(k==count1)
	System.out.println("yes");
else
	System.out.println("no");
	}

}
