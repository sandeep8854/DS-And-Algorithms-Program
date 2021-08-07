package sandeep.algoExpert.com;
import java.util.Scanner;
public class MoveZero
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
		int res[]=moveZero(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}		
	}
	private static int[] moveZero(int[] arr)
	{
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0 && arr[j]==0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0) {
				j++;
			}		
		}
		return arr;
	}
}

/*
Enter Any Array Length ?   ?  
7
8
1
0
2
1
0
3
8 1 2 1 3 0 0 
*/