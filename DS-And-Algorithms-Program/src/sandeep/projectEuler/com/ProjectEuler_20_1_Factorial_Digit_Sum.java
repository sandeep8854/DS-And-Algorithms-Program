package sandeep.projectEuler.com;
import java.math.BigInteger;
public class ProjectEuler_20_1_Factorial_Digit_Sum
{
	public static void main(String[] args)
	{
		BigInteger c=BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;
        BigInteger zero = BigInteger.ZERO;

        for (int i=1;i<100;i++)
         {
             result =result.multiply(BigInteger.valueOf(i));
         }
        System.out.println("Factorial of 100!=:" + result);

         while (result != BigInteger.ZERO)
         {
                 BigInteger b=result.mod(BigInteger.valueOf(10));
                 c=c.add(b);
                 result=result.divide(BigInteger.valueOf(10));

         }
        System.out.println("Fatorial Of Sum 100!=: " +c);
	}
}
/*
Factorial of 100! =:93326215443944152681699238856266700490715968264381621
4685929638952175999932299156089414639761565182862536979208272237582511852
109168640000000000000000000000
Factorial Of Sum 100!=: 648
*/