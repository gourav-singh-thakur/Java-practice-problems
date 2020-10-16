package Practice_21;
public class DecToBinary
{
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
		  j--;
		  i++;
	  }
	  return new String(ch);
  }
  public static String decToBinary(int n)
  {  String ns="";
	  while(n!=0)
	  {
		  int rem=n%2;
		  ns=ns+rem;
		  n=n/2;
	  }
    return reverse(ns);  
  }
  public static void main(String[] args) {
	System.out.println(decToBinary(30));
	System.out.println("done");
}
}