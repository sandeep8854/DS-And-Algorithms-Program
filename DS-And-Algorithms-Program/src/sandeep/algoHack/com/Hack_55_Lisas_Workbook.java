package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_55_Lisas_Workbook
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number of Chapter  ?   ? ");
		int chapter=sc.nextInt();
		System.out.println("Enter Number of problem per/page ?  ?  ");
		int problem=sc.nextInt();
		
		int spacialProblem=0;
		int numberOFPages=0;
		for(int i=0;i<chapter;i++)
		{
			System.out.println("Enter Number of problem in chapter ?  ? ");
			int chapterProblem=sc.nextInt();
			int pgnumber=numberOFPages+1;
			for(int j=1;j<=chapterProblem;j++)
			{
				if(j==pgnumber)
					spacialProblem++;
				if(j%problem==0 && j<chapterProblem)
				{
					pgnumber++;
				}
			}
			numberOFPages=pgnumber;	
		}
		System.out.println(spacialProblem);	
	}
}

/*
Enter Any Number of Chapter  ?   ? 
5
Enter Number of problem per/page ?  ?  
3
Enter Number of problem in chapter ?  ? 
4
Enter Number of problem in chapter ?  ? 
2
Enter Number of problem in chapter ?  ? 
6
Enter Number of problem in chapter ?  ? 
1
Enter Number of problem in chapter ?  ? 
10
4
*/