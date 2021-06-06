package sandeep.algoHack.com;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hack_49_Beautiful_Triplet
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?  ?  ");
		int L=sc.nextInt();
		int arr[]=new int[L];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter D value   ?  ? ");
		int d=sc.nextInt();
		int res=beautiful(arr,d);
		System.out.println(res);
	}

	private static int beautiful(int[] arr, int d) 
	{
		int count=0;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]-arr[i]==d)
				{
					for(int k=j+1;k<n;k++)
					{
						if(arr[k]-arr[j]==d)
						{
							count++;
							break;
						}
					}
					
				}
			}
				
		}
		return count;
	/*	int result=0;
		Set<Integer> setveri=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			setveri.add(arr[i]);
		}
		
		for(int j=0;j<arr.length-2;j++)
		{
			if(setveri.contains(arr[j]+d)&&setveri.contains(arr[j]+2*d))
			{
				result++;
			}
		}
		return result;	
		*/
	}
}

/*
Enter Any Array Length ?  ?  
5
2
2
3
4
5
Enter D value   ?  ? 
1
3
*/

/*
 Enter Any Array Length ?  ?  
7
1
2
4
5
7
8
10
Enter D value   ?  ? 
3
3
*/

