package sandeep.leetcode.com;

import java.util.Scanner;

public class Leetcode_204_Count_Primes 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ?  ? ");
		int number=sc.nextInt();
		int res=primeCount(number);
		System.out.println(res);
	}
	private static int primeCount(int number)
	{
		boolean[] prime=new boolean[number];
		for(int i=0;i<number;i++)
		{
			prime[i]=true;
		}
		
		for(int i=2;i*i<number;i++)
		{
			if(!prime[i])
				continue;
			for(int j=i*i;j<number;j=j+i)
			{
				prime[j]=false;
				
			}
		}
		int count=0;
		for(int i=2;i<number;i++)
		{
			if(prime[i])
				count++;
		}
		return count;
	}
}

/*
Enter Any Number  ?  ? 
10
4
*/