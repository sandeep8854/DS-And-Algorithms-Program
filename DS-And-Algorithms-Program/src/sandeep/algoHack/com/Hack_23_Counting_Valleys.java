package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_23_Counting_Valleys
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of step on the hike ? ?   ");
		int step=sc.nextInt();
		System.out.println("Enter the String to descripting the path ? ?  ? ");
		String path=sc.next();
		
		int result=countingVallyes(step,path);
		System.out.println(result);
	}
	private static int countingVallyes(int step, String path)
	{
		int valleyCount=0;
		int altitude=0;
		for(int i=0;i<step;i++)
		{
			char ch=path.charAt(i);
			if(ch=='U')
			{
				altitude++;
				if(altitude==0)
				{
					valleyCount++;
				}
			}
			else
			{
				altitude--;
			}
		}
		return valleyCount;
	}
}
/*
Number of step on the hike ? ?   
8
Enter the String to descripting the path ? ?  ? 
UDDDUDUU
1
*/
/*
Number of step on the hike ? ?   
11
Enter the String to descripting the path ? ?  ? 
DUDDUUUUDDD
2
*/
/*
Number of step on the hike ? ?   
10
Enter the String to descripting the path ? ?  ? 
DUDDDUUDUU
2
*/