package Practice_26;
public class InsertElement
{
	public static int[]insert(int arr[],int in,int ele)
	{   
		int narr[]=new int[arr.length+1];
		for(int i=0;i<in;i++)
			narr[i]=arr[i];
		narr[in]=ele;
		for(int i=in;i<arr.length;i++)
			narr[i+1]=arr[i];
		
		return narr;
	}
	public static void main(String[] args) {
		int arr[]= {2,344,2,45,65,34,2,43};
		arr=insert(arr,0,77);
		for(int x:arr)
		{
			System.out.println(x);
		}
	}
}