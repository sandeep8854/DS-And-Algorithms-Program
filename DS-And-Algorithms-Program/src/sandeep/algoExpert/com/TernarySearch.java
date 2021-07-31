package sandeep.algoExpert.com;
import java.util.Scanner;
public class TernarySearch
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Lenght  ?   ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter The Number Which You Want to Search    ?        ?   ");
		int search=sc.nextInt();
		int res=ternarySearch(arr,search);
		if(res==-1)
			System.out.println("Number Not Found !");
		else
			System.out.println("Number Found at index: " +res);
	}
	private static int ternarySearch(int[] arr, int search)
	{
		int n=arr.length;
		int left=0;
		int right=n-1;
		
		while(right>=left)
		{
			int mid1=left+(right-left)/3;        //3
			int mid2=right-(right-left)/3;       //6
			
			if(arr[mid1]==search)
			{
				return mid1;
			}
			if(arr[mid2]==search)
			{
				return mid2;
			}
			
			if(search < arr[mid1])
			{
				right=mid1-1;
			}
			else if(search>arr[mid2])
			{
				left=mid2+1;
			}
			else
			{
				left=mid1+1;
				right=mid2-1;
			}
		}
		return -1;
	}	
}

/*
Enter Any Array Lenght  ?   
10
10
20
30
40
50
60
70
80
90
100
Enter The Number Which You Want to Search    ?        ?   
60
Number Found at index: 5
Enter Any Array Lenght  ?   
10
1
2
3
4
5
6
7
8
9
10
Enter The Number Which You Want to Search    ?        ?   
11
Number Not Found !
*/