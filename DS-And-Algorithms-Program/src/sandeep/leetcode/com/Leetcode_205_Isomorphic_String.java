package sandeep.leetcode.com;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Leetcode_205_Isomorphic_String
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any first String  ? ?   ");
		String str1=sc.next();
		System.out.println("Enter Second String  ?  ? ");
		String str2=sc.next();
		boolean res=iso(str1,str2);
		System.out.println(res);
	}
	private static boolean iso(String str1, String str2)
	{
		if(str1.length()!=str2.length())
			return false;
		
		HashMap<Character,Character> hm1=new HashMap<>();
		
		
		// use set to store a pool of already mapped characters
		Set<Character> set1=new HashSet<>();
		for(int i=0;i<str1.length();i++)
		{
			char ch1=str1.charAt(i);
			char ch2=str2.charAt(i);
			//if ch1 seen before
			if(hm1.containsKey(ch1))
			{
				if(hm1.get(ch1)!=ch2)
				{
					return false;
				}
			}
			else
			{
				if(set1.contains(ch2))
				{
					return false;
				}
				hm1.put(ch1, ch2);
				set1.add(ch2);
			}
		}
		return true;
	}
}
