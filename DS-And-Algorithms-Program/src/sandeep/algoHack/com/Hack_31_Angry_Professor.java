package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_31_Angry_Professor
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test cases ?   ?     ?   ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter Any Number ?   ?  ?  ");
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int ii=0;ii<arr.length;ii++)
			{
				arr[ii]=sc.nextInt();
			}
			System.out.println("Enter K threshold ?  ?  ");
			int k=sc.nextInt();
			angry(arr,k);
		}
	}
	private static void angry(int[] arr, int k)
	{
		int count=0;
		int countless=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=0)
			{
				countless++;
			}
			else
			{
				count++;
			}
		}
		if(countless==k)  //class is canceled
			System.out.println("NO");
		if(count<k)
			System.out.println("YES");	
	}
}
/*
Enter Any Test cases ?   ?     ?   
2
Enter Any Number ?   ?  ?  
4
-1
-3
4
2
Enter K threshold ?  ?  
3
YES
Enter Any Number ?   ?  ?  
4
0
-1
2
1
Enter K threshold ?  ?  
2
NO
*/