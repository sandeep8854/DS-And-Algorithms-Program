package sandeep.algoHack.com;

import java.util.Scanner;

public class Hack_52_The_Time_In_Words
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any test Cases ? ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		System.out.println("Enter Any Hours  ?  ?   ");
		int h=sc.nextInt();
		System.out.println("Enter Any Minutes  ?   ?  ");
		int m=sc.nextInt();
		timewords(h,m);
		}
	}
	private static void timewords(int h, int m) 
	{
		String word[]= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fouteen"
				,"fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four",
						"twenty five","twenty six","twenty seven","twenty eight","twenty nine"};
		String time="";
		if(m==0)
		{
			time=word[h]+ " o'clock";
		}
		else if(m==15)
		{
			time="quater past " + word[h];
		}
	    else if(m==30)
	    {
	    	time="half past "+word[h];
	    }
	    else if(m==45)
	    {
	    	time="quarter to " +word[h+1];
	    }
	    else if(m==1)
	    {
	    	time=word[m]+ " minutes past "+word[h];
	    }
	    else if(m<30)
	    {
	    	time=word[m]+ " minutes past "+word[h];
	    }
	    else
	    {
	    	time=word[60-m] + " minutes to " +word[h];
	    }
			System.out.println(time);		
	}
}

/*
Enter Any test Cases ? 
9
Enter Any Hours  ?  ?   
5
Enter Any Minutes  ?   ?  
0
five o'clock
Enter Any Hours  ?  ?   
5
Enter Any Minutes  ?   ?  
01
one minutes past five
Enter Any Hours  ?  ?   
5
Enter Any Minutes  ?   ?  
10
ten minutes past five
Enter Any Hours  ?  ?   
5
Enter Any Minutes  ?   ?  
15
quater past five
Enter Any Hours  ?  ?   
5
Enter Any Minutes  ?   ?  
30
half past five
Enter Any Hours  ?  ?   
5
Enter Any Minutes  ?   ?  
40
twenty minutes to five
Enter Any Hours  ?  ?   
5
Enter Any Minutes  ?   ?  
45
quarter to six
Enter Any Hours  ?  ?   
5
Enter Any Minutes  ?   ?  
47
thirteen minutes to five
Enter Any Hours  ?  ?   
5
Enter Any Minutes  ?   ?  
29
twenty nine minutes past five
*/