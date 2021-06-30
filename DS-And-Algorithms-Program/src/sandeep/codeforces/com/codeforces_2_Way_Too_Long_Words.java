package sandeep.codeforces.com;
import java.util.Scanner;
public class codeforces_2_Way_Too_Long_Words
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases  ?  ?  ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter Any String Word ?  ?  ");
			String str=sc.next();
		//	String res=
					waytoo(str);
	//		System.out.println(res);
		}
	}
	private static void waytoo(String str)
	{
	//	String res=" ";
		int len=str.length();
	//	char[] ch=str.toCharArray();
		if(len>10)
		{
			str=str.charAt(0)+""+(len-2) +str.charAt(len-1);
			System.out.println(str);
		}
		else
		{
			System.out.println(str);
		}
	}
}
/*
Enter Any Test Cases  ?  ?  
4
Enter Any String Word ?  ?  
word
word
Enter Any String Word ?  ?  
localization
l10n
Enter Any String Word ?  ?  
internationalization
i18n
Enter Any String Word ?  ?  
pneumonoultramicroscopicsilicovolcanoconiosis
p43s
*/
