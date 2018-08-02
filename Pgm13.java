package guviplayset123;
import java.util.*;
public class Pgm13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int sum=0;
int t =0;
while(num!=0) {
	 t=num%10;
    sum=sum+(t*t);
    num/=10;
}
	System.out.println(sum);
	}
}
