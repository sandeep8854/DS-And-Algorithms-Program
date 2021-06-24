package sandeep.leetcode.com;

import java.util.Scanner;

public class Leetcode_122_Best_Time_to_Buy_and_Sell_Stock_II 
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
		private static int bestTimeToBuy(int[] arr) 
		{
			 int benefit = 0;
		        for(int i=1; i<arr.length; i++)
		        {
		            if(arr[i]>arr[i-1])
		            {
		                benefit += arr[i]-arr[i-1];
		            }
		        }
		        return benefit;
		}
}
/*
Enter Any Array Lenght ? ?   
6
7
1
5
3
6
4
7
*/
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
5
1
2
3
4
5
4


 */
