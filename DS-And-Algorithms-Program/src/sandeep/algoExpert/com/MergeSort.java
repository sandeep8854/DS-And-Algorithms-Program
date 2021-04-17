package sandeep.algoExpert.com;
import java.util.Scanner;
public class MergeSort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Array Length ?   ?   ");
		int len=sc.nextInt();
		int arr1[]=new int[len];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter Second Array Length ?  ?  ");
		int len2=sc.nextInt();
		int arr2[]=new int[len2];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int result[]=mergingTwoArray(arr1,arr2);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i] + " ");
		}
	}
	private static int[] mergingTwoArray(int[] arr1, int[] arr2) 
	{
		int n1=arr1.length;
		int n2=arr2.length;
		int arr3[]=new int[n1+n2];
		int aDex=0,bDex=0,cDex=0;
		while( aDex < n1 && bDex < n2 )
		{
			if(arr1[aDex] < arr2[bDex])
			{
			     arr3[cDex++] = arr1[aDex++];
			}else
			{
			    arr3[cDex++] = arr2[bDex++];
			}
		}
		while( aDex < n1 )
		{
			arr3[cDex++] = arr1[aDex++];
		}
		
		while( bDex < n2 )
		{
			arr3[cDex++]=arr2[bDex++];
		}
		return arr3;
	}
}
/*
Enter First Array Length ?   ?   
4
23
47
81
95
Enter Second Array Length ?  ?  
6
7
14
39
55
62
74
7 14 23 39 47 55 62 74 81 95 
*/
/*
Enter First Array Length ?   ?   
3
2
4
6
Enter Second Array Length ?  ?  
3
1
3
5
1 2 3 4 5 6 
*/