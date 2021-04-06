package sandeep.algoExpert.com;
import java.util.Scanner;
public class Sorting_Ascending_Selection_1 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length ?  ? ");
		int len=sc.nextInt();
		int sandeepArray[]=new int[len];
		
		for(int i=0;i<sandeepArray.length;i++)
		{
			sandeepArray[i]=sc.nextInt();
		}
		int result[]=sorting(sandeepArray);	
		for(int i=0;i<sandeepArray.length;i++)
		{
			System.out.println(result[i]);		
		}
	}
	private static int[] sorting(int[] sandeepArray)
	{
		int n=sandeepArray.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(sandeepArray[j]<sandeepArray[min])
				{
					min=j;
				}
			}
			int temp=sandeepArray[i];
			sandeepArray[i]=sandeepArray[min];
			sandeepArray[min]=temp;
		}	
         	return sandeepArray;
	}
}
/*
Enter Array Length ?  ? 
4
1
3
5
2
1
2
3
5
 */
