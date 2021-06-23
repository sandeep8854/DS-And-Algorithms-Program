package sandeep.leetcode.com;
import java.util.Scanner;
public class Leetcode_121_Best_Time_to_Buy_and_Sell_Stock 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Lenght ? ?   ");
		int leen=sc.nextInt();
		int arr[]=new int[leen];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res=bestTimeToBuy(arr);
		System.out.println(res);
	}
	/*
	Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
	 */
	//Input: prices = [7,6,4,3,1]
	//		Output: 0
	//		Explanation: In this case, no transactions are done and the max profit = 0.
	private static int bestTimeToBuy(int[] arr)
	{
		if(arr.length==0)
			return 0;
		int min_prize=arr[0];
		int max_Income=0;
		for(int i=0;i<arr.length;i++)
		{
			max_Income=Math.max(max_Income, arr[i]-min_prize);
			min_prize=Math.min(min_prize, arr[i]);
		}
		return max_Income;
	}

}
/*
Enter Any Array Lenght ? ?   
5
7
6
4
3
1
0


Enter Any Array Lenght ? ?   
6
7
1
5
3
6
4
5

*/