package Anagram;

public class Optimized_Anagram 
{
	public static boolean isAnagram(String a,String b)
	{
		int visited[]=new int[256];
		for(int i=0;i<a.length();i++)
		{
			visited[a.charAt(i)]++;
		}
		for(int i=0;i<b.length();i++)
		{
			visited[b.charAt(i)]--;
		}
		for(int i=0;i<visited.length;i++)
		{
		   if(visited[i]!=0)
			   return false;
	    }
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("This is a para","para is a Thiss"));
       
	}

}
