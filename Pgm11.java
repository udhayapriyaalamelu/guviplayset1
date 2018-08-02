package guviplayset123;
import java.util.*;
public class Pgm11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int i=0;
if(s.charAt(i)=='S'||s.charAt(i)=='s')
	System.out.println("yes");
else if(s.charAt(i)=='F'||s.charAt(i)=='f'||s.charAt(i)=='M'||s.charAt(i)=='m'||s.charAt(i)=='T'||s.charAt(i)=='t'||s.charAt(i)=='W'||s.charAt(i)=='w')
	System.out.println("no");
else
	System.out.println("invalid");
	}

}
