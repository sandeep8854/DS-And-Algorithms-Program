package sandeep.projectEuler.com;
import java.util.Scanner;
public class ProjectEuler_16_Power_Digit_Sum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Base Number ?  ?  ");
		int base_Number=sc.nextInt();
		System.out.println("Enter Any Power Number ?  ? ");
		int power_Number=sc.nextInt();
		long res=powerdigit(base_Number,power_Number);	
		System.out.println(res);
	}
	private static long  powerdigit(int base_Number, int power_Number)
	{
		/*
		 long sum = 0;
		char chars[] = BigInteger.valueOf(2).pow(1000).toString().toCharArray();
		for(int n = 0; n<chars.length; n++)
			sum +=Character.digit(chars[n],10);
		System.out.println(sum);
		 */
		
		long result=0;
		int number=(int) Math.pow(base_Number, power_Number);
		
		while(number>0)
		{
			 result=result+(number%10);
			 number=number/10;
		}
		return result;	
	}

}
/*
Enter Any Base Number ?  ?  
2
Enter Any Power Number ?  ? 
15
26
Enter Any Base Number ?  ?  
2
Enter Any Power Number ?  ? 
1000
46
*/