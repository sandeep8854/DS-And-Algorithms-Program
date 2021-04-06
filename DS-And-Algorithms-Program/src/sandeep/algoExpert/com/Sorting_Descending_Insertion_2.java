package sandeep.algoExpert.com;

import java.util.Scanner;

public class Sorting_Descending_Insertion_2
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
		int result[]=sortingInsertionDescending(sandeepArray);	
		for(int i=0;i<sandeepArray.length;i++)
		{
			System.out.print(result[i] + " ");		
		}		
}

	private static int[] sortingInsertionDescending(int[] sandeepArray)
	{
		int n=sandeepArray.length;
		 for (int i = 1; i < n; i++)
		 {
		      int Temporary = sandeepArray[i];
		      int j = i ;
		      while (j>0 && sandeepArray[j-1]<=Temporary) 
		      {
		        sandeepArray[j]=sandeepArray[j-1];
		        --j;
		      }
		      sandeepArray[j] = Temporary;
		    }
		
		return sandeepArray;
	}
	
}
/*
Enter Array Length ?  ? 
4
2
3
0
1
3 2 1 0 
*/
