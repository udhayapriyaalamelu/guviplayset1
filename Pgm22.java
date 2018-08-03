package guviplayset123;
import java.util.*;
public class Pgm22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []arr=new int[2];
		for(int i=0;i<2;i++)
			arr[i]=sc.nextInt();
		ArrayList a=new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <=arr[i]; j++) {
				if(arr[i]%j==0) {
					a.add(j);
				}
			}
			
		}
	int y=0,c=0;
		in:for(int i=a.size()-1;i>=0;i--) {
			c=0;
			for(int j=i;j>=0;j--) {
				if(a.get(i)==a.get(j)) {
					c++;
					
				}
				if(c==2) {
					y=(int)a.get(i);
					break in;
				}
			}
		}
      System.out.println(y);
		
		
	}

}
