package sandeep.algoHack.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class UniqueChar2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String  ?     ? ");
		String str=sc.next();
		List<Character> res=findUnique(str);	
		for(int i=0;i<res.size();i++)
		{
			System.out.print(res.get(i)+ "");
		}
	}
	private static List<Character> findUnique(String str)
	{
		List<Character> list=new ArrayList<>();
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
				list.add(str.charAt(i));
			}
		}	
		return list;
	}
}
