package Practice_8;

import java.util.Scanner;

public class Palindrom
{
	public static void main(String[]args)
	{
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int t=n;
	  int rev=0;
	  while(t!=0)
	  {
		  rev=rev*10+(t%10);
		  t=t/10;
	  }
	  if(rev==n)
		  System.out.println("palindrom");
	  else
		  System.out.println("Not palindrom");
	}
}