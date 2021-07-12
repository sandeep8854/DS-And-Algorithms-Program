package sandeep.algoExpert.com;
import java.util.Arrays;
import java.util.Scanner;
public class Radix_Sort_Advanced 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length  ?    ?  ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Radix_Sort_Advanced rs=new Radix_Sort_Advanced();
		rs.radixSort(arr, size);
		System.out.println("Sorted Array in Ascending Order :-");
		System.out.println(Arrays.toString(arr));
	/*	int res[]=radixSort(arr,size);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}*/
	}
	private void radixSort(int[] arr, int size) 
	{
		//get Maximum element
		int max=getMax(arr,size);
		//Apply counting sort to sort element based on place value
		for(int place=1;max/place>0;place*=10)
		{
			contingSort(arr,size,place);
		}	
	}
	//Using Counting sort to sort the element int the basis of significant places
	private void contingSort(int[] arr, int size, int place)
	{
		int output[]=new int[size+1];
		int max=arr[0];
		for(int i=1;i<size;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		
		int count[]=new int[max+1];
		for(int i=0;i<max;++i)
		{
			count[i]=0;
		}
		
		//calculate count of element
		for(int i=0;i<size;i++)
		{
			count[(arr[i]/place)%10]++;
		}
		
		//counting commulative count
		for(int i=1;i<10;i++)
		{
			count[i]+=count[i-1];
		}
		
		//place the element in sorted order
		for(int i=size-1;i>=0;i--)
		{
			output[count[(arr[i]/place)%10]-1]=arr[i];
			count[(arr[i]/place)%10]--;
		}
		
		for(int i=0;i<size;i++)
		{
			arr[i]=output[i];
		}
	}
	//Function to get largest element from the Array
	private int getMax(int[] arr, int n)
	{
		int max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
}
/*
Enter Any Array Length  ?    ?  
7
121
432
564
23
1
45
788
Sorted Array in Ascending Order :-
[1, 23, 45, 121, 432, 564, 788]
*/