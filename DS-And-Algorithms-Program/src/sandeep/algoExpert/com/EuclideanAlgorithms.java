package sandeep.algoExpert.com;
import java.util.Scanner;
public class EuclideanAlgorithms 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number  ?   ?   ");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number  ?   ?  ");
		int num2=sc.nextInt();
		
		int res=gcdMltiplicationOfCommonFactor(num1,num2);
		System.out.println(res);
	}
	private static int gcdMltiplicationOfCommonFactor(int a, int b) 
	{
		if(a==0)
			return b;
		return gcdMltiplicationOfCommonFactor(b%a,a);
	}
}

//Time Complexity: O(Log min(a, b)) 
/*
 Explanations:=
 a=36
 b=60
 call gcd   36)60(1
               36
            -------
               24 - -reminder
            -------
            Now a=24
            and b=36
            
    Next Call gcd   24)36(1
                       24
                    --------
                       12--- reminder 
                    --------        
                    
                    Now a=12
                        b=24
                        
     Next Call gcd    12)24(2
                         24
                       ------
                         0-----reminder
                       -----           
                    Now a=0 become 
                        b=12
                        
                     check condition 
                     if(a==0)
                        return b
                        
                        now b is 12
                        
                        Finally Your Answer is 12;
                  
 
*/