package SplitString;
public class Split
{   
	
	public static int countSpace(char ch[])
	{  int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==32)
			{
				count++;
			}
		}
		return count;
	}
	
	public static String[]split(String a)
	{   char ch[]=a.toCharArray();
		String arr[]= new String[countSpace(ch)+1];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]="";
		}
		int j=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				arr[j]=arr[j]+ch[i];
			}
			else
			{
				j++;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		String arr[]=split("my name is gaurav");
		for(String a:arr)
		{
			System.out.println(a);
		}
		
	}
}
