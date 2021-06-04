package sandeep.leetcode.com;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Leetcode_1_Two_Sum 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Length ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Target number ? ?   ");
		int target=sc.nextInt();
		int re[]=sum(arr,target);
		for(int ii=0;ii<re.length;ii++)
		{
			System.out.println(re[ii]+ " ");
		}
	}
	private static int[] sum(int[] nums, int target)
	{
		 Map<Integer, Integer> fondset=new HashMap<>();
	        int result[]=new int[2];
	        for(int i=0;i<nums.length;i++)
	        {
	            Integer now=nums[i];
	            Integer lookingfor=target-now;
	            if(fondset.containsKey(lookingfor))
	            {
	                result[0]=fondset.get(lookingfor);
	                result[1]=i;
	                return result;
	            }
	            else
	            {
	              fondset.put(now,i);  
	            }
	        }
	        return result; 
	}
}

/*
 Enter Any Length ? 
4
2
7
11
15
Enter Target number ? ?   
9
0 
1
Enter Any Length ? 
3
3
2
4
Enter Target number ? ?   
6
1 
2  
 */













