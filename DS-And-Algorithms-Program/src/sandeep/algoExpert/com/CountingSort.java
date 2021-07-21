package sandeep.algoExpert.com;
import java.util.Scanner;
public class CountingSort 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length  ?    ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res[]=counting_sort(arr);
		for(int i=0;i<res.length;i++)		
		{
			System.out.print(res[i]+ " ");
		}
	}
	private static int[] counting_sort(int[] arr)
	{
		int L=arr.length;
		//find the Maximum and Minimum value in this array;
		int max=arr[0];
		int min=arr[0];
		//array to be sorted in this array is necessary
		int aux[]=new int[arr.length];
		
		for(int i=0;i<L;i++)
		{
			if(arr[i]<min)
				min=arr[i];
			else if(arr[i]>max)
				max=arr[i];
		}
		//frequency of array
		int count[]=new int[max-min+1];
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]-min]++;
		}
		count[0]--;
		for(int i=1;i<count.length;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		
		for(int i=arr.length-1;i>=0;i--)
		{
			aux[count[arr[i]-min]--]=arr[i];
		}
		return aux;
	}
}


/*
Enter Array Length  ?    ? 
7
1
4
1
2
7
5
2
1 1 2 2 4 5 7 
Enter Array Length  ?    ? 
10
9
6
6
3
2
0
4
2
9
3
0 2 2 3 3 4 6 6 9 9 
*/