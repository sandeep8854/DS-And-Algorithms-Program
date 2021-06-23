package sandeep.leetcode.com;
import java.util.Scanner;
public class Leetcode_66_Plus_One
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases  ?   ?   ");
    	int t=sc.nextInt();
		for(int ii=0;ii<t;ii++)
		{
		System.out.println("Enter Any Array Length ? ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res[]=plus(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i] + " ");
		}
		}
	}

	private static int[] plus(int[] arr)
	{
		int L=arr.length;
		while(L-1>=0)
		{
			if(arr[L-1]!=9)
			{
				arr[L-1]=arr[L-1]+1;
				return arr;
			}
			else
			{
				arr[L-1]=0;
			}
			L--;
		}
		int res[]=new int[arr.length+1];
		res[0]=1;
		for(int i=0;i<L;i++)
		{
			res[i+1]=arr[i];
		}
		
		return res;
	}

}

/*
Enter Any Test Cases  ?   ?   
2
Enter Any Array Length ? ?  
4
1
2
3
4
1 
2 
3 
5 
Enter Any Array Length ? ?  
4
4
3
2
1
4 
3 
2 
2 
 */


