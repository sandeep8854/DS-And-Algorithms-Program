package sandeep.projectEuler.com;
import java.util.Scanner;
public class ProjectEuler_15_Lattice_paths
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ?   ?  ");
		int number=sc.nextInt();
		long res=latticsPath(number);
		System.out.println(res);
	}
	private static long latticsPath(int number)
	{
		long result=1;
		for(int i=1;i<=number;i++)
		{
			result=result*(number+i)/i;
		}
		return result;
	}
}
/*
Enter Any Number  ?   ?  
20
137846528820
*/