package sandeep.projectEuler.com;
import java.util.Scanner;
public class ProjectEuler_1_Multiple_3_5 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ?   ?  ");
		int num=sc.nextInt();
		int res=multiple(num);	
		System.out.println(res);
	}
	private static int multiple(int num) 
	{
		int sum=0;
		for(int i=1;i<=1000;i++) //you can put the value according to question.
		{
			if(i%3==0 || i%5==0)
				sum=sum+i;
		}
		return sum;	
	}
}
/*
Enter Any Number  ?   ?  
1000
234168
*/
/*
Question

If we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

*/