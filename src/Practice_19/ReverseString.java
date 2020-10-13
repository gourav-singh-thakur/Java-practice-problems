package Practice_19;
public class ReverseString
{
	public static String reverse(String a)
	{   
		char ch[]=a.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<=j)
		{
			char c=ch[i];
			ch[i]=ch[j];
			ch[j]=c;
			i++;
			j--;
		}
		return new String(ch);
		
	}
	public static void main(String[] args) {
		System.out.println(reverse("abc"));
	}
}