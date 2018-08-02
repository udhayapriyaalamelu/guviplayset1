package guviplayset123;
import java.util.*;
public class Pgm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1=sc.nextLine();
int len=s.length();
int m=0,k=0;
for(int i=0;i<len;i++)
	for(int j=i+1;j<len;j++)
	{
		if(s.charAt(i)==s.charAt(j))
		{
			m=i;k=j;
	     }
    }
			if(s1.charAt(m)==s1.charAt(k))
				System.out.println("true");
			else
				System.out.println("false");
	}

}
