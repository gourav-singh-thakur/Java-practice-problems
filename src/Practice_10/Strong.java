package Practice_10;

import Practice_9.Factorial;

public class Strong
{
	public static boolean isStrong(int n)
	{
		int temp=n;
		int rem=0,sum=0;
		while(temp!=0)
		{
			rem=temp%10;
			sum+=Factorial.factorial(rem);
			temp=temp/10;
		}
		if(sum==n)
		{
			return true;
		}
		else {
		return false;
	
		}}
	public static void main(String[]args)
	{
		System.out.println(Strong.isStrong(145));
		
	}
}