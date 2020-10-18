package Practice_22;
public class ReverseSentence
{
	public static String reverseString(String a)
	{
		String nst="";
	char ch[]=a.toCharArray();   
	for(int i=ch.length-1;i>=0;i--)
	{   int k=i;
		while( i>=0 && ch[i]!=' ') //don't forget about short circuit because of and operator
		{
			i--;
		}
		int j=i+1;
		while(j<=k)
		{
			nst=nst+ch[j];
			j++;
		}
		if(i>=0)
		nst=nst+' ';
		
	}
		return nst;
	}
	public static void main(String[] args)
	{
		System.out.println(reverseString("ram and sita"));
		
	}
}