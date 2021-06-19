package sandeep.projectEuler.com;

public class ProjectEuler_24_Lexicographic_permutations
{
	public static void main(String[] args)
	{
		String str="ABC";
		int n=str.length();
		permute(str,0,n-1);
	}
//s - starting index
//e - end index
	private static void permute(String str, int s, int e)
	{
		if(s==e)
			System.out.println(str);
		else
		{
			for(int i=s;i<=e;i++)
			{
				str=swap(str,s,i);
				permute(str,s+1,e);
				str=swap(str,s,i);
				
			}
		}
	}
	//i - position 1
	//j- position 2
	private static String swap(String st, int i, int j)
	{
		char temp;
		char[] charArray=st.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
	}
}
/*
ABC
ACB
BAC
BCA
CBA
CAB
*/