package sandeep.algoExpert.com;
import java.util.Scanner;
public class Jump_Search 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?   ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Search Value  ?   ? ");
		int target=sc.nextInt();
		int result=jumpSearch(arr,target);
		if(result==-1)
			System.out.println("Element Not Found .");
		else
			System.out.println("Element Found at index " +result);
	}

	private static int jumpSearch(int[] arr, int target)
	{
		int n=arr.length;
		int mid=(int) Math.sqrt(n);
		int i=0;
		while(arr[Math.min(mid, n)-1]<target)
		{
			i=mid;
			mid=(int) (mid+Math.sqrt(n));
			if(i>=n)
				return -1;
		}
		while(arr[i]<target)
		{
			i++;
			if(i==Math.min(mid, n));
			return -1;
		}
		if(arr[i]==target)
			return i;
		return -1;
	}
}

/*
Enter Any Array Length ?   ?  
9
0
1
2
3
4
5
6
7
8
Enter Search Value  ?   ? 
6
Element Found at index 6
Enter Any Array Length ?   ?  
5
1
2
3
4
5
Enter Search Value  ?   ? 
6
Element Not Found .
*/
	


