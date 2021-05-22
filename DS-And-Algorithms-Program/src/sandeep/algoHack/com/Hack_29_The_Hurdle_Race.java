package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_29_The_Hurdle_Race 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Length of height of each hurdles");
		int n=sc.nextInt();
		int hurdles[]=new int[n];
		for(int i=0;i<hurdles.length;i++)
		{
			hurdles[i]=sc.nextInt();
		}
		System.out.println("Enter the  height of character can jump naturally");
		int k=sc.nextInt();
		race(hurdles,k);	
	}
	private static void race(int[] hurdles, int k)
	{
		int max=0;
		for(int i=0;i<hurdles.length;i++)
		{
			int temp=hurdles[i];
			max=Math.max(max, temp);
		}
		System.out.println(Math.max(0, max-k));
	}
		
}
/*
  int max=0;
         for(int i=0;i<height.size();i++)
         {
             int temp=height.get(i);
             max=Math.max(max, temp);
         }
         return (Math.max(0, max-k));
 */
/*
Enter The Length of height of each hurdles
5
1
6
3
5
2
Enter the  height of character can jump naturally
4
2
*/
/*
Enter The Length of height of each hurdles
5
2
5
4
5
2
Enter the  height of character can jump naturally
7
0
 */