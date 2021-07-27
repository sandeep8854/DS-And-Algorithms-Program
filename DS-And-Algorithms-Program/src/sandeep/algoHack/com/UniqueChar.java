package sandeep.algoHack.com;
import java.util.Scanner;
public class UniqueChar
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String  ?  ?  ");
		String str=sc.next();
		findUnique(str);	
	}
	private static void findUnique(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			boolean uniq=true;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j)&& i!=j)
				{
					uniq=false;
					break;
				}	
			}
			if(uniq==true)
			{
				System.out.print(str.charAt(i));
			}
		}	
	}
}
/*
Enter Any String  ?  ?  
faaabbccegs
fegs
*/