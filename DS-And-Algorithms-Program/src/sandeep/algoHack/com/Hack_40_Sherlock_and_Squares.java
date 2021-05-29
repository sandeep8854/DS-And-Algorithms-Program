package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_40_Sherlock_and_Squares
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases ?    ? ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter Lower Range Boundary  ?    ? ");
			int a=sc.nextInt();
			System.out.println("Enter Upper Range Boundary ?   ?  ");
			int b=sc.nextInt();
			
			int res=sherlockSqares(a,b);
			System.out.println(res);
		}	
	}
	private static int sherlockSqares(int a, int b)
	{
		int AAA=(int)Math.sqrt(a);
		int BBB=(int)Math.sqrt(b);
		
		int result=BBB-AAA;
		if(AAA*AAA>=a)
		{
			result++;
		}
		return result;		
	}
}
/*
Enter Any Test Cases ?    ? 
1
Enter Lower Range Boundary  ?    ? 
20
Enter Upper Range Boundary ?   ?  
55
3
*/