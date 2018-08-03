package guviplayset123;
import java.util.*;
public class Pgm25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
String arr[]=new String[size];
for(int i=0;i<size;i++)
{
	arr[i]=sc.next();
}
Arrays.sort(arr);
for(int i=0;i<size;i++)
System.out.println(arr[i]);
	}

}
