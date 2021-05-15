package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_15_Breaking_The_Record 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?  ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result[]=breakingRecord(arr);	
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+ " ");
		}
		
	}
	private static int[] breakingRecord(int[] score)
	{
		int result[]=new int[2];
		int maxCount=0;
		int minCount=0;
		int max=score[0];
		int min=score[0];
		
		for(int i=0;i<score.length;i++)
		{
			if(score[i]>max)
			{
				max=score[i];
				maxCount++;
			}
			if(score[i]<min)
			{
				min=score[i];
				minCount++;
			}	
		}
		result[0]=maxCount;
		result[1]=minCount;
		return result;
	}
}

/*
Enter Any Array Length ?  ? 
10
3
4
21
36
10
28
35
5
24
42
4 0
*/
/*
Enter Any Array Length ?  ? 
9
10
5
20
20
4
5
2
25
1
2 4
*/