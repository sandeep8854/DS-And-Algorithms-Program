package sandeep.algoExpert.com;
import java.util.Scanner;
public class BinaryRecursive_3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length ?  ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Any Search Value ? ?    ");
		int search=sc.nextInt();
		boolean res=recBinary(arr,search);
		if(res==true)
			
			System.out.println(search + " item found \nCongratulation!!");
		else
			System.out.println(search + " Not Found Please Choose Correct Value..\nYour Bad Luck");	
	}
	private static boolean recBinary(int[] arr, int search)
	{
		int lowerBound=0;
		int upperBound=arr.length-1;
		return binaryRecursiveSearch(arr,search,lowerBound,upperBound);
	}
	private static boolean binaryRecursiveSearch(int[] arr, int search, int lowerBound, int upperBound) 
	{
		int middle=(lowerBound+upperBound)/2;
		if(arr[middle]==search)
			return true;
		else if(lowerBound>upperBound)
		{
			return false;
		}
			
		else
		{
			if(arr[middle]< search)
				return binaryRecursiveSearch(arr,search,middle+1,upperBound);
			else
				return binaryRecursiveSearch(arr,search,lowerBound,middle-1);
		}	
	}
}
/*
Enter Array Length ?  ? 
5
10
20
30
40
50
Enter Any Search Value ? ?    
60
60 Not Found Please Choose Correct Value..
Your Bad Luck
*/
/*
 Enter Array Length ?  ? 
6
1
2
3
4
5
6
Enter Any Search Value ? ?    
5
5 item found 
Congratulation!!
 */
