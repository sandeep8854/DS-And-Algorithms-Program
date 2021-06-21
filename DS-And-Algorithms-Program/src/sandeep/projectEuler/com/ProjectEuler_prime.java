package sandeep.projectEuler.com;

import java.util.Scanner;

public class ProjectEuler_prime
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any NUmber ?  ?  ");
		int number=sc.nextInt();
		boolean res=prime(number);
		if(res==true)
			System.out.println(" It is prime .");
		else
			System.out.println( " Not a prime. ");
		
	}

	private static boolean prime(int number)
	{
		int divisibleCount=1;
		int i=1;
		while(number/2>=i)
		{
			if(number%i==0)
			{
				divisibleCount++;
			}
			i++;
		}
		if(divisibleCount==2)
			return true;
		else
			return false;
	}

}
