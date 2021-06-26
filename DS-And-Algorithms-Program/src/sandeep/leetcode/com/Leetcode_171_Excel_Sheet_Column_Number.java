package sandeep.leetcode.com;
import java.util.Scanner;
public class Leetcode_171_Excel_Sheet_Column_Number
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases  ?   ? ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		System.out.println("Enter Any String   ?   ?  ");
		String str=sc.next();
		int res=exelsheetNumber(str);
		System.out.println(res);
		}
	}
	private static int exelsheetNumber(String str)
	{
		int result=0;
		for(int i=0;i<str.length();i++)
		{
			result=result*26;
			result=result+str.charAt(i)-'A'+1;
		}
		return result;
	}

}
/*
Enter Any Test Cases  ?   ? 
5
Enter Any String   ?   ?  
A
1
Enter Any String   ?   ?  
AB
28
Enter Any String   ?   ?  
ZY
701
Enter Any String   ?   ?  
FXSHRXW
2147483647
Enter Any String   ?   ?  
CDA
2133
*/