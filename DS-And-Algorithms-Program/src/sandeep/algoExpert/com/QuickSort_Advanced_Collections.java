package sandeep.algoExpert.com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class QuickSort_Advanced_Collections
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
		int res[]=quickSort(arr);
		Arrays.sort(res);
		//Hahaha Funny Code 
		//waste time nonsense
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]  + " ");
		}
	}

	private static int[] quickSort(int[] arr)
	{
		List<Integer> left=new ArrayList<>();
		List<Integer> equal=new ArrayList<>();
		List<Integer> right=new ArrayList<>();
		
		int pivot=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<pivot)
			{
				left.add(arr[i]);
			}
			else if(arr[i]==pivot)
			{
				equal.add(arr[i]);
			}
			else if(arr[i]>pivot)
			{
				right.add(arr[i]);
			}
		}
		
		List<Integer> newList=new ArrayList<>();
		newList.addAll(left);
		newList.addAll(equal);
		newList.addAll(right);
		
		int arr1[]=new int[newList.size()];
		
		for(int i=0;i<newList.size();i++)
		{
			arr[i]=newList.get(i);
		}
		return arr;
	}
}



