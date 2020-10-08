package Practice_7;

import java.util.Scanner;

import Practice_6.PerfectNumber;

public class RangePerfect
{
	public static void main(String[]args)
	{
		java.util.Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		PerfectNumber p=new PerfectNumber();
		for(int i=1;i<n;i++)
		{
			if(p.isPerfect(i))
				System.out.println(i);
		}
	}
}