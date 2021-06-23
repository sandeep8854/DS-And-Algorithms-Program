package sandeep.leetcode.com;
import java.util.Scanner;
public class Leetcode_67_Add_Binary 
{ 
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases  ?   ? ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		System.out.println("Enter First String ?  ?   ");
		String str1=sc.next();
		System.out.println("Enter Second String  ?  ? ");
		String str2=sc.next();
		String res=add(str1,str2);
		System.out.println(res);
		}
	}
	private static String add(String str1, String str2)
	{
		String res="";
		int sum=0;
		int i=str1.length()-1;
		int j=str2.length()-1;
		
		while(i>=0||j>=0||sum==1)
		{
			sum=sum+((i>=0)?str1.charAt(i)-'0':0);
			sum=sum+((j>=0)?str2.charAt(j)-'0':0);
			
			res=(char)(sum%2+'0')+res;
			sum=sum/2;
			i--;
			j--;
			
		}
		
		return res;
	}

}
/*
Enter Any Test Cases  ?   ? 
5
Enter First String ?  ?   
1010
Enter Second String  ?  ? 
1010
10100
Enter First String ?  ?   
11
Enter Second String  ?  ? 
1
100
Enter First String ?  ?   
10101
Enter Second String  ?  ? 
01000
11101
Enter First String ?  ?   
101011
Enter Second String  ?  ? 
001111
111010
Enter First String ?  ?   
101101
Enter Second String  ?  ? 
111101
1101010
*/


