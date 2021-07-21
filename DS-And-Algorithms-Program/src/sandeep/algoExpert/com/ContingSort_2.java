package sandeep.algoExpert.com;
import java.util.Scanner;
public class ContingSort_2
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
		int res[]=counting_Sort(arr);
		for(int i=0;i<res.length;i++)		
		{
			System.out.print(res[i]+ " ");
		}
	}
	private static int[] counting_Sort(int[] arr) 
	{
		int output[]=new int[arr.length];
		int L=arr.length;
		//Find Maximum And Minimum
		int max=arr[0];
		int min=arr[0];
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
			else if(arr[i]>max)
				max=arr[i];
		}
		//Frequency Count
		int count[]=new int[max-min+1];
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]-min]++;
		}
		//Modification of count Frequency array
		for(int i=1;i<arr.length;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		
		for(int i=arr.length-1;i>=0;i--)
		{
			output[count[arr[i]-min]-1]=arr[i];
			count[arr[i]-min]--;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=output[i];
		}
		return arr;
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
*/