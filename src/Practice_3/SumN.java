package Practice_3;

import java.util.Scanner;

public class SumN{
	public static int sumN(int n)
	{  int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(SumN.sumN(sc.nextInt()));
	}
}