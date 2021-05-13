package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_13_Number_Line_Jumps
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Position of first Kangaroo 1 ");
		int x1=sc.nextInt();
		System.out.println("Enter how many jumps at a time [Kangaroo 1] ?  ? ");
		int v1=sc.nextInt();
		System.out.println("Enter starting position of second Kangaroo 2 ");
		int x2=sc.nextInt();
		System.out.println("Enter how many jumps at a time [Kangaroo 2]");
		int v2=sc.nextInt();
		lineJumps(x1,v1,x2,v2);	
	}
	private static void lineJumps(int x1, int v1, int x2, int v2)
	{
		if(v1>v2)
		{
			int reminder=(x1-x2)%(v1-v2);
			if(reminder==0)
			{
				System.out.println("YES");
			}
		}
		System.out.println("NO");		
	}
}
//TEstCase -1
/*
Enter Starting Position of first Kangaroo 1 
2
Enter how many jumps at a time [Kangaroo 1] ?  ? 
1
Enter starting position of second Kangaroo 2 
1
Enter how many jumps at a time [Kangaroo 2]
2
NO
*/
/*
Enter Starting Position of first Kangaroo 1 
0
Enter how many jumps at a time [Kangaroo 1] ?  ? 
2
Enter starting position of second Kangaroo 2 
5
Enter how many jumps at a time [Kangaroo 2]
3
NO
*/