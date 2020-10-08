package Practice_5;

import java.util.Scanner;

public class PrimeSum
{
	public static boolean isPrime(int n)
	{  int i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(n==i)
			return true;
		return false;
		
	}
	public static void main(String[]args)
	{   int sum=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
				sum+=i;
		}
		System.out.println(sum);
	}
}