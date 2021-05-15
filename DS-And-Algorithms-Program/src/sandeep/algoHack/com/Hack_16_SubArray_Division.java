package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_16_SubArray_Division
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?   ?  ");
		int len=sc.nextInt();
		int arr1[]=new int[len];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter The Sandeep Birth Day ?   ? ");
		int d=sc.nextInt();
		System.out.println("Enter the Sandeep Birth Month  ?  ? ");
		int m=sc.nextInt();
		
		subarrayDivision(arr1,d,m);	
	}
	private static void subarrayDivision(int[] arr1, int d, int m)
	{
		int count=0;
		for(int i=0;i<arr1.length;i++)
		{
			int c=0;
			for(int j=0;j<m;j++)
			{
				if(i+j<arr1.length)
				{
					c=c+arr1[i+j];
				}
			}
			if(c==d)
			{
				count++;
			}
		}
		System.out.println(count);	
	}
}
/*
 Enter Any Array Length ?   ?  
5
1
2
1
3
2
Enter The Sandeep Birth Day ?   ? 
3
Enter the Sandeep Birth Month  ?  ? 
2
2
*/
/*
Enter Any Array Length ?   ?  
6
1
1
1
1
1
1
Enter The Sandeep Birth Day ?   ? 
3
Enter the Sandeep Birth Month  ?  ? 
2
0
*/