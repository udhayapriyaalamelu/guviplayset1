package guviplayset123;
import java.util.*;
public class Pgm10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String b=sc.nextLine();
char ch1[]=a.toCharArray();
char ch2[]=b.toCharArray();
int l1=ch1.length;
int l2=ch2.length;
int n=0;
if(l1==l2)
{
	for(int i=0;i<l1;i++)
	{
		if(ch1[i]!=ch2[i])
		{
			n=n+1;
		}
	}
	if(n==1)
		System.out.println("yes");
	else
		System.out.println("no");
}
else
	System.out.println("no");
	}

}
