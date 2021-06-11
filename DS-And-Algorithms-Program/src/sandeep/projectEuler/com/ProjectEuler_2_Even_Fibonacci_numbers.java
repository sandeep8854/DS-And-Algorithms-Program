package sandeep.projectEuler.com;
import java.util.Scanner;
public class ProjectEuler_2_Even_Fibonacci_numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number For finding even sum fibonacci number ?  ?  ");
		int num=sc.nextInt();
		int res=evenFibon(num);
		System.out.println(res);
	}
	private static int evenFibon(int num) 
	{
		if(num<2)
			return 0;
		long fib1=0;
		long fib2=2;
		long sum=fib1+fib2;
		while(fib2<=num)
		{
			long fib3=4*fib2+fib1;
			if(fib3>num)
				break;
			
			fib1=fib2;
			fib2=fib3;
			sum+=fib2;
		}
		return (int)sum;
	}
}
/*
Enter Any Number For finding even sum fibonacci number ?  ?  
4000000
4613732
Enter Any Number For finding even sum fibonacci number ?  ?  
8
10s
*/