package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_44_Jumping_on_the_Clouds
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length  ?  ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		JumpingontheClouds(arr);
	}
	private static void JumpingontheClouds(int[] arr)
	{
		/*
		 int count=0;
       
         for(int i=0;i<c.length-1;i++)
         {
             if((arr[i]==0 && arr[i]!=1)) 
               {
                 numOFJumbCount++;
                 }
         }
          return numOFJumbCount;
		 */
		int count=-1;
		for(int i=0;i<arr.length;)
		{
			if(i+2<arr.length&&arr[i]==0)
			{
				i=i+2;
			}
			else
			{
				i=i+1;
			}
			count++;
		}
		System.out.println(count);	
	}
}
/*
Enter Any Array Length  ?  ? 
7
0
0
1
0
0
1
0
4
*/
/*
Enter Any Array Length  ?  ? 
6
0
0
0
0
1
0
3
*/
/*
Enter Any Array Length  ?  ? 
7
0
1
0
0
0
1
0
3
*/