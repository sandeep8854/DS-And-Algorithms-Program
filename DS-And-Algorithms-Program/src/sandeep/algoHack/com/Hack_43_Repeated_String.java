package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_43_Repeated_String
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String  ?   ? ");
		String s=sc.next();
		System.out.println("Enter Any Integer ?   ? ");
		long n=sc.nextLong();
		repeatedString(s,n);
	}
	private static void repeatedString(String s, long n)
	{
		long ckeck=0;
		long count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				count++;
			}
		}
		long division=n/s.length();
		long reminder=n%s.length();
		
		count=division*count;
		for(int i=0;i<reminder;i++)
		{
			if(s.charAt(i)=='a')
			{
			count++;
			}
		}
		System.out.println(count);
	}
}
/*
Enter Any String  ?   ? 
a
Enter Any Integer ?   ? 
1000000000000
1000000000000
*/
/*
 Enter Any String  ?   ? 
aba
Enter Any Integer ?   ? 
10
7
*/
/*
Enter Any String  ?   ? 
abcac
Enter Any Integer ?   ? 
10
4
*/
