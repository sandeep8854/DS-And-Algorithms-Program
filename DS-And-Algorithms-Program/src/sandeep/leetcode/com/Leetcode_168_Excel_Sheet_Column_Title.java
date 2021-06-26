package sandeep.leetcode.com;
import java.util.Scanner;
public class Leetcode_168_Excel_Sheet_Column_Title 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases  ?   ? ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		System.out.println("Enter Any Number  ?   ?  ");
		int number=sc.nextInt();
		String res=exelsheet(number);
		System.out.println(res);
		}
	}
	private static String exelsheet(int number) 
	{
		String str="";
		while(number>0)
		{
			number--;
			str=String.valueOf((char)(number%26+'A'))+str;
		//	str=String.valueOf((char)(number%26+'A'))+str;
			number=number/26;
		}
		return str;
	}

}

/*
Enter Any Test Cases  ?   ? 
10
Enter Any Number  ?   ?  
26
Z
Enter Any Number  ?   ?  
51
AY
Enter Any Number  ?   ?  
80
CB
Enter Any Number  ?   ?  
52
AZ
Enter Any Number  ?   ?  
705
AAC
Enter Any Number  ?   ?  
702
ZZ
Enter Any Number  ?   ?  
2147483647
FXSHRXW
Enter Any Number  ?   ?  
28
AB
Enter Any Number  ?   ?  
7
G
Enter Any Number  ?   ?  
32
AF
*/