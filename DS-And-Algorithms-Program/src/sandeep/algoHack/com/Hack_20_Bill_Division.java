package sandeep.algoHack.com;

import java.util.Scanner;

public class Hack_20_Bill_Division 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Bill Length (in Array ) ?  ?  ");
		int len=sc.nextInt();
		int Bill[]=new int[len];
		for(int i=0;i<Bill.length;i++)
		{
			Bill[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Bill which item Anna does't eat  ?   ? ");
		int k=sc.nextInt();
		System.out.println("Enter  the amount of money that Brian charged Anna for her share of the bill  ?  ?   ");
		int Bcharged=sc.nextInt();
		
		billDivision(Bill,k,Bcharged);	
	}
	private static void billDivision(int[] bill, int k, int bcharged)
	{
		int sum=0;
		for(int i=0;i<bill.length;i++)
		{
			sum=sum+bill[i];
		}
		int Bactual=(sum-k)/2;
		if(Bactual==bcharged)
		{
			System.out.println("Bon Appetit");
		}
		else
		{
			int res=bcharged-Bactual;
			System.out.println(res);
		}
	}
}
/*
Enter Any Bill Length (in Array ) ?  ?  
4
3
10
2
9
Enter the Bill which item Anna does't eat  ?   ? 
1
Enter  the amount of money that Brian charged Anna for her share of the bill  ?  ?   
12
5
*/
/*
Enter Any Bill Length (in Array ) ?  ?  
4
3
10
2
9
Enter the Bill which item Anna does't eat  ?   ? 
1
Enter  the amount of money that Brian charged Anna for her share of the bill  ?  ?   
7
Bon Appetit
*/
