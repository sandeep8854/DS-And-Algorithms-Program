package sandeep.leetcode.com;
import java.util.Scanner;
public class Leetcode_58_Length_of_Last_Word
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String ?   ");
		String str=sc.next();
		int res=lenLastWord(str);
		System.out.println(res);
	}
	private static int lenLastWord(String str)
	{
		int last=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)==' ')
			{
				if(last!=0)
				{
					return last;
				}
			}
			else
				last++;
		}
		return last;
	}

}
/*
Enter Any String ?   
hello world
5
*/