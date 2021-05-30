package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_42_Cut_the_sticks 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length  ?  ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		cutthesticks(arr);
	}
	private static void cutthesticks(int[] arr) 
	{
		int tempSum=-1;
		while(tempSum!=0)
		{
			int min=Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++)
			{
				if(min>=arr[i]&&arr[i]!=0)
				{
					min=arr[i];
				}
			}
			int count=0;
			tempSum=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>=min)
				{
					arr[i]=arr[i]-min;
					count++;
				}
				tempSum=tempSum+arr[i];
			}
			System.out.println(count);
		}	
	}
}
/*
Enter Any Array Length  ?  ? 
8
1
2
3
4
3
3
2
1
8
6
4
1
*/
/*
Enter Any Array Length  ?  ? 
6
5
4
4
2
2
8
6
4
2
1
*/
/*
3
1
2
3
3
2
1
*/