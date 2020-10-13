package Practice_20;
public class CountCharacter
{
	public static int count(String str)
	{   int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65&&ch[i]<=90 || ch[i]>=97&&ch[i]<=122||ch[i]>=48&&ch[i]<=57)
				count++;
		}
		
		return count;
		
	}
	public static void main(String[] args) {
		System.out.println(count("character2"));
	}
}