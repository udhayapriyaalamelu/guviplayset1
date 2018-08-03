package guviplayset123;
import java.util.*;
public class Pgm21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int x[]=new int[3];
int y[]=new int[3];
for(int i=0;i<3;i++)
{
	x[i]=sc.nextInt();
	y[i]=sc.nextInt();
}
int flag=0;
for(int i=0;i<=2;i++)
{
	if(x[i]==x[i+1]||y[i]==y[i+1])
		flag=1;
	else
		
		flag=0;
	break;
}
if(flag==1)
	System.out.println("yes");
else
	System.out.println("no");
	}

}
