package sandeep.algoExpert.com;
import java.util.Scanner;
public class CocktailSorting
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
		int res[]=cocktailBirectionalShakerSort(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}
	}
	private static int[] cocktailBirectionalShakerSort(int[] arr)
	{
		int L=arr.length;
		boolean swapped=true;
		int start=0;
		int end=arr.length;
		
		while(swapped==true)
		{
			swapped=false;
			for(int i=start;i<end-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					swapped=true;
				}
			}
			if(swapped==false)
				break;
			swapped=false;
			end=end-1;
			
			for(int i=end-1;i>=start;i--)
			{
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					swapped=true;
				}
			}
			start=start+1;
		}
		return arr;
	}
}

/*
 Enter Any Array Length ?   ?  
4
5
3
2
4
2 3 4 5 
 */