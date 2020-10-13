package BubbleSort;
public class BubbleSort
{
	public static String bubbleSort(String s)
	{
		char[]ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length()-i-1;j++)
			{
				if(ch[j]>ch[j+1])
				{
					char c=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=c;
				}
			}
		}
		String str=new String(ch);
		return str;
		
	}
	public static void main(String[] args) {
		System.out.println(bubbleSort("gaurav"));
	}
}