package sandeep.leetcode.com;
import java.util.Scanner;
public class Leetcode_2_Reverse_Number
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ?   ?  ");
		int num=sc.nextInt();
		int result=reverse(num);
		System.out.println(result);
		/*
		 Given a signed 32-bit integer x, return x with its digits reversed. 
		 If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

         Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
          */

	}
	private static int reverse(int x) 
	{

        if(x==0)
            return 0;
        long res=0;
        while(x!=0)
        {
            res=res*10+x%10;
            if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE)
                return 0;
            x=x/10;
        }
        return (int)res;	
	}
}

/*
Enter Any Number  ?   ?  
120
21
Enter Any Number  ?   ?  
123
321
Enter Any Number  ?   ?  
-123
-321
Enter Any Number  ?   ?  
0
0
*/
