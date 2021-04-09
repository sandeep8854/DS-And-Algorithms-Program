package sandeep.algoHack.com;
import java.util.Scanner;
public class RecusiveDigitSum 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N and K value ?  ? ");
		String n=sc.next();
		int k=sc.nextInt();
		
		int result=superDigit(n,k);
		System.out.println(result);	
	}
	private static int superDigit(String n, int k)
	{
		int sum=0;
		
		
		for(int i=0;i<n.length();i++)
		{
			sum=sum+(n.charAt(i)-'0');
			if(sum>9)
			{
				sum=sum-9;
			}
		}
		sum=sum*k;
		sum=sum%9;
		if(sum==9)
		{
			return 9;
		}
		if(sum==0)
		{
			return 9;
		}
		return sum;
	}
}
/*
 Enter N and K value ?  ? 
123
3
9
 */
