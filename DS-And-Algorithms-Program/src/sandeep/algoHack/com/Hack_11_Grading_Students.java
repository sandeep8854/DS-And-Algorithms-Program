package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_11_Grading_Students 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?  ? ");
		int len=sc.nextInt();
		int arr1[]=new int[len];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		studentGrad(arr1);	
	}
	private static void studentGrad(int[] arr1) 
	{
		for(int i=0;i<arr1.length;i++)
		{
			int findMultiOfFive=((arr1[i]/5)+1)*5;
			if(findMultiOfFive<38)
			{
				System.out.println(arr1[i]);
				continue;
			}
			
			if(findMultiOfFive-arr1[i]<3)
				System.out.println(findMultiOfFive);
			else
				System.out.println(arr1[i]);	
		}
	}
}
/*
Enter Any Array Length ?  ? 
4
73
67
38
33
75
67
40
33
*/