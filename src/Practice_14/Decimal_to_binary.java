package Practice_14;

import java.util.Scanner;

public class Decimal_to_binary
{
  public static void main(String[] args)
  { 
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
	String bin="";
	while(n>0)
	{
		int r=n%2;
		bin=r+bin;
		n=n/2;
	}
	System.out.println(bin);
  }
}