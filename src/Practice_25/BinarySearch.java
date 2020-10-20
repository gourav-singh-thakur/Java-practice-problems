package Practice_25;
public class BinarySearch
{
	public static int binarySearch(int arr[],int x)
	{
		int first=0;
		int last=arr.length-1;
		while(first<=last)
		{
			int middle=(first+last)/2;
			if(arr[middle]==x)
				return middle;
			else if(x>arr[middle])
			{
				first=middle+1;
			}
			else
			{
				last=middle-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]={2,3,22,44,45,67,87,92,98};
		System.out.println(binarySearch(arr,87 ));
	}
}