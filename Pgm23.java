package guviplayset123;
import java.util.*;
public class Pgm23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int arrsize1=sc.nextInt();
int arrsize2=sc.nextInt();
int arr1[]=new int[arrsize1];
int arr2[]=new int[arrsize2];
for(int i=0;i<arrsize1;i++)
	arr1[i]=sc.nextInt();
for(int i=0;i<arrsize2;i++)
	arr2[i]=sc.nextInt();
int max1=arr1[0];
int max2=arr2[0];
for(int i=0;i<arrsize1;i++)
	if(max1<arr1[i])
		max1=arr1[i];
for(int i=0;i<arrsize2;i++)
	if(max2<arr2[i])
	max2=arr2[i];
System.out.println(max1+" "+max2);
	}

}
