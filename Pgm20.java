import java.util.*;
import java.util.Scanner;
class Pgm20
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
for(int i=0;i<s.length();i++)
{
  if(s.charAt(i)=='z')
  System.out.print("c");
  else if(s.charAt(i)=='Z')
  System.out.print("C");
  else if(s.charAt(i)=='y')
  System.out.print("b");
  else if(s.charAt(i)=='Y')
  System.out.print("B");
  else if(s.charAt(i)=='x')
  System.out.print("a");
  else if(s.charAt(i)=='X')
  System.out.print("A");
  else
  System.out.print((char)(s.charAt(i)+3));
  }
  }
  }
