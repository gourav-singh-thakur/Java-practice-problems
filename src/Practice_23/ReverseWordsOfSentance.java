package Practice_23;
public class ReverseWordsOfSentance
{
	public static String reverseWordsOfSentance(String a)
	{
		char ch[]=a.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			int k=i;
			while(i>=0&&ch[i]!=' ')
			{
				i--;
			}
			int j=i+1;
			while(j<k)
			{
				char temp=ch[j];
				ch[j]=ch[k];
				ch[k]=temp;
				j++;
				k--;
			}
		}
		return new String(ch);
	}
	
	public static void main(String[] args) {
		System.out.println(reverseWordsOfSentance("ram and sita"));
	}
	
	
	
}