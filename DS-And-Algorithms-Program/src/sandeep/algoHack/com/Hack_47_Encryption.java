package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_47_Encryption 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Any Sentence ?  ?");
	String str=sc.nextLine();
	String result=encrepto(str);
	System.out.print(result);	
	}
	private static String encrepto(String str)
	{
		String res="";
		int lower=0;
		int upper=0;
		String strWithoutSpace=str.replaceAll(" ", "");
		int L=strWithoutSpace.length();
		double sqr=Math.sqrt(L);
		
		lower=(int)sqr; //lower bound
        upper=lower;    //upper bound

        if(lower*upper<L)
           upper=upper+1; 
        char st[]=str.toCharArray();
        for(int i=0;i<upper;i++)
        {
            for(int j=i;j<L;j=j+upper)
             res=res+st[j];
             res=res+' ';
        }
        return res;	
	}
}
