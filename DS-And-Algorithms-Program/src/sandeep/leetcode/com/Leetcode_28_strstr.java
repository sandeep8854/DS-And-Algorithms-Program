package sandeep.leetcode.com;

import java.util.Scanner;

public class Leetcode_28_strstr 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Any Test Cases ?  ? ");
//		int t=sc.nextInt();
//		for(int i=0;i<t;i++)
//		{
		System.out.println("Enter first String ?  ? ");
		String str1=sc.next();
		System.out.println("Enter Second String  ?  ?  ");
		String str2=sc.next();
		int res=strImple(str1,str2);
		System.out.println(res);
	//    }
	}
	private static int strImple(String str1, String str2)
	{
		int n1=str1.length();
		int n2=str2.length();

		if(str1==null || str2==null)
			return -1;
		
		for(int i=0;i<n1-n2+1;i++)
		{
			int j;
			for( j=0;j<n2;j++)
			{
				 if (str1.charAt(i + j) != str2.charAt(j)) 
				 { 
					 break;
	              } 
			}
			if(j==str2.length())
			{
				return i;
			}
		}
		return -1;
	}
}

/*
 Enter Any Test Cases ?  ? 
3
Enter first String ?  ? 
hello
Enter Second String  ?  ?  
ll
2
Enter first String ?  ? 
aaaaa
Enter Second String  ?  ?  
bba
-1
Enter first String ?  ? 
""
Enter Second String  ?  ?  
""
0
*/
