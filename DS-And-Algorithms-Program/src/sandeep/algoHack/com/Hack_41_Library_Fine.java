package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_41_Library_Fine 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter returned Day number  ?  ?  ");
		int d1=sc.nextInt();
		
		System.out.println("Enter returned Month number  ?  ? ");
		int m1=sc.nextInt();
		
		System.out.println("Enter returned Year number  ?   ? ");
		int y1=sc.nextInt();
		
		System.out.println("Enter Expected the Day ?   ?  ");
		int d2=sc.nextInt();
		
		System.out.println("Enter Expected the Month    ?  ?  ");
		int m2=sc.nextInt();
		
		System.out.println("Enter Expected The Year  ?   ?  ");
		int y2=sc.nextInt();
		
		libraryfine(d1,m1,y1,d2,m1,y2);
	}
	private static void libraryfine(int returnedDay, int returnedMonth, int  returnedYear, int ExpectedDay, int ExpectedMonth, int ExpectedYear)
	{
		int fine=0;
		if(ExpectedYear<returnedYear)
		{
			fine=10000;
		}
		else if(ExpectedYear==returnedYear)
		{
			if(ExpectedMonth<returnedMonth)
			{
				fine=(returnedMonth-ExpectedMonth)*500;
			}
			else if(ExpectedMonth==returnedMonth)
			{
				if(ExpectedDay<returnedDay)
				{
					fine=(returnedDay-ExpectedDay)*15;
				}
			}
		}	
		System.out.println(fine);
	}
}
/*
Enter returned Day number  ?  ?  
14
Enter returned Month number  ?  ? 
7
Enter returned Year number  ?   ? 
2018
Enter Expected the Day ?   ?  
5
Enter Expected the Month    ?  ?  
7
Enter Expected The Year  ?   ?  
2018
135
*/
/*
Enter returned Day number  ?  ?  
9
Enter returned Month number  ?  ? 
6
Enter returned Year number  ?   ? 
2015
Enter Expected the Day ?   ?  
6
Enter Expected the Month    ?  ?  
6
Enter Expected The Year  ?   ?  
2015
45
*/
