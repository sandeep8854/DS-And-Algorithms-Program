package sandeep.projectEuler.com;

import java.util.Scanner;

public class ProjectEuler_Largest_Prime_Factor 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any NUmber ?? ? ");
		long num=sc.nextLong();
		long res=larPriFac(num);
		System.out.println(res);
	}

	private static long larPriFac(long num)
	{
		long maxPrime=-1;
		
		while((num%2)==0)
		{
			maxPrime=2;
			num=num/2;
			//num >>= 1;
		}
		
		 // n must be odd at this point,
	    // thus skip the even numbers 
	    // and iterate only for odd
	    // integers
		for(int i=3;i<Math.sqrt(num);i=i+2)
		{
			while(num%i==0)
			{
				maxPrime=i;
				num=num/i;
			}
		}
		
		// This condition is to handle 
	    // the case when n is a prime 
	    // number greater than 2
	    if (num > 2)
	        maxPrime=num;
	  
		return maxPrime;
	}
}
/*
Enter Any NUmber ?? ? 
600851475143 
6857
*/