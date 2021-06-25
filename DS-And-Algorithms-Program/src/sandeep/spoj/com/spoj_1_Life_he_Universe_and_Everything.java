package sandeep.spoj.com;
import java.util.Scanner;
public class spoj_1_Life_he_Universe_and_Everything 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length  ?  ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Any Number Which you want to stop ?   ? ");
		int target=sc.nextInt();
		univer(arr,target);
		
	}
	private static void univer(int[] arr, int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				break;
			}
			System.out.println(arr[i]+  " ");	
		}
	}
}
/*
Enter Any Array Length  ?  ?  
5
1
2
88
42
99
Enter Any Number Which you want to stop ?   ? 
42
1 
2 
88 
*/