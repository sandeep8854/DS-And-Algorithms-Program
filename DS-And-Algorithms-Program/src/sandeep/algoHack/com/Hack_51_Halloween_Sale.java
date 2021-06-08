package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_51_Halloween_Sale 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Price o first game ?     ?  ");
		int price=sc.nextInt();
		System.out.println("Enter discount from previous game price  ?    ? ");
		int discount=sc.nextInt();
		System.out.println("Enter the minimum cost of a game  ?    ? ");
		int minimum=sc.nextInt();
		System.out.println("Enter the starting budget  ?    ? ");
		int starting_budget=sc.nextInt();
		int res=halloweenP(price,discount,minimum,starting_budget);
		System.out.println(res);
	}
	private static int halloweenP(int price, int discount, int minimum, int starting_budget)
	{
		
		    int countGame=0;
	        while(starting_budget>=price)
	        {
	            countGame++;
	            starting_budget=starting_budget-price;
	            price=Math.max(price-discount,minimum);
	        }
	        return countGame;
	}
	
}
		
		
	/*	for( price=20;price<=minimum;)
		{
			 minius=(price-discount);
			 price=price-discount;
			 count++;
		}
		return count;
		*/
		/*
		 Enter Price o first game ?     ?  
20
Enter discount from previous game price  ?    ? 
3
Enter the minimum cost of a game  ?    ? 
6
Enter the starting budget  ?    ? 
80
6

Enter Price o first game ?     ?  
20
Enter discount from previous game price  ?    ? 
3
Enter the minimum cost of a game  ?    ? 

6
Enter the starting budget  ?    ? 
70
5

		 */
