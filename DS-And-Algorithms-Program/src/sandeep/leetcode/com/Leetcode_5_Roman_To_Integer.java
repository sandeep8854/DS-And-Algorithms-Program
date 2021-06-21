package sandeep.leetcode.com;
import java.util.HashMap;
import java.util.Scanner;
public class Leetcode_5_Roman_To_Integer 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases  ?   ? ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		System.out.println("Enter Any String  ?   ?  ");
		String str=sc.next();
		int res=romantoint(str);
		System.out.println(res);
		}
	}
	private static int romantoint(String str) 
	{
		HashMap<Character,Integer> Rn=new HashMap<>();
		Rn.put('I', 1);
		Rn.put('V', 5);
		Rn.put('X', 10);
		Rn.put('L', 50);
		Rn.put('C', 100);
		Rn.put('D', 500);
		Rn.put('M', 1000);
		
		int i=0;
		int solution=0;
		while(i<str.length())
		{
			int characterValue=Rn.get(str.charAt(i));
			if(i+1<str.length())
			{
				int characterValue2=Rn.get(str.charAt(i+1));
				int difference=characterValue2-characterValue;
				if(difference>0)
				{
					if(difference==4||difference==9||difference%4==0||difference%90==0)
					{
						solution=solution+difference;
					}
					i=i+2;
				}
				else
				{
					solution=solution+characterValue;
					i++;
				}
			}else
			{
				solution=solution+characterValue;
				i++;
			}
		}
             return solution;
    }
}
/*
Enter Any Test Cases  ?   ? 
10
Enter Any String  ?   ?  
III
3
Enter Any String  ?   ?  
IV
4
Enter Any String  ?   ?  
LVIII
58
Enter Any String  ?   ?  
MCMXCIV
1994
Enter Any String  ?   ?  
XL
40
Enter Any String  ?   ?  
XC
90
Enter Any String  ?   ?  
M
1000
Enter Any String  ?   ?  
CM
900
Enter Any String  ?   ?  
CD
400
Enter Any String  ?   ?  
D
500
*/