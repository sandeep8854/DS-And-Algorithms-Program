package sandeep.algoHack.com;

import java.util.Scanner;

public class Hack_37_Jumping_on_the_Clouds_Revisited
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?  ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Length of one Jump ?  ?   ");
		int k=sc.nextInt(); 
		int res=jumping(arr,k);
		System.out.println(res);
	}
	private static int jumping(int[] arr, int k) 
	{
		
		
		int energy=100;
		int currentCloud=0;
		do
		{
			currentCloud=(currentCloud+k)%arr.length;
			energy--;
			if(arr[currentCloud]==1)
			{
				energy-=2;
			}
		}while(currentCloud!=0);
		return energy;

	}
}
/*
Enter Any Array Length ?  ? 
8
0
0
1
0
0
1
1
0
Enter Length of one Jump ?  ?   
2
92
*/
/*
Enter Any Array Length ?  ? 
10
1
1
1
0
1
1
0
0
0
0
Enter Length of one Jump ?  ?   
3
80
*/