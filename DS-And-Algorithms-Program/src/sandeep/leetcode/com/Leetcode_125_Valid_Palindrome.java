package sandeep.leetcode.com;
import java.util.Scanner;
public class Leetcode_125_Valid_Palindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String   ?  ? ");
		String str=sc.nextLine();
		//boolean res
		boolean res=validPanlindrome(str);
		if(res==true)
		System.out.println(" is a Palindrome String");
		else
			System.out.println(" is not Palindrome String ");
	}

	private static boolean validPanlindrome(String s)
	{
		/* str=str.replaceAll("[^a-zA-Z0-9-]", "").toLowerCase().trim();
		 int n=str.length();
		 if(n==1)
			 return true;
		 if(n==0)
			 return false;
	//	System.out.println(s);
		  int i = 0, j = str.length() - 1;
		  
	        while (i < j)
	        {  
	            if (str.charAt(i) != str.charAt(j))
	                return false;
	            i++;
	            j--;
	        }
			return true;
	//	return false;*/
		 s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase().trim();  
	        int n=s.length();
	        if(n==1)
	            return true;
	        for(int i=0;i<n/2;i++) {
	            if(s.charAt(i) != s.charAt(n-1-i))
	                return false;
	        }
	        return true;
	}

}
/*
Enter Any String   ?  ? 
A man, a plan, a canal: Panama
 is a Palindrome String
*/
