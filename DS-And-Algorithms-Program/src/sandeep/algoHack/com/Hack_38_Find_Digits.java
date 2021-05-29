package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_38_Find_Digits 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of test case ?  ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		int digit=count_Digit(number);
		System.out.println(digit);
		}
	}
	private static int count_Digit(int n)
	{
	/*	int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;	
		*/
		
		    int count=0;
	        int num=n;
	        while(n>0)
	        {
	            int reminder=n%10;
	            if(reminder!=0 && num % reminder==0)
	            count++;
	            n/=10;
	        }
	        return count;
	}		
}

/*

Enter Number of test case ?  
2
Enter Any Number ? ?
111
3
Enter Any Number ? ?
124
3
*/

/*
Enter Number of test case ?  
3
Enter Any Number ? ?
111
3
Enter Any Number ? ?
124
3
Enter Any Number ? ?
10
1
*/