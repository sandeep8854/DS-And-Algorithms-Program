package sandeep.projectEuler.com;
import java.util.Scanner;
//Using Sieve Of Eratosthenes Algorithm...
public class ProjectEuler_7_10001st_Prime 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find all prime Number ?   ?  ");
		int n=sc.nextInt();
	    NthPrime(n);
	    
	}

	private static void NthPrime(int n)
	{
		int count=0;
		boolean prime[]=new boolean[n+1];
		
		/*
		Generally all number from  2 to n
		add initially marked every number as prime
		 */
		for(int i=2;i<=n;i++)
		{
			prime[i]=true;
		}
		/*
		 Run a loop from 2 to square root of n	
		 */
		for(int p=2;p<=Math.sqrt(n);p++)
		{
			if(prime[p])
			{
				for(int j=p;j*p<=n;j++)
					prime[j*p]=false;
			}
		}
		/*
		 Run a loop from 2 to n and print prime number 
		 */
		for(int i=2;i<=n;i++)
		{
			if(prime[i])
				System.out.print(i+ " ");
		}
	}
}
/*
Enter a number to find prime Number ?   ?  
100
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
*/
