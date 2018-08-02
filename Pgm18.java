package guviplayset123;
import java.util.*;
public class Pgm18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("enter the string(anagram)");
		String ana=s.next();
		char a[]=ana.toCharArray();
		Arrays.sort(a);
		System.out.println("enter the array length");
		int strlen=s.nextInt();
		int count=0,counter=0;
		String test[]= new String[strlen];
		System.out.println("enter the string in array checking for anagram");
		for (int i = 0; i <strlen; i++) {
			test[i]=s.next();
		}
		for (int i = 0; i <strlen; i++) {
	         count=0;
			char ch[]=test[i].toCharArray();
			Arrays.sort(ch);
			if(ch.length==a.length) {
			for(int j=0;j<ch.length;j++) {
			if(ch[j]==a[j]) {
				count++;
			}}
		}
			if(count==ana.length()) {
				counter++;
			}
	    }
		System.out.println(counter);
	}

}
