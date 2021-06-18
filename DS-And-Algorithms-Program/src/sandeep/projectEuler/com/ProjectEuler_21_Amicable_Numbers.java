//Together, 220and 284 make up the smallest pair of amicable numbers. The proper
//divisors of 220 are 1,2,4,5.10,11,20,22,44,55 and 110.
//These proper divisors add up to 284.
 //Similarly, the proper divisors of 284="1,2,4,71,142 which is sum of 220"
//called Amicable or friendly Number

package sandeep.projectEuler.com;
import java.util.Scanner;
public class ProjectEuler_21_Amicable_Numbers
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases ?   ? ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		System.out.println("Enter A Number");
		int a=sc.nextInt();
		System.out.println("ENter B Number ?  ? ");
		int b=sc.nextInt();
		boolean res=amicableNumber(a,b);
		if(res==true)
			System.out.println("Amicable Number");
		else
			System.out.println("Not A Amicable Number ");
		}
	}
	private static boolean amicableNumber(int a, int b)
	{
		int divisor=0;
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
				divisor+=i;
		}
		if(divisor==b)
			return true;
		else
			return false;
	}
}
/*
Enter Any Test Cases ?   ? 
6
Enter A Number
220
ENter B Number ?  ? 
284
Amicable Number
Enter A Number
1184
ENter B Number ?  ? 
1210
Amicable Number
Enter A Number
2620
ENter B Number ?  ? 
2924
Amicable Number
Enter A Number
5024
ENter B Number ?  ? 
5564
Not A Amicable Number 
Enter A Number
6232
ENter B Number ?  ? 
6368
Amicable Number
Enter A Number
11744
ENter B Number ?  ? 
10856
Not A Amicable Number 
*/