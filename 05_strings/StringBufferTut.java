public class StringBufferTut {
	public static void main(String[] args) {
		/*
			Java String Buffer is used to create mutable string
			memory allocated to a string is not fixed, it can change
			it is Synchronous in nature (Thread sage)

			So you can change the SAME STRING accessed by many threads.

			Synchronous means that ONLY ONE thread can access
			that string and modify it at any given point in time.

			StringBuffer data type allows many action not possible in String
			StringBuffer's methods were written as synchronized to make them THREAD SAFE
		*/

		StringBuffer sb = new StringBuffer("Questa è una stringa.");
		System.out.println(sb);

		System.out.println( sb.append(" append() applied. ") );
		//inserts into stringBuffer without deleting anything
		System.out.println( sb.insert(38, " modifica applied.") );
	
		System.out.println( sb.replace(0,2,"QUE") + " - replace() ");
		System.out.println( sb.delete(39, sb.length() ) + " - delete()");
		System.out.println( sb.reverse() + " - reverse()");
		System.out.println( "StringBuffer length: " + sb.length());
		System.out.println( sb.capacity() + " - capacity()");
		System.out.println( " capacity = 16 + sb.length() ");
		System.out.println( sb.reverse() );
		System.out.println("+ Empty stringbuffer contains default 16 chars (32 Bytes)");

		
		System.out.println("StringBuilder can be accessed by single thread at a time, faster than StringBuffer."
							+ "\n StringBuffer can be accessed by multiple threads at a time, slower than StringBuilder.");
	}
}