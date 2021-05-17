package sandeep.algoHack.com;
import java.util.Scanner;
import java.util.TreeSet;
public class Hack_21_Sales_By_Match
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Lenght  ?  ?  ");
		int len=sc.nextInt();
		int arr1[]=new int[len];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int result=salesbymatch(arr1);
		System.out.println(result);
	}
	private static int salesbymatch(int[] ar)
	{
		 TreeSet<Integer> set = new TreeSet<Integer>();
	        int count = 0;
	        for (int i = 0; i < ar.length; i++)
	         {
	            if (set.contains(ar[i]))
	             {
	                count++;
	                set.remove(ar[i]);
	            } 
	            else
	             {
	                set.add(ar[i]);
	            }
	        }
	        return count;
	}
}
/*
Enter Any Array Lenght  ?  ?  
9
10
20
20
10
10
30
50
10
20
3
*/

