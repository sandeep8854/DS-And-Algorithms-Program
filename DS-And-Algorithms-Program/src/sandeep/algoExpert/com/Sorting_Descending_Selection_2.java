package sandeep.algoExpert.com;
import java.util.Scanner;
public class Sorting_Descending_Selection_2 {
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
		int result[]=sortingDescending(sandeepArray);	
		for(int i=0;i<sandeepArray.length;i++)
		{
			System.out.print(result[i] +" ");		
		}	
	}
	private static int[] sortingDescending(int[] sandeepArray) 
	{
		int n=sandeepArray.length;
		for(int i=0;i<n-1;i++)
		{
			int max=i;
			for(int j=i+1;j<n;j++)
			{
				if(sandeepArray[j]>sandeepArray[max])
				{
					max=j;
				}
			}
			int temp=sandeepArray[i];
			sandeepArray[i]=sandeepArray[max];
			sandeepArray[max]=temp;
		}	
         	return sandeepArray;
	}
}
/*
Enter Array Length ?  ? 
5
1
2
3
4
6
6 4 3 2 1 
*/
