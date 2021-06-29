package sandeep.spoj.com;

import java.util.Scanner;

public class Spoj_24_Small_Factorial
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases   ?  ?  ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter Any Number  ? ");
			int number=sc.nextInt();
			int res=small(number);
			System.out.println(res);
		}	
	}
	private static int small(int number)
	{
		int fact=1;
		while(number!=0)
		{
			fact=fact*number;
			number--;
		}
		return fact;	
	}
}

/*
Enter Any Test Cases   ?  ?  
4
Enter Any Number  ? 
1
1
Enter Any Number  ? 
2
2
Enter Any Number  ? 
5
120
Enter Any Number  ? 
3
6
*/