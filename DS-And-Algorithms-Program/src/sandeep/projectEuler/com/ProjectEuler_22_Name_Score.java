package sandeep.projectEuler.com;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
public class ProjectEuler_22_Name_Score
{
	private static long getNameValue (String name)
	{

		long total = 0;

		for (int loop = 0; loop < name.length (); loop++)
			total += (int) name.charAt (loop) - 64;

		return total;

	}

	public static void main (String args []) throws IOException
	{
		 File fi = new File("C:\\Users\\sandeep");
		 BufferedReader br = new BufferedReader(new FileReader(fi));

		//FileInput fi = new FileInput ("Desktop");
		 String nameList[];
		 nameList=br.readLine().replaceAll("\"", "").split(",");

	//	String [] nameList = br.replaceAll ("\"", "").split (",");
		Arrays.sort (nameList);

		long total = 0;

		for (int loop = 0; loop < nameList.length; loop++)
		{

			total += getNameValue (nameList [loop]) * (loop + 1);

		}

		System.out.println ("Total value: " + total);

	}

}
