package guviplayset123;
import java.util.*;
public class Pgm19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num,i,j,flag=1;
 num=sc.nextInt();
for(j=2;j<=num;j++)
{
if(num%j==0)
{
flag=1;
for(i=2;i<=j/2;i++)
{
if(j%i==0)
{
flag=0;
break;
}
}
if(flag==1)
{
	System.out.println(j);
}
}
}
}}
