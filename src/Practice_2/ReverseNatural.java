package Practice_2;

import java.util.Scanner;

public class ReverseNatural {
    
	public static void reverseNatural(int n)
	{
		for(int i=n;i>0;i--)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ReverseNatural.reverseNatural(sc.nextInt());
      
	}

}
