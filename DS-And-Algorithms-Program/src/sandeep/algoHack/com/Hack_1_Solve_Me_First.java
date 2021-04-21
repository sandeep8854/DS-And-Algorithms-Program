package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_1_Solve_Me_First 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Any Number ?  ? ");
		int a=sc.nextInt();
		System.out.println("Enter  second Any Number  ?   ?");
		int b=sc.nextInt();
		int res=add(a,b);
		System.out.println(res);	
	}
	private static int add(int a, int b)
	{
		return a+b;	
	}
}
