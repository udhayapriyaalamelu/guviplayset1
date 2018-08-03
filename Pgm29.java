package guviplayset123;
import java.util.*;
public class Pgm29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int r=sc.nextInt();
int count=0;
for(int i=l;i<=r;i++)
{
	for(int j=2;j<=r;j++)
	{
		if((j*j)==i)
		{
			count=count+1;
		}
	}
}
System.out.println(count);
	}

}
