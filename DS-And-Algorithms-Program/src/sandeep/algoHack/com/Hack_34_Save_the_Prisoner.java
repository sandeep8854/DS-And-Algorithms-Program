package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_34_Save_the_Prisoner
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases  ?    ?  ");
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
			System.out.println("Enter Any Number of Prisoners  ?    ?  ");
			int n=sc.nextInt();
			System.out.println("Enter Any Number Piece of Candy  ?    ? ");
			int m=sc.nextInt();
			System.out.println("Enter Any Number Which Can be Start Chair of Count ?   ?   ");
			int s=sc.nextInt();
			saveThePrisoner(n,m,s);
		}	
	}
	private static void saveThePrisoner(int n, int m, int s) 
	{
		int reminder=m%n;
		if((reminder+s-1)%n==0)
		{
			System.out.println(s);
		}
		else
			System.out.println((reminder+s-1)%n);	
	}
}
/*
Enter Any Test Cases  ?    ?  
1
Enter Any Number of Prisoners  ?    ?  
4
Enter Any Number Piece of Candy  ?    ? 
6
Enter Any Number Which Can be Start Chair of Count ?   ?   
2
3
*/
/*
Enter Any Test Cases  ?    ?  
2
Enter Any Number of Prisoners  ?    ?  
5
Enter Any Number Piece of Candy  ?    ? 
2
Enter Any Number Which Can be Start Chair of Count ?   ?   
1
2
Enter Any Number of Prisoners  ?    ?  
5
Enter Any Number Piece of Candy  ?    ? 
2
Enter Any Number Which Can be Start Chair of Count ?   ?   
2
3
*/