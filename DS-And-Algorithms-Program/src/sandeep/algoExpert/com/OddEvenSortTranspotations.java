package sandeep.algoExpert.com;
import java.util.Scanner;
public class OddEvenSortTranspotations 
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
		
		int res[]=oddEvenSort(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}
	}
	private static int[] oddEvenSort(int[] arr)
	{
		int n=arr.length;
		boolean isSorted=false;
		while(!isSorted)
		{
			isSorted=true;
			int temp=0;
			//perform bubble sort odd index element 
			for(int i=1;i<=n-2;i=i+2)
			{
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					isSorted=false;
				}
			}
			//perform bubble sort on even index element
			for(int i=0;i<=n-2;i=i+2)
			{
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					isSorted=false;
				}
			}
		}
		return arr;
	}
}
/*
Enter Any Array Length ?   ?  
5
3
4
1
5
2
1 2 3 4 5 
Enter Any Array Length ?   ?  
10
3
2
56
24
12
35
98
14
25
35
2 3 12 14 24 25 35 35 56 98 
*/