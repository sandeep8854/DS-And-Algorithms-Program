package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_7_StairCase 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number? ?   ?  ");
		int number=sc.nextInt();
		stair(number);	
	}
	private static void stair(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
/*
Enter Any Number? ?   ?  
5
    #
   ##
  ###
 ####
#####
*/