package sandeep.leetcode.com;
import java.util.Scanner;
public class Leetcode_172_Factorial_Trailing_Zeroes 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any NUmber  ?  ?  ");
		int number=sc.nextInt();
		int res=factNumOfZeros(number);
		System.out.println(res);
	}
	private static int factNumOfZeros(int number)
	{
		//2ND APPROACH=:
	//	railing 0s in n! = Count of 5s in prime factors of n!
     //           = floor(n/5) + floor(n/25) + floor(n/125) + ....
		int count=0;
		if(number==0)
			return 0;
		for(int i=5;number/i>=1;i*=5)
		{
			count=count+number/i;
		}
		return count;
		//APPROACH Ist:===
		
/*		int count=0;
		if(number==0)
			return 0;
		while(number>1)
		{
			if(number%10==0)
			{
				count++;
				number=number/10;
			}
			else
				break;
		}
		return count;
		*/
	}
}
/*
Enter Any NUmber  ?  ?  
5
1
*/

/*
Enter Any NUmber  ?  ?  
100
24
*/

/*
Enter Any NUmber  ?  ?  
0
0
*/