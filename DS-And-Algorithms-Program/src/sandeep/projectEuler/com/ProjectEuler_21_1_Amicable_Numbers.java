package sandeep.projectEuler.com;
import java.util.Scanner;
public class ProjectEuler_21_1_Amicable_Numbers 
{
	public static void main(String[] args) 
	{
		int a=10000;
		int b=sumofProperDivisor(a);
		
		//Incomplete
		//i will write after some time...
		//
		
	}

	private static int sumofProperDivisor(int num)
	{
		int sum=1;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		return sum;	
	}
}
