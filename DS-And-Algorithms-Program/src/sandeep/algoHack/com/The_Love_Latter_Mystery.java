package sandeep.algoHack.com;
import java.util.Scanner;
public class The_Love_Latter_Mystery 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String Length  ?   ?");
		int len=sc.nextInt();
		System.out.println("Enter " + len + " String ");
		for(int i=0;i<len;i++)
		{
			String str=sc.next();
		  loveLetter(str);
		}	
	}
	private static void loveLetter(String str)
	{
		int n=str.length();
		int count=0;
		for(int i=0;i<n/2;i++)
		{
			count=count+Math.abs(str.charAt(i)-str.charAt(n-1-i));
		}
		System.out.println(count);
	}
}
/*
Enter Any String Length  ?   ?
4
Enter 4 String 
abc
2
abcba
0
abcd
4
cba
2
*/