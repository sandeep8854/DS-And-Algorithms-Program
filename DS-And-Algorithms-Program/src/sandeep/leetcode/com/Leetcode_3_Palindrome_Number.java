package sandeep.leetcode.com;

import java.util.Scanner;

public class Leetcode_3_Palindrome_Number
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ?   ?  ");
		int num=sc.nextInt();
		boolean result=palindrom(num);
		if(result==true)
			System.out.println("YES");
		else
			System.out.println("NO");
			
}
	private static boolean palindrom(int x)
	{
		  if(x == 0)
		  {
	            return true;
	      }
	        if(x < 0 || x%10 == 0)
	        {
	            return false;
	        }
	        
	        int temp = 0;
	        int preX = x;
	        while (x > temp)
	        {
	            int pop = x%10;
	            preX = x;
	            x /= 10;

	            temp = temp*10 + pop;
	        }
	        if(x == temp || preX == temp)
	            return true;
	        else
	            return false;	
	}
}
/*

Enter Any Number  ?   ?  
121
YES

Enter Any Number  ?   ?  
-101
NO

Enter Any Number  ?   ?  
0
YES


Enter Any Number  ?   ?  
10
NO









*/