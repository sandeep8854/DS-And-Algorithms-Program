package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_10_Time_Conversion
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter time Format ?  ?  ?  ?? ");
		String[] time=sc.nextLine().split(":");
		
		
		String hours=time[0];
		String minutes=time[1];
		String seconds=time[2].substring(0, 2);
		String ampm=time[2].substring(2, 4);
		
		if(ampm.equals("AM"))
		{
			System.out.println(hours.equals("12")? "00":hours +":"+minutes+ ":"+seconds);
		}
		else
		{
			System.out.println((hours.equals("12")? hours :(Integer.parseInt(hours)+12))+ ":"+minutes+ ":" +seconds);
		}	
	}
}
/*
Enter time Format ?  ?  ?  ?? 
07:05:45PM
19:05:45
*/