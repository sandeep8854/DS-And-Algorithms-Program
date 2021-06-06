package sandeep.algoHack.com;
import java.util.Arrays;
import java.util.Scanner;

public class Hack_48_Bigger_is_Greater 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases ?   ? ");
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
			System.out.println("Enter Any String ?  ? ");
			String str=sc.next();
			System.out.println(bigger(str));
		}
	}
	private static String bigger(String str)
	{
		char charnewArr[]=str.toCharArray();
        int n=charnewArr.length;
        int i=0;
        for(i=n-1;i>0;i--)
        {
        	if(charnewArr[i]>charnewArr[i-1])
        	{
        		break;
        	}
        }
        if(i==0)
        {
        	return "no answer";
        }
        else
        {
        	int small=charnewArr[i-1];
            int next=i;
            for(int j=i+1;j<n;j++)
            {
                if(charnewArr[j]>small && charnewArr[j]<charnewArr[next])
                {
                    next=j;
                }
            }
            swap(charnewArr,i-1,next);
            Arrays.sort(charnewArr,i,n);
        }
        return new String(charnewArr);
	}
	private static void swap(char[] charArr, int i, int j) 
	{
		 char temp = charArr[i];
         charArr[i] = charArr[j];
         charArr[j] = temp;  	
	}
}
/*
Enter Any Test Cases ?   ? 
11
Enter Any String ?  ? 
ab
ba
Enter Any String ?  ? 
bb
no answer
Enter Any String ?  ? 
hefg
hegf
Enter Any String ?  ? 
dhck
dhkc
Enter Any String ?  ? 
dkhc
hcdk
Enter Any String ?  ? 
lmno
lmon
Enter Any String ?  ? 
dcba
no answer
Enter Any String ?  ? 
dcbb
no answer
Enter Any String ?  ? 
abdc
*/