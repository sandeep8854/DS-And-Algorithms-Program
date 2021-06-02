package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_45_Equalize_the_Array 
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
		int res=EqualizetheArra(arr);
		System.out.println(res);
	}
	private static int EqualizetheArra(int[] arr) 
	 {
        int len=arr.length;
        int aux[]=new int[101];
        for(int i=0; i<len; i++ )
        {
            int index=arr[i];
            aux[index]++;
        }
        int maxFequCount=getMaxFreqCount(aux);
        return len-maxFequCount;

    } 
    private static int getMaxFreqCount(int[] aux)
    {
        int maxFequCount=Integer.MIN_VALUE;
        for(int fequCount:aux)
        {
            if(fequCount>maxFequCount)
            {
                maxFequCount=fequCount;
            }
        }
        return maxFequCount;
    }
}
/*
Enter Any Array Length  ?  ? 
5
3
3
2
1
3
2
*/