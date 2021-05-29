package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_36_Sequence_Equation
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
		int re[]=sequenceequation(arr);	
		for(int i=0;i<re.length;i++) {
		System.out.println(re[i] + " ");
		}
	}
	private static int[] sequenceequation(int[] p) 
	{
		int len=p.length;
        int inum=0;
        int result[]=new int[len];
        for(int i=1;i<=len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(p[j]==i)
                {
                inum=j+1;
                break;
                }
            }
            for(int j=0;j<len;j++)
            {
                if(p[j]==inum)
                {
                    inum=j+1;
                    break;
                }
            }
            result[i-1]=inum;
        }
        return result;	
	}
}
/*
Enter Any Array Length ?  ? 
3
2
3
1
2 
3 
1 
*/
/*
Enter Any Array Length ?  ? 
5
4
3
5
1
2
1 
3 
5 
4 
2 
*/