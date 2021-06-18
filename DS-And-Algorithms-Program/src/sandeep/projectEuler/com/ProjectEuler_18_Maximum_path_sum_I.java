/*
 A step–by–step look at this algorithm
Initial array           After the first 
                           iteration
      3                        3
     7 5                      7 5
    2 4 6                   10 13 15
   8 5 9 3
   */
//Starting at the bottom, take the first pair, 8 and 5, pick the maximum and replace the 2 in the previous row with their sum 8+2=10.

//Take the next pair, 5 and 9, pick the maximum and replace the 4 in the previous row with their sum 9+4=13.

//Finally, take the last pair, 9 and 3, pick the maximum and replace the 6 in the previous row with their sum 9+6=15.

//If you think about it, we simply solved the maximum path from the last row to the second to last row by considering each
// sub–problem for the following three triangles.
// Starting at the bottom, take the first pair, 8 and 5, pick the maximum and replace the 2 in the previous row with
//  their sum 8+2=10.
//Take the next pair, 5 and 9, pick the maximum and replace the 4 in the previous row with their sum 9+4=13.

//Finally, take the last pair, 9 and 3, pick the maximum and replace the 6 in the previous row with their sum 9+6=15.

//If you think about it, we simply solved the maximum path from the last row to the second to last row by considering each
// sub–problem for the following three triangles.

//   2      4      6
//  8 5    5 9    9 3
//Keep that in mind and let’s do it again with our new array.

//Take the larger of 10 and 13 and add it to 7 making 13+7=20.
//Take the larger of 13 and 15 and add it to 5 making 15+5=20.
//Now our array looks like:

//  3
//20 20
//At last we take the larger of 20 and 20 (yes, I know they’re the same) and add it to 3 making 20+2=23.
//And our array looks like:

//23
 
package sandeep.projectEuler.com;
import java.util.Scanner;
public class ProjectEuler_18_Maximum_path_sum_I 
{
	public static void main(String[] args)
	{
	
		int triangle[][]= {{75},
				{95,64},
				{17,47,82},
				{18,35,87,10},
				{20,04,82,47,65},
				{19,01,23,75,03,34},
				{88,02,77,73,07,63,67},
				{99,65,04,28,06,16,70,92},
				{41,41,26,56,83,40,80,70,33},
				{41,48,72,33,47,32,37,16,94,29},
				{53,71,44,65,25,43,91,52,97,51,14},
				{70,11,33,28,77,73,17,78,39,68,17,57},
				{91,71,52,38,17,14,91,43,58,50,27,29,48},
				{63,66,04,68,89,53,67,30,73,16,69,87,40,31},
				{04,62,98,27,23,9,70,98,73,93,38,53,60,04,23}};
		
		
		 for (int i = triangle.length - 2; i >= 0; i--) 
		 {
			   for (int j = 0; j < triangle[i].length; j++)
			   {
			    triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);  // Dynamic programming
			   }
		 }
		System.out.println(Integer.toString(triangle[0][0]));	
	}				
}
/*
1074
*/