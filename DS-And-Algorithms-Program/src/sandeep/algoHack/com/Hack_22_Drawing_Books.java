package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_22_Drawing_Books 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Pages ?  ?  ");
		int n=sc.nextInt();
		System.out.println("Enter How many Pages are to turn ?  ? ");
		int p=sc.nextInt();
		int result=drawingBook(n,p);
		System.out.println(result);
	}
	private static int drawingBook(int n, int p)
	{
		int pagesCountfromFront=n/2;
		int totalTargetPagefromFront=p/2;
		int exactPagefromback=pagesCountfromFront-totalTargetPagefromFront;
		return Math.min(totalTargetPagefromFront, exactPagefromback);
	}
}
/*
Enter Number Of Pages ?  ?  
6
Enter How many Pages are to turn ?  ? 
2
1
*/
/*
Enter Number Of Pages ?  ?  
5
Enter How many Pages are to turn ?  ? 
4
0
*/