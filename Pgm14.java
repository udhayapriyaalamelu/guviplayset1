package guviplayset123;
import java.util.*;
public class Pgm14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
String s=sc.nextLine();
 String str=" ";
 for(int i=0;i<size;i++)
 {
	 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
	 continue;
	 else
		 str+=s.charAt(i);
 }
 int len=str.length();
 String rev=" ";
 for(int i=len-1;i>=0;i--) {
	 rev=rev+str.charAt(i);
 }
 System.out.print(rev);
	}

}
