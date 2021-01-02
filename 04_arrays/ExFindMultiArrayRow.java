/* exercise: find row length inside a multi-dimensional array */

public class ExFindMultiArrayRow {
	public static void main(String[] args){
		//size 3*2 (3 rows, 2 columns)
		int[][] m = {
			{1,2},
			{3,4},
			{5,6}
		};

		//here 0 refers to the array of position 0, which is [1,2]
		//inside multi-dimensional array "m" that we created.
		System.out.println("Row length: " + m[0].length );
	}
}
