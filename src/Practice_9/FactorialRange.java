package Practice_9;

import java.util.Scanner;

public class FactorialRange {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   for(int i=1;i<=n;i++)
		   System.out.println(i+"!"+"="+Factorial.factorial(i));

	}

}
