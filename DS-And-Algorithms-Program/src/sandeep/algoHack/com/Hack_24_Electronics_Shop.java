package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_24_Electronics_Shop
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Budget to buyo the keyboard and USB drive ?  ?  ");
		int b=sc.nextInt();
		System.out.println("Enter Number of Keyboard model ?  ? ");
		int n=sc.nextInt();
		int keyboard[]=new int[n];
		for(int i=0;i<keyboard.length;i++)
		{
			keyboard[i]=sc.nextInt();
		}
		System.out.println("Enter number of USB drive Model ?   ?  ");
		int m=sc.nextInt();
		int USB[]=new int[m];
		for(int i=0;i<USB.length;i++)
		{
			USB[i]=sc.nextInt();
		}
		int result=electronicsShop(b,keyboard,USB);	
		System.out.println(result);
	}
	private static int electronicsShop(int b, int[] keyboard, int[] usb)
	{
		int sum=0;
		int maximum=0;
		for(int i=0;i<keyboard.length;i++)
		{
			for(int j=0;j<usb.length;j++)
			{
				sum=(keyboard[i]+usb[j]);
				if(sum>=maximum && sum<=b)
				{
					maximum=sum;
				}
		    }
		}
		if(maximum==0)
		{
			return -1;
		}
		return maximum;
	}
}
/*
Enter Budget to buyo the keyboard and USB drive ?  ?  
10
Enter Number of Keyboard model ?  ? 
2
3
1
Enter number of USB drive Model ?   ?  
3
5
2
8
9
*/
/*
Enter Budget to buyo the keyboard and USB drive ?  ?  
5
Enter Number of Keyboard model ?  ? 
1
4
Enter number of USB drive Model ?   ?  
1
5
-1
*/
