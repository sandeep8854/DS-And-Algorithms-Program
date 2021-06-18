package sandeep.projectEuler.com;
import java.math.BigInteger;
import java.util.Scanner;
public class ProjectEuler_20_Factorial_digit_sum 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ?   ? ");
		int num=sc.nextInt();
		int res=factDigitSum(num);
		System.out.println(res);
	}
	private static int factDigitSum(int num)
	{
	
		
	/*	BigInteger fact=BigInteger.ONE;
		BigInteger sum=BigInteger.ZERO;
		
		for(int i=2;i<=100;i++)
		{
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		 while(!BigInteger.ONE.equals(fact))
		 {
			// BigInteger c=BigInteger.TEN;
			 BigInteger reminder=fact.remainder(BigInteger.valueOf(10));
			 sum=reminder.add(sum);
			// BigInteger ten=BigInteger.TEN;
			fact= fact.divide(BigInteger.valueOf(10));
		 }
	System.out.println(sum);
*/		
		 int sum=0;
		 int fact=1;
	//	BigInteger fact=BigInteger.ONE;
		for(int i=2;i<=num;i++)
		{
			fact*=i;
		}
		while (fact > 0) 
		{
		    sum += (int)(fact % 10);
		    fact/= 10;
		}  
		return sum;
	}
}
/*
Enter Any Number  ?   ? 
100
93326215443944152681699238856266700490715968264381
621468592963895217599993229915608941463976156518286
253697920827223758251185210916864000000000000000000
000000
*/
/*
Enter Any Number  ?   ? 
10
27
*/