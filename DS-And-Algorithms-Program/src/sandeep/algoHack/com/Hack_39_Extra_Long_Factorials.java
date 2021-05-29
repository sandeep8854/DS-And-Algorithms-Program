package sandeep.algoHack.com;
import java.math.BigInteger;
import java.util.Scanner;
public class Hack_39_Extra_Long_Factorials
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?   ? ");
		int n=sc.nextInt();
		BigInteger res=extraFactorial(n);
		System.out.println(res);
	}
	private static BigInteger extraFactorial(int num) 
	{
	/*	int fact=1;
		while(num>1)
		{
			fact=fact*num;
			num--;
		}
		return fact;
		*/
		 // Initialize result
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
  
        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= num; i++)
        {
        	 f=f.multiply(BigInteger.valueOf(i));
           // f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
	}
}
/*
Enter Any Number ?   ? 
20
2432902008176640000
*/

/*
Enter Any Number ?   ? 
25
15511210043330985984000000
*/

/*
Enter Any Number ?   ? 
30
265252859812191058636308480000000
*/

/*
Enter Any Number ?   ? 
50
30414093201713378043612608166064768844377641568960512000000000000
*/

/*
100
93326215443944152681699238856266700490715968264381621468592963895217599993229915
608941463976156518286253697920827223758251185210916864000000000000000000000000
*/