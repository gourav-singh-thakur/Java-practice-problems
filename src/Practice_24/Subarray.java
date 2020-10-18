package Practice_24;
public class Subarray
{
	public static int subarray(String a,String b)
	{
		char ch1[]=a.toCharArray();
		char ch2[]=b.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{   
			int k=i,j=0;
			while( j<ch2.length && i<ch1.length &&(ch1[k]==ch2[j]) )
			{
				k++;
				j++;
			}
			if(j==ch2.length)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(subarray("my name is gaurav","is"));
	}
}