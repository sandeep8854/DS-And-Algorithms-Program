package sandeep.algoExpert.com;
import java.util.Scanner;
public class Binary_Search
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length ?   ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the search value ?  ? ");
		int search=sc.nextInt();
		binarySearch(arr,search);	
	}
	private static void binarySearch(int[] arr, int search)
	{
		int n=arr.length;
		int lowerBound=0;
		int upperBound=n-1;
		int middle=(upperBound+lowerBound)/2;
		while(lowerBound<=upperBound)
		{
			if(arr[middle] < search)
			{
				lowerBound=middle+1;
			}
			else if(arr[middle]==search)
			{
				System.out.println(search + " Found at location " +(middle+1) + " . " );
				break;
			}
			else
			{
				upperBound=middle-1;
			}
			middle=(upperBound+lowerBound)/2;
		}//close while loop
		if(lowerBound>upperBound)
		{
			System.out.println(search + " item is not found .");
		}
	}//binary method.
}
/*
Enter Array Length ?   ? 
2
14
15
Enter the search value ?  ? 
20
20 item is not found .
 */
/*
Enter Array Length ?   ? 
10
20
10
30
40
50
60
70
80
90
100
Enter the search value ?  ? 
60
60 Found at location 6 . 

*/


	

