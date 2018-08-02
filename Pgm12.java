package guviplayset123;
import java.util.*;
public class Pgm12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
{
	arr[i]=sc.nextInt();
}
//to enter the number of time rorating
int rot=sc.nextInt();
for(int j=0;j<=rot;j++)
{
	int t=arr[size-1];
	for(int i=size-2;i>=0;i--)
	{
		arr[i+1]=arr[i];
		
	}
	arr[0]=t;
}
for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]);
	}

}
