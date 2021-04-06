package sandeep.algoExpert.com;

import java.util.Scanner;

public class Sorting_Ascending_Bubble_1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length ?  ? ");
		int len=sc.nextInt();
		int sandeepArray[]=new int[len];
		
		for(int i=0;i<sandeepArray.length;i++)
		{
			sandeepArray[i]=sc.nextInt();
		}
		int result[]=sortingBubble(sandeepArray);	
		for(int i=0;i<sandeepArray.length;i++)
		{
			System.out.print(result[i] + " ");		
		}	
	}
	private static int[] sortingBubble(int[] sandeepArray) 
	{
		int n=sandeepArray.length;
		for(int i=0;i<n-1;i++)
		{
			 for (int j=0;j<n-i-1;j++) 
			 {
				 if(sandeepArray[j]>sandeepArray[j+1])
				 {
					   int  temp = sandeepArray[j];
			           sandeepArray[j] = sandeepArray[j+1];
			           sandeepArray[j+1] = temp;
				 }		 
			 }
		}
		return sandeepArray;
	}
}
/*
Enter Array Length ?  ? 
5
5
3
7
2
1
1 2 3 5 7 
*/

