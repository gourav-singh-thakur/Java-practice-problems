package Practice_17;
public class LowerCase
{
	public static String lowerCase(String a)
	{   
		char ch[]=a.toCharArray();
		String nstr="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65&&ch[i]<=90)
			{
				nstr=nstr+((char)(ch[i]+32));
			}
			else
				nstr=nstr+ch[i];
		}
		return nstr;
	}
	public static void main(String[] args) {
		System.out.println(lowerCase("gAUrAv"));
	}
}