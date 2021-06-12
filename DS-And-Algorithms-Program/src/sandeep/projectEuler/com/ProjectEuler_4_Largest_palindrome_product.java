package sandeep.projectEuler.com;

import java.util.Scanner;

public class ProjectEuler_4_Largest_palindrome_product
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?  ? ");
		int num=sc.nextInt();
		
		int res=larPalinProd(num);
		System.out.println(res);
	}
	private static int larPalinProd(int num) 
	{
		if(num==1)
			return 0;
		//Find a lower limit on n digit numbers. For example, for n = 2, lower_limit is 10.
			//	Find an upper limit on n digit numbers. For example, for n = 2, upper_limit is 99.
			//	Consider all pairs of numbers where ever number lies in range [lower_limit, upper_limit]
		int upperNumber=(int)Math.pow(10, num)-1;
		
		int lowerNumber=1+upperNumber/10;
		
		int maxProductNumber=0;
		for(int i=upperNumber;i>=lowerNumber;i--)
		{
			for(int j=i;j>=lowerNumber;j--)
				
			{
				int product=i*j;
				if(product<maxProductNumber)
					break;
				int number=product;
				int reverse=0;
				while(number!=0)
				{
					reverse=reverse*10+number%10;
					number=number/10;
				}
				// update new product if exist and if
                // greater than previous one
				if(product==reverse &&product>maxProductNumber)
					maxProductNumber=product;
			}	
		}
		return maxProductNumber;	
	}
}
/*
Enter Any Number ?  ? 
3
906609
Enter Any Number ?  ? 
5
2128338212
*/