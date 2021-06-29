package sandeep.spoj.com;

import java.util.Scanner;

public class Spoj_2_Prime_Interval 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting  number for find  ?   ?  ");
		int st1=sc.nextInt();
		System.out.println("Enter Ending Number for find  ?   ? ");
		int end=sc.nextInt();
		prime(st1,end);
	

	}

	private static void prime(int st1, int end)
	{
		boolean p[]=new boolean[100];
		for(int i=st1;i<=end;i++)
		{
			p[i]=true;
		}
		
		for(int i=2;i*i<end;i++)
		{
			if(!p[i])
				continue;
			for(int j=i*i;j<end;j=j+i)
			{
				p[j]=false;
				
			}
		}
		for(int i=st1;i<end;i++)
		{
			if(p[i]==true)
				System.out.print(i + " ");
		}
	}
}

/*
 Enter Starting  number for find  ?   ?  
2
Enter Ending Number for find  ?   ? 
15
2 3 5 7 11 13 
*/
