package sandeep.projectEuler.com;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
public class ProjectEuler_29_Distinct_Powers
{
	public static void main(String[] args)
	{
/*		HashMap m=new HashMap();
	//	HashMap<BigInteger, String> m = new HashMap<BigInteger, String>();
		for (int a = 2; a <= 100; a++)
		{
			for (int b = 2; b <= 100; b++) 
			{
				m.put((new BigInteger(""+a)).pow(b),"+a+b");
			}
		}
		System.out.println(m.size());
		*/
		HashMap h=new HashMap();
		for(int a=2;a<=100;a++)
		{
			for(int b=2;b<=100;b++)
			{
				double res=Math.pow(a, b);
				h.put(res, res);
			}
		}
		System.out.println("Sequence:= " +h.size());
	}
}
