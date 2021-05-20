package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_25_Cats_and_a_Mouse
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases ?  ?   ?   ");
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
			System.out.println("Enter Cat A position ?  ?  ");
			int Cat_A=sc.nextInt();
			System.out.println("Enter Cat B position  ?  ? ");
			int Cat_B=sc.nextInt();
			System.out.println("Enter Mouse C position ?   ? ");
			int Mouse_C=sc.nextInt();
			catMouse(Cat_A,Cat_B,Mouse_C);
		}	
	}
	private static  void catMouse(int cat_A, int cat_B, int mouse_C)
	{
		int res_1=Math.abs(cat_A-mouse_C);
		int res_2=Math.abs(cat_B-mouse_C);
		if(res_1>res_2)
		{
			System.out.println("Cat B");
		}
		else if(res_1<res_2)
		{
			System.out.println("Cat A");
		}
		else
		{
			System.out.println("Mouse C");
		}
	}
}
/*
Enter Any Test Cases ?  ?   ?   
2
Enter Cat A position ?  ?  
1
Enter Cat B position  ?  ? 
2
Enter Mouse C position ?   ? 
3
Cat B
Enter Cat A position ?  ?  
1
Enter Cat B position  ?  ? 
3
Enter Mouse C position ?   ? 
2
Mouse C
*/
