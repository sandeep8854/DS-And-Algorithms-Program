package sandeep.leetcode.com;
import java.util.Scanner;
public class Leetcode_27_Remove_Element
{
	//Note for previous := Question number 26 is remove duplicate and after removing the element which are remaining the count the value 
	//and print the number of element;
	//Like as arr[1,1,4,4,6,6,7] 
	//remove the element 1,4 and 6.  
	//after removing the element the count the unique which are not repeated
	//and print the unique element....
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
		System.out.println("Enter Any Value Which you want to Remove ?  ?  ?   ? ");
		int val=sc.nextInt();
		int res=removeValue(arr,val);
		System.out.println(res);
	}
	private static int removeValue(int[] arr, int val)
	{
		int n=arr.length;
		int count=0;
		int i=0;
		int temp;
		
		while(i<=n-count-1)
		{
			if(arr[i]==val)
			{
				temp=arr[i];
				arr[i]=arr[n-count-1];
				arr[n-count-1]=temp;
				count++;
			}
			if(arr[i]!=val)
				i++;
		}
		return n-count;	
	}
}

/*
Enter Any Array Length ?   ?  
8
0
1
2
2
3
0
4
2
Enter Any Value Which you want to Remove ?  ?  ?   ? 
2
5
*/




















