package sandeep.projectEuler.com;
import java.util.Scanner;
public class ProjectEuler_5_Smallest_multiple 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?  ? ");
		long num=sc.nextInt();
	    long res=smallest(num);
	    System.out.println(res);	
	}
	private static long smallest(long num)
	{
		long answer = 1;   
	    for (long i = 1; i <= num; i++)
	        answer = (answer * i)/(gcd(answer, i));
	    return answer;		
	}
	private static long gcd(long a, long b) 
	{
		if(a%b != 0)
		      return gcd(b,a%b);
		   else
		      return b;
	}
}

/*
Enter Any Number ?  ? 
20
232792560
*/