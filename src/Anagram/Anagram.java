package Anagram;
//Time complexity=O(n^2)
public class Anagram
{
	public static boolean isAnagram(String a,String b)
	{   
		boolean isAnagram=false;
	    boolean visited[]=new boolean[b.length()];
	    if(a.length()==b.length())
	    {
		for(int i=0;i<a.length();i++)
		{   char c=a.charAt(i);
			isAnagram=false;
			for(int j=0;j<b.length();j++)
			{
				if(c==b.charAt(j) && visited[j]==false)
				{   visited[j]=true;
					isAnagram=true;
				    break;
				}
			}
			if(isAnagram==false)
			{
				return false;
			}
		}
		if(isAnagram==true)
			return true;
		else
			return false;
	    }
	    else
	    	return false;
		
	}
	
	public static void main(String[] args) {
		System.out.println(isAnagram("aba","baa"));
	}
}