package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_5Diagonal_Difference
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?   ? ");
		int N=sc.nextInt();
		int d1=0;
		int d2=0;
		
		int arr[][]=new int[N][N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				arr[i][j]=sc.nextInt();
				if(arr[i][j]>=-100 && arr[i][j]<=100)
				{
					if(i==j) {
						d1=d1+arr[i][j];
					}
					if(i==N-j-1)
					{
						d2=d2+arr[i][j];
					}
					
				/*	if(i==j)
					{
						sum=sum-arr[i][j];
					}
					if((i+j)==N-1)
					{
						sum=sum+arr[i][j];
					}*/
				}
			}
		}
		System.out.println(Math.abs(d1-d2));	
	}
}
/*
Enter Any Number ?   ? 
3
11
2
4
4
5
6
10
8
-12
15
*/
/*
Enter Any Number ?   ? 
3
11
2
4
4
5
6
10
8
-12
15
*/