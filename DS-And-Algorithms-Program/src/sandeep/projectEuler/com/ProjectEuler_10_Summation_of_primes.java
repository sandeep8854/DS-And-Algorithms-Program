package sandeep.projectEuler.com;
import java.util.Scanner;
public class ProjectEuler_10_Summation_of_primes 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number Find the sum of all the primes   ?   ?");
		int number=sc.nextInt();
		smmationPrime(number);
	}
	private static void smmationPrime(int num)
	{
		int sum=0;
		boolean summationPrime[]=new boolean[num];
		for(int i=0;i<num;i++)
		{
			summationPrime[i]=true;
		}
		
		for(int p=2;p<=Math.sqrt(num);p++)
		{
			if(summationPrime[p])
			{
				for(int j=p;j*p<num;j++)
					summationPrime[j*p]=false;
			}
		}
		for(int i=2;i<num;i++)
		{
			if(summationPrime[i])
			sum=sum+i;
		}
	   System.out.println(sum);
	}

}
//ANSWER 1st;
//Enter Any Number Find the sum of all the primes   ?   ?
//10
//17

//

/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/