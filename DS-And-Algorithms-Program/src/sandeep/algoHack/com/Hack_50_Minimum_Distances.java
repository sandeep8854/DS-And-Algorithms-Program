package sandeep.algoHack.com;
import java.util.HashMap;
import java.util.Scanner;
public class Hack_50_Minimum_Distances 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Length ?  ? ");
		int L=sc.nextInt();
		int arr[]=new int[L];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int re=minimumDistance(arr);
		System.out.println(re);
	}
	private static int minimumDistance(int[] arr)
	{
		int n=arr.length;
		HashMap<Integer,Integer> hmap=new HashMap<>();
		int minDis=Integer.MAX_VALUE;
		int preIndex=0;
		int currentIndex=0;
		for(int i=0;i<n;i++)
		{
			if(hmap.containsKey(arr[i]))
			{
				currentIndex=i;
				preIndex=hmap.get(arr[i]);
				minDis=Math.min((currentIndex-preIndex),minDis);
			}
			hmap.put(arr[i],i);
		}
		if(minDis==Integer.MAX_VALUE)
		{
			return -1;
		}
		return minDis;	
	}
}
/*
Enter Any Length ?  ? 
5
3
2
1
2
3
2
*/

/*
Enter Any Length ?  ? 
6
7
1
3
4
1
7
3
*/