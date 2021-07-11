package sandeep.algoExpert.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Keyboard_1
{
	//Given an array of strings words, return the words that can be typed using letters of the alphabet 
	//on only one row of American keyboard like the image below.

		//	In the American keyboard:

	//		the first row consists of the characters "qwertyuiop",
//			the second row consists of the characters "asdfghjkl", and
	//		the third row consists of the characters "zxcvbnm".
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String Length ");
		int len=sc.nextInt();
		String str[]=new String[len];
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		
		String res[]=keyboardRows(str);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i] + " ");
		}	
	}
	private static String[] keyboardRows(String[] words)
	{
		int rowNumArray[]=new int[26];
		String row1="qwertyuiop";
		String row2="asdfghkl";
		String row3="zxcvbnm";
		
		for(char ch:row1.toCharArray())
		{
			rowNumArray[ch-'a']=1;
		}
		
		for(char ch:row2.toCharArray())
		{
			rowNumArray[ch-'a']=2;
		}
		
		for(char ch:row3.toCharArray())
		{
			rowNumArray[ch-'a']=3;
		}
		
		List<String> result=new ArrayList<>();
		for(String str:words)
		{
			String word=str.toLowerCase();
			boolean isDifference=false;
			for(int i=0;i<word.length()-1;i++)
			{
				char ch1=word.charAt(i);
				char ch2=word.charAt(i+1);
				if(rowNumArray[ch1-'a']!=rowNumArray[ch2-'a'])
				{
					isDifference=true;
					break;	
				}
			}
			if(isDifference==false)
			{
				result.add(str);
			}
		}
//		return result.toArray(new String[result.size()]);
		return result.toArray(new String[0]);
	}
}

/*
 Enter Any String Length 
4
Hello
Alaska
Dad
Peace
Alaska 
Dad 

 */