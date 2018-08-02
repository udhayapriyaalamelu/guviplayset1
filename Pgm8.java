package guviplayset123;
import java.util.*;
public class Pgm8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String ss=" ";
String d[]=s.split(" ");
for(int i=0;i<d.length;i++)
{
	ss+=d[i].toUpperCase().charAt(0)+d[i].substring(1)+" ";
}
System.out.print(ss);
	}

}
