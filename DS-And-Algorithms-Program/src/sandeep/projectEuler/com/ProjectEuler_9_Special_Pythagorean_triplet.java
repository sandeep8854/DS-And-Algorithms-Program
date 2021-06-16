package sandeep.projectEuler.com;
import java.util.Scanner;
public class ProjectEuler_9_Special_Pythagorean_triplet 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ?   ? ");
		int num=sc.nextInt();
		pythagoreanTriplet(num);
	//	System.out.println(res);
	}
	private static void pythagoreanTriplet(int num)
	{
		// triplet can be at-most n/3.	
		for(int i=1;i<=num/3;i++)
		{
			// The value of second element
            // must be less than equal to n/2
			for(int j=i+1;j<=num/2;j++)
			{
				int k=num-i-j;
				if(i*i+j*j==k*k)
				{
					System.out.println("a:=" +i+ ", b:=" +j+ ",c:=" +k);
					System.out.println(i*j*k);
					return;
				}
			}
		}	
	}
}
/*
Enter Any Number  ?   ? 
1000
a:=200, b:=375,c:=425
31875000
*/