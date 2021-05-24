package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_32_Beautiful_Days_at_the_Movies
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter i Value ?  ?   ");
		int i=sc.nextInt();
		System.out.println("Enter j Value  ?  ?  ");
		int j=sc.nextInt();
		System.out.println("Enter k value ?    ?  ");
		int k=sc.nextInt();
		beautifulDaysAtTheMovies(i,j,k);	
	}
	private static void beautifulDaysAtTheMovies(int ii, int j, int k)
	{
	//	int reverse=0;
		int beautifulNumberCount=0;
		for(int i=ii;i<=j;i++)
		{
			int number=i;
			int reverse=0;
			int last_Digit=0;
			while(number>0)
			{
				last_Digit=number%10;
				reverse=(reverse*10)+last_Digit;
				number=number/10;
			}
			if((i-reverse)%k==0)
			{
				beautifulNumberCount++;
			}
		}
		System.out.println(beautifulNumberCount);
	}
}
/*
Enter i Value ?  ?   
20
Enter j Value  ?  ?  
23
Enter k value ?    ?  
6
2
*/
/*
Enter i Value ?  ?   
49860 
Enter j Value  ?  ?  
205494 
Enter k value ?    ?  
155635764
607
*/