package sandeep.projectEuler.com;
import java.util.Scanner;
public class ProjectEuler_6_Sum_square_difference
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ?  ? ");
		int num=sc.nextInt();
		int res=sumOfSquareDiff(num);
		System.out.println(res);
	}

	private static int sumOfSquareDiff(int num)
	{
		int difference=num*(num-1)*(num+1)*(3*num+2)/12;
		return difference;
	}
}
/*
Enter Any Number  ?  ? 
10
2640
Enter Any Number  ?  ? 
100
25164150
 */

//The sum of the squares of the first ten natural numbers is,
//1^2+2^2+3^2.................10^2=385

//The square of the sum of the first ten natural numbers is,
//(1+2+3+4+........10)^2=3025
//Hence the difference between the sum of the squares of the first ten natural
//numbers and the square of the sum is .
//3025-385=2640

//Find the difference between the sum of the squares of the first one hundred natural
//numbers and the square of the sum.
//1;
//The sum of the first n natural numbers (called triangular numbers, )

//formula :==
 // n(n+1)/2

//formula Second
//The sum of the first n square numbers (square pyramidal numbers):
//n(n+1)(2n+1)/6

//A compound formula
//Now, I guess for the purists one could perform the subtraction of these 
//two summations and derive the following formula

//n(n-1)(n+1)(2n+1)/12













