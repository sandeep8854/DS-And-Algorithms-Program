package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_19_Day_Of_The_Programmer
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Year ?  ?  ");
		int year=sc.nextInt();
		dayOfProgrammer(year);
	}
	private static void dayOfProgrammer(int year)
	{
		if(year<1918)     
		{
			if(year%4==0)        //Julian Calender
				System.out.println("12.09."+year);
			else
				System.out.println("13.09."+year);
		}
		else if(year>1918)
		{
			if((year%400==0)||((year%4==0)&&(year%100!=0)))   //Gregorial Caledder
				System.out.println("12.09."+year);
			else
				System.out.println("13.09."+year);
		}
		else
		{             //Special case: transition year
			//year == 1918
			System.out.println("26.09."+year);
		}
	}
}
/*
Enter Any Year ?  ?  
2016
12.09.2016
*/

/*
Enter Any Year ?  ?  
1918
26.09.1918
*/