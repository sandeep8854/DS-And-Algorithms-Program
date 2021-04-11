package sandeep.algoHack.com;
import java.util.Arrays;
import java.util.Scanner;
public class Max_Min
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length ?  ? ");
		int length=sc.nextInt();
		System.out.println("Enter K Value For finding unfairness equal ?  ?  ");
		int k=sc.nextInt();
		System.out.println("Enter " + length + " Length Array ?  ?");
		int arrSandeep[]=new int[length];
		for(int i=0;i<arrSandeep.length;i++)
		{
			arrSandeep[i]=sc.nextInt();
		}
	int result=	maxminfairness(arrSandeep,k);	
	System.out.println(result);	
	}
	private static int maxminfairness(int[] arr, int k)
	{
		Arrays.sort(arr);
		int min=Integer.MAX_VALUE;
		for(int i=0;i+(k-1)<arr.length;i++)
		{
			int difference=Math.abs(arr[i]-arr[i+k-1]);
			if(difference<min)
			{
				min=difference;
			}
		}
		return min;	
	}
}

/*
Enter Array Length ?  ? 
10
Enter K Value For finding unfairness equal ?  ?  
4
Enter 10 Length Array ?  ?
1
2
3
4
10
20
30
40
100
200
3
 */
