package Practice_11;
public class GCD
{
	public static int gcd(int m,int n)
	{
	if(m==0){
		return n;
	}
	if(m>n)
		return gcd(n,m);
		
	return gcd(n%m,m);
	
	
	}
	public static void main(String[]args)
	{
		System.out.println(GCD.gcd(6,9));
	}
}