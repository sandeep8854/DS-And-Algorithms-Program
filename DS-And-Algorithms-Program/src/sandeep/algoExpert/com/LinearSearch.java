package sandeep.algoExpert.com;
import java.util.Scanner;
public class LinearSearch 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length  ?   ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Any Number Which You Want to Search  ?    ?   ");
		int search=sc.nextInt();
		int res=linearSearch(arr,search);
		if(res==-1)
			System.out.println("Element is Not Present in this Array ");
		else
			System.out.println("Element is Present at index " +res);
	}
	private static int linearSearch(int[] arr, int search)
	{
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			if(arr[i]==search)
				return i;
		}
		return -1;
	}
}
/*
Enter Any Array Length  ?   ?  
5
2
3
5
10
40
Enter Any Number Which You Want to Search  ?    ?   
10
Element is Present at index 3
*/