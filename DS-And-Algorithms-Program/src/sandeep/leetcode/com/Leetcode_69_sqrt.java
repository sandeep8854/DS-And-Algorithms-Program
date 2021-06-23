package sandeep.leetcode.com;
import java.util.Scanner;
public class Leetcode_69_sqrt
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ?   ? ");
		int number=sc.nextInt();
		int res=sq_rt(number);
		System.out.println(res);
	}

	private static int sq_rt(int number) 
	{
		int result=(int)Math.sqrt(number);
	
		return result;
	}

}
/*
Enter Any Number  ?   ? 
4
2
*/