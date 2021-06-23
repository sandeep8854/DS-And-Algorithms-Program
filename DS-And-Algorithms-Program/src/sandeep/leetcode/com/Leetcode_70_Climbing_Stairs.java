package sandeep.leetcode.com;
import java.util.Scanner;
public class Leetcode_70_Climbing_Stairs 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases ?  ? ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		System.out.println("Enter Any Number ? ? ");
		int number=sc.nextInt();
		int res=climbing(number);
		System.out.println(res);
		}
	}
	private static int climbing(int number)
	{
		if(number==0||number==1)
			return 1;
		
		return climbing(number-1)+climbing(number-2);
	}

}

/*
Enter Any Test Cases ?  ? 
5
Enter Any Number ? ? 
1
1
Enter Any Number ? ? 
2
2
Enter Any Number ? ? 
3
3
Enter Any Number ? ? 
4
5
Enter Any Number ? ? 
5
8
*/