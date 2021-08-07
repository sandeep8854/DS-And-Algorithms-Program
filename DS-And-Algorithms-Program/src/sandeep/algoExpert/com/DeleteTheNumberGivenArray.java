package sandeep.algoExpert.com;
import java.util.Scanner;
public class DeleteTheNumberGivenArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?   ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Any Number ,Which You Want to Delete  ?    ? ");
		int num=sc.nextInt();
		int res[]=deleteOper(arr,num);
		for(int i=0;i<res.length-1;i++)
		{
			System.out.print(res[i] + " ");
		}
	}
	private static int[] deleteOper(int[] arr, int num)
	{
		int len=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				for(int j=i;j<arr.length-1;j++)
				{
					arr[j]=arr[j+1];
				}
				break;
			}	
		}
		return arr;
	}
}

/*
Enter Any Array Length ?   ? 
5
10
20
60
40
20
Enter Any Number ,Which You Want to Delete  ?    ? 
40
10 20 60 20 
*/