package Practice_18;
public class Palindrom
{
	public static boolean isPalindrom(String a)
	{   
		char ch[]=a.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<=j)
		{
			if(ch[i]!=ch[j])
				{return false;}
			i++;
			j--;
		}
		return true;
		
	}
	public static void main(String[] args) {
		System.out.println(isPalindrom("ab"));
	}
}