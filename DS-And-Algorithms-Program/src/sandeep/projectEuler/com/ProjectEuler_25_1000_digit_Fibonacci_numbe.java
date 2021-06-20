package sandeep.projectEuler.com;
import java.math.BigInteger;
public class ProjectEuler_25_1000_digit_Fibonacci_numbe 
{
	public static void main(String[] args)
	{
		int i=0;
		int count=0;
		BigInteger b1;
		b1=new BigInteger("10");
		int exponent=999;
		BigInteger limit=b1.pow(exponent);
	BigInteger fib[]=new BigInteger[3];
		fib[0]=BigInteger.ONE;
		fib[1]=BigInteger.ONE;
	//	while(BigInteger )
		{
			i=(i+1)%3;
			count++;
		//	fib[i]=fib[(i+1)%3]+fib[(i+2)%3];
			fib[i]=fib[(i+1)%3].add(fib[(i+2)%3]);	
		}
		System.out.println(count);
	}

}
