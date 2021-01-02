public class StringBuilderTut {
	public static void main(String[] args) {
		/*
			STRING BUILDER are not synchronized. NOT THREAD SAFE
			BUT FASTER.
		*/
		StringBuilder sb = new StringBuilder("String Builder");
		System.out.println(sb);
		System.out.println("String builder has a capacity of 16chars (32 Bytes), even if empty");
		System.out.println("StringBuilder can be accessed by single thread at a time, faster than StringBuffer."
							+ "\n StringBuffer can be accessed by multiple threads at a time, slower than StringBuilder.");

		System.out.println(" delete(pos, pos) - insert(pos, string) - reverse() - append(string)");
		System.out.println("USE THIS WHEN YOU HAVE SINGLE THREAD APPLICATION.");


	}

}