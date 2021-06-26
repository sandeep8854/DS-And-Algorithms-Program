package sandeep.leetcode.com;
import java.util.Scanner;
public class Leetcode_169_Majority_Element
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any TestCases   ? ? ?    ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		System.out.println("Enter Any Array Length  ?  ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int ii=0;ii<arr.length;ii++)
		{
			arr[ii]=sc.nextInt();
		}
	    int res=majority(arr);
	    System.out.println(res);
		}
	}
	private static int majority(int[] arr)
	{
		int temp;
		int n=arr.length;
		int maxCount=0;
		int index=-1;
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
			if(count>maxCount)
			{
				maxCount=count;
				index=i;
			}
		}
		 temp=arr[index];
		return temp;
	/*	if(maxCount>n/2)
			System.out.println(arr[index]);
		else
			System.out.println("No Majerity element ");
			*/
//		return arr[index];
	}
}
/*
Enter Any TestCases   ? ? ?    
3
Enter Any Array Length  ?  ?  
3
3
2
3
3
Enter Any Array Length  ?  ?  
7
2
2
1
1
1
2
2
2
Enter Any Array Length  ?  ?  
5
5
5
5
2
2
5
*/