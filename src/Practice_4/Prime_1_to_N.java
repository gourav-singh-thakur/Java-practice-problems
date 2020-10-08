package Practice_4;

import java.util.Scanner;

public class Prime_1_to_N
{
	public static void prime_1_to_N(int n)
	{
		for(int i=2;i<=n;i++)
		{  boolean isPrime=true;
		  for(int j=2;j<i;j++)
		  {
			  if(i%j==0)
				  isPrime=false;
		  }
		  if(isPrime==true)
			  System.out.println(i);
			  
		}
	}
	public static void main(String[]args)
	{   Scanner sc=new Scanner(System.in);
		Prime_1_to_N.prime_1_to_N(sc.nextInt());
		
	}
}