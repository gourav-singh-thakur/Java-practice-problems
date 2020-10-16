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
	public static String reverse(String a)
	  {
		  char ch[]=a.toCharArray();
		  int i=0;
		  int j=ch.length-1;
		  while(i<j)
		  {
			  char c=ch[i];
			  ch[i]=ch[j];
			  ch[j]=c;
			  i++;
			  j--;
		  }
		  return new String(ch);
	  }
	  public static String decToBinary(int n)
	  {  String ns="";
	 
		  while(n>0)
		  {
			  int rem=n%2;
			  ns=ns+rem;
			  n=n/2;
		  }
		
	    return reverse(ns);  
	  }
	public static void main(String[] args) {
		System.out.println(count("character2sfdwgfg"));
	int n=Integer.parseInt(decToBinary(20));
	System.out.println(n);
}
}