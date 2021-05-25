package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_33_Viral_Advertising
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?  ? ");
		int n=sc.nextInt();
		viralAdvertising(n);	
	}
	private static void viralAdvertising(int n)
	{
		int like=0;
		int share=5;
		int likeCount=0;
		for(int i=n;i>=1;i--)
		{
			like=share/2;
			likeCount=likeCount+like;
			share=like*3;
		}
		System.out.println(likeCount);
	}
}
/* 
Enter Any Number ?  ? 
5
24
*/
/*
Enter Any Number ?  ? 
4
15
*/
/*
Enter Any Number ?  ? 
3
9
*/