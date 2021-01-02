public class Main {
	public static void main(String[] args){
		//Arrays store multiple elements of the same data type
		//Array's size and type are fixed, can't be changed

		//There are 2 ways of declaring an array:
		//new, specify size only
		int[] a = new int[5];
		a[0] = 10; //first element in the array will be 10

		//array initialization
		int[] b = {1,2,3,4,5};
		System.out.println("B[2] is "+b[2]);
		//OR
		int[] c = new int[] {1,2,3,4,5};

		//print length
		System.out.println("Array C length: "+c.length);

		//Multi-dimensional Array:
		int[][] m = new int[5][5];
		m[0][0] = 100; //first item in matrix will be 100
		System.out.println("Value of m[0][0] is "+m[0][0]);

		//memory allocation of array
		//int[] a = new int[5]; int is 4 Bytes, so 5*4 = 20BYTES

		//int [][] a = new int[5][5]; 5*5*4 = 100BYTES

	}
}
