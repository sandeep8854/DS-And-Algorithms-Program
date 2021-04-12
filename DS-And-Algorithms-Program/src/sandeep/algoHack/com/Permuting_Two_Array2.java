package sandeep.algoHack.com;
import java.util.Arrays;
import java.util.Scanner;
public class Permuting_Two_Array2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases ?  ? ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter first Array LEngth ??   ? ");
			int len=sc.nextInt();
			int arr1[]=new int[len];
			for(int ii=0;ii<arr1.length;ii++)
			{
				arr1[ii]=sc.nextInt();
			}
			System.out.println("Enter Second Array Length ?  ?  ");
			int len2=sc.nextInt();
			int arr2[]=new int[len2];
			for(int iii=0;iii<arr1.length;iii++)
			{
				arr2[iii]=sc.nextInt();
			}
			System.out.println("Enter K Value ? ? ");
			int k=sc.nextInt();
			permuting(arr1,arr2,k);
		}
	}
	private static void permuting(int[] arr1, int[] arr2, int k) 
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		 for (int i = 0, j = arr1.length - 1; i < arr1.length; i++, j--)
	            if (arr2[i] + arr1[j] < k)
	            	System.out.println("NO");
		 System.out.println("YES");	
		
		
		
		
		
		
	}
	

}
