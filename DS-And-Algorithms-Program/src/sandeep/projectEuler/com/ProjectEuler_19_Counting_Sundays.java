package sandeep.projectEuler.com;
public class ProjectEuler_19_Counting_Sundays 
{
	public static void main(String[] args)
	{
		int months1[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		int months2[]= {31,29,31,30,31,30,31,31,30,31,30,31};
		int day=2;
		int count=0;
		for(int i=1901;i<2001;i++)
		{
			for(int j=0;j<12;j++)
			{
				if(i%4==0)
					day=day+months2[j]%7;
				else
					day=day+months1[j]%7;
				if(day%7==0)
					count++;		
			}
		}
		System.out.println(count);
	}
}

/*
171
 */

/*
if(year%4==0 && (year%400==0)||(!((year%100)==0)))
{
	NoOfDayInMonth[1]=28;
}
else
{
	NoOfDayInMonth[1]=29;
}
*/