package sandeep.codechef.com;
import java.util.Scanner;
public class CodeChef_2_Add_Two_Nmber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases ?  ? ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter First number ??  ");
			int num1=sc.nextInt();
			System.out.println("Enter Second Number  ?  ? ");
			int num2=sc.nextInt();
			int res=a(num1,num2);
			System.out.println(res);
		}
		
	}

	private static int a(int num1, int num2) {
		
		return (num1+num2);
	}
}
/*
Enter Any Test Cases ?  ? 
2
Enter First number ??  
100
Enter Second Number  ?  ? 
23
123
Enter First number ??  
45
Enter Second Number  ?  ? 
5
50
*/