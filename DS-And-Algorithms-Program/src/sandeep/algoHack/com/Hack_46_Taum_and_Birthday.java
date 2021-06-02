package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_46_Taum_and_Birthday 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases ?   ?  ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter Number Of black gift[b] ?   ? ");
			int black=sc.nextInt();
			System.out.println("Enter  Number of White gift[w]  ?   ? ");
			int white=sc.nextInt();
			System.out.println("Enter The cost of each black gift[bc] ?  ? ");
			int black_cost=sc.nextInt();
			System.out.println("Enter The cost of each white gift[wc]  ?   ?");
			int white_cost=sc.nextInt();
			
			System.out.println("Enter The cost to convert a black gift into white gift or white gift to black gift ?  ? ");
			int convertBlackwhite=sc.nextInt();
			
			int res=birthday(black,white,black_cost,white_cost,convertBlackwhite);
			System.out.println(res);
		}
	}
	private static int birthday(int black, int white, int black_cost, int white_cost, int convertBlackwhite) 
	{
		int cost=0;
		if(black_cost>white_cost+convertBlackwhite)
		{
			cost=black*(white_cost+convertBlackwhite)+white*white_cost;
		}
		else if(white_cost>black_cost+convertBlackwhite)
		{
			cost=black*black_cost+white*(black_cost+convertBlackwhite);	
		}
		else
		{
			cost=black*black_cost+white*white_cost;
		}
		return cost;
	}
}
/*
Enter Any Test Cases ?   ?  
5
Enter Number Of black gift[b] ?   ? 
7
Enter  Number of White gift[w]  ?   ? 
7
Enter The cost of each black gift[bc] ?  ? 
4
Enter The cost of each white gift[wc]  ?   ?
2
Enter The cost to convert a black gift into white gift or white gift to black gift ?  ? 
1
35
Enter Number Of black gift[b] ?   ? 
3
Enter  Number of White gift[w]  ?   ? 
3
Enter The cost of each black gift[bc] ?  ? 
1
Enter The cost of each white gift[wc]  ?   ?
9
Enter The cost to convert a black gift into white gift or white gift to black gift ?  ? 
2
12
Enter Number Of black gift[b] ?   ? 
3
Enter  Number of White gift[w]  ?   ? 
6
Enter The cost of each black gift[bc] ?  ? 
9
Enter The cost of each white gift[wc]  ?   ?
1
Enter The cost to convert a black gift into white gift or white gift to black gift ?  ? 
1
12
Enter Number Of black gift[b] ?   ? 
5
Enter  Number of White gift[w]  ?   ? 
9
Enter The cost of each black gift[bc] ?  ? 
2
Enter The cost of each white gift[wc]  ?   ?
3
Enter The cost to convert a black gift into white gift or white gift to black gift ?  ? 
4
37
Enter Number Of black gift[b] ?   ? 
10
Enter  Number of White gift[w]  ?   ? 
10
Enter The cost of each black gift[bc] ?  ? 
1
Enter The cost of each white gift[wc]  ?   ?
1
Enter The cost to convert a black gift into white gift or white gift to black gift ?  ? 
1
20
*/