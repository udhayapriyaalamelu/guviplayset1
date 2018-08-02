package guviplayset123;
import java.util.*;
public class Pgm17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int r=sc.nextInt();
int len=0;
if(l>r)
{
	len=l;
}
else
{
	len=r;
}
for(int i=2;i<=len;i++)
{
	if((i%l==0) && (i%r==0))
	{
		System.out.println(i);
		break;
	}
}
}
}
