package sandeep.leetcode.com;
import java.util.Scanner;
public class Leetcode_258_Add_Digit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?  ? ");
		int num=sc.nextInt();
		int res=adddigit(num);
		System.out.println(res);
	}
	private static int adddigit(int num)
	{
		if(num==0)
			return 0;
		if(num%9==0)
			return 9;
		return num%9;
		
		/*
		   int digitalRoot = 0;
        while (num > 0) {
            digitalRoot += num % 10;
            num = num / 10;
            
            if (num == 0 && digitalRoot > 9) {
                num = digitalRoot;
                digitalRoot = 0;  
            }    
        }     
        return digitalRoot;
		 */
	}
}
/*
Given an integer num, repeatedly add all its digits until the result has only one
 digit, and return it
Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
*/
/*
Enter Any Number ?  ? 
38
2
*/

