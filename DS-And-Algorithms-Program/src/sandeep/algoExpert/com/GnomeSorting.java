package sandeep.algoExpert.com;
import java.util.Scanner;
public class GnomeSorting
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
		int res[]=gnomeSort(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}
	}
	private static int[] gnomeSort(int[] arr)
	{
		int L=arr.length;
		int index=0;
		while( index < L )
		{
			if(index==0 || arr[index]>=arr[index-1])
				index++;
			else
			{
				int temp=0;
			    temp=arr[index];
				arr[index]=arr[index-1];
				arr[index-1]=temp;
				index--;
			}	
		}
		return arr;
	}
}

/*
 
 Gnome sort (dubbed stupid sort) is a sorting algorithm originally proposed by Iranian computer
  scientist Hamid Sarbazi-Azad (professor of Computer Science and Engineering at Sharif University of Technology)[1] in 2000. 
  The sort was first called stupid sort[2] (not to be confused with bogosort), 
 and then later described by Dick Grune and named gnome sort.[3]

The gnome sort is a sorting algorithm which is similar to insertion sort in that
 it works with one item at a time but gets the item to the proper place by a series of swaps,
  similar to a bubble sort. It is conceptually simple, requiring no nested loops. 
  The average running time is O(n2) but tends towards O(n) if the list is initially almost sorted.
*/