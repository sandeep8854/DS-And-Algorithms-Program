package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_18_Migratory_Birds 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length ?  ? ");
		int len=sc.nextInt();
		int arr1[]=new int[len];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int res=migratoryBirds(arr1);
		System.out.println(res);
	}
	private static int migratoryBirds(int[] A)
	{
		        int n=A.length;
		        int max_freq = 0;
			    int ans = -1;
			    for (int i = 0;i< n-1;i++)
			    {
			        int curr_freq = 1;
			        for (int j = i+1 ;j< n-1;j++)
			            if (A[j] == A[i])
			                curr_freq++; 
			        
			        if (max_freq < curr_freq)
			        {
			            max_freq = curr_freq;
			            ans = A[i];
			        }
			       else if (max_freq == curr_freq)
			            ans = Math.min(ans, A[i]);
			    }
			   return ans;	
	}
}
/*
Enter Array Length ?  ? 
11
1
2
3
4
5
4
3
2
1
3
4
3
*/