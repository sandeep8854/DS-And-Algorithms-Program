package sandeep.algoHack.com;

import java.util.Scanner;

public class Hack_53_Chocolate_Feast 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases ?  ? ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter Any initial amount of money ?  ? ");
			int n=sc.nextInt();
			System.out.println("Enter Any cost of chocolate bar ? ?  ");
			int c=sc.nextInt();
			System.out.println("Enter Number of wrapper can turn in for a free bar  ?  ?   ");
			int m=sc.nextInt();
			feast(n,c,m);
		}
	}

	private static void feast(int n, int c, int m) 
	{
		int wrapper=n/c;
		int total=wrapper;
		
		while(wrapper>=m)
		{
			total+=wrapper/m;
			wrapper=wrapper/m+wrapper%m;
		}
		System.out.println(total);	
	}
}

/*
Enter Any Test Cases ?  ? 
4
Enter Any initial amount of money ?  ? 
15
Enter Any cost of chocolate bar ? ?  
3
Enter Number of wrapper can turn in for a free bar  ?  ?   
2
9
Enter Any initial amount of money ?  ? 
10
Enter Any cost of chocolate bar ? ?  
2
Enter Number of wrapper can turn in for a free bar  ?  ?   
5
6
Enter Any initial amount of money ?  ? 
12
Enter Any cost of chocolate bar ? ?  
4
Enter Number of wrapper can turn in for a free bar  ?  ?   
4
3
Enter Any initial amount of money ?  ? 
6
Enter Any cost of chocolate bar ? ?  
2
Enter Number of wrapper can turn in for a free bar  ?  ?   
2
5
*/
