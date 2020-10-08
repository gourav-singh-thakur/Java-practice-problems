package Practice_12;
public class Armstrong
{
	public static int pow(int n,int p)
	{  if(n==0||p==0)
		return 1;
		int pow=1;
		while(p>0)
		{
			pow=pow*n;
			p--;
		}
		return pow;
	}
	public static int count(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	public static boolean isArmstrong(int n)
	{  int temp=n;
	int sum=0;
		while(n!=0)
		{
			sum+=pow(n%10,count(temp));
			n/=10;
	     }
		
		if(temp==sum)
			return true;
		else
			return false;
	}
	
	public static void main(String[]args)
	{
		System.out.println(isArmstrong(7));
	}
    }


