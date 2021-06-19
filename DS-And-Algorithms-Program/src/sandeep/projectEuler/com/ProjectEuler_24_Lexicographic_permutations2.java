package sandeep.projectEuler.com;

import java.util.Scanner;

public class ProjectEuler_24_Lexicographic_permutations2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String ?  ? ");
		String str=sc.next();
		String answer="";
		System.out.println("Print All permute Answer : = ");
		permute(str,answer);
	}

	private static void permute(String str, String answer)
	{
		if(str.length()==0)
		{
			System.out.println(answer + " ");
			return;
		
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String leftSide=str.substring(0, i);
			String rightSide=str.substring(i+1);
			String add=leftSide+rightSide;
			permute(add,answer+ch);
		}	
	}
}
/*
Enter Any String ?  ? 
ABCD
Print All permute Answer : = 
ABCD 
ABDC 
ACBD 
ACDB 
ADBC 
ADCB 
BACD 
BADC 
BCAD 
BCDA 
BDAC 
BDCA 
CABD 
CADB 
CBAD 
CBDA 
CDAB 
CDBA 
DABC 
DACB 
DBAC 
DBCA 
DCAB 
DCBA 
*/