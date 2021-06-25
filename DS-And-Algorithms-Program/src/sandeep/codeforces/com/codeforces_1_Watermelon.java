package sandeep.codeforces.com;
import java.util.Scanner;
public class codeforces_1_Watermelon 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Weight of Watermelon  ?   ? ");
		int wm=sc.nextInt();
		watermelon(wm);	
	}
	private static void watermelon(int wm)
	{
		if(wm>2)
		{
			if((wm%2)==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		else
		{
			System.out.println("NO");
		}
	}	

}
