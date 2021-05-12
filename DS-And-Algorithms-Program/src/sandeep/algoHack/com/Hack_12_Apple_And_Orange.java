package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_12_Apple_And_Orange
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Starting point the value of house ?  ? ");
		int s=sc.nextInt();
		System.out.println("Enter The Ending point the value of house  ?  ? ");
		int t=sc.nextInt();
		System.out.println("Enter Location of Apple Tree ?  ? ");
		int a=sc.nextInt();
		System.out.println("Enter The Location Of Orange Tree ?   ? ");
		int b=sc.nextInt();
		System.out.println("Enter M value length (Actuall it is Array ) ?  ? ");
		int m=sc.nextInt();
		System.out.println("Enter N value length (Actually its Array ?  ? ");
		int n=sc.nextInt();
		
		System.out.println("Enter M Array ?  ? ");
		int apple[]=new int[m];
		for(int i=0;i<m;i++)
		{
			apple[i]=sc.nextInt();
		}
		
		System.out.println("Enter N Array ?   ? ");
		int orange[]=new int[n];
		for(int i=0;i<n;i++)
		{
			orange[i]=sc.nextInt();
		}
		appleOrange(s,t,a,b,m,n,apple,orange);
	}
	private static void appleOrange(int s, int t, int a, int b, int m, int n, int[] apple, int[] orange) 
	{
		int appleCount=0;
		int orangeCount=0;
		for(int i=0;i<m;i++)
		{
			if(a+apple[i]>=s&&a+orange[i]<=t)
			{
				appleCount++;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(b+orange[i]>=s&&b+orange[i]<=t)
			{
				orangeCount++;
			}
		}
		System.out.println(appleCount);
		System.out.println(orangeCount);
	}
}

/*
First Test Case---------<<>>>>><<<>><<<??<<>>><??<<?<
Enter The Starting point the value of house ?  ? 
7
Enter The Ending point the value of house  ?  ? 
10
Enter Location of Apple Tree ?  ? 
4
Enter The Location Of Orange Tree ?   ? 
12
Enter M value length (Actuall it is Array ) ?  ? 
3
Enter N value length (Actually its Array ?  ? 
3
Enter M Array ?  ? 
2
3
-4
Enter N Array ?   ? 
3
-2
-4
1
2
Second Test Case <>> <<< >> << > << >? << ?> <?? <> ?
/*
Enter The Starting point the value of house ?  ? 
7
Enter The Ending point the value of house  ?  ? 
11
Enter Location of Apple Tree ?  ? 
5
Enter The Location Of Orange Tree ?   ? 
15
Enter M value length (Actuall it is Array ) ?  ? 
3
Enter N value length (Actually its Array ?  ? 
2
Enter M Array ?  ? 
-2
2
1
Enter N Array ?   ? 
5
-6
1
1
*/


