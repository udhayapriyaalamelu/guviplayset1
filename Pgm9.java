package guviplayset123;
import java.util.*;
public class Pgm9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,m,count=0,count1=0; 
		  Scanner in=new Scanner(System.in);
		  n=in.nextInt();
		  m=in.nextInt();
		  for(int i=n; i<=m; i++){
			  
			  for(int j=2;j<i;j++){
		 if(i%j==0){
			 count++;
			 break;
		 }
		  
			  else{
				  count=0;
			  }
			  }
		  if(count==0){
			count1++;
		  }
		  }     
		  System.out.println(count1);

	}

}
