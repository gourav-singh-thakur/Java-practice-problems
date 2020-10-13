package Practice_16;
public class RemoveSpace
{
	public static String removeSpace(String s)
	{
		char arr[]=s.toCharArray();
		String nstr="";
		for(int i=0;i<arr.length;i++)
		{  
			if(arr[i]!=32)
			{
			nstr=nstr+arr[i];
			}
		}
		return nstr;
	}
	public static void main(String[] args) {
		System.out.println(removeSpace("gourav singh thakur"));
	}
}