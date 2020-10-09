package Practice_13; 
public class Binay_to_Decimal
{
	public static int pow(int n,int p)
	{  int pow=1;
	    while(p>0)
	    {
	    	pow=pow*n;
	    	p--;
	    }
	   return pow;
	}
	public static int decimalValue(int n)
	{
		int count=0,r=0,dec=0;
		while(n>0)
		{
			r=n%10;
			dec=dec+r*pow(2,count);
			count++;
			n/=10;
		}
		return dec;
	}
	public static void main(String[] args) {
		System.out.println(decimalValue(10100));
	}
	
}