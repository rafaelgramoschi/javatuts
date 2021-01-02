public class Main {
	public static void main(String[] args){
		char[] cstr = {'R','a','f','a','e','l'};
		System.out.println(cstr);
		//by default there are array of character
		//Java has String data type, so you don't have to mess with
		//array of chars, it's less harder
		String stra = " stringa A ";
		System.out.println(stra);

		String strb = " stringa B ";
		System.out.println(strb);

		String c = new String();
		//concateniamo due stringhe
		System.out.println("concateniamo A e B: "+stra.concat(strb));
		//Strings in Java are immutables, meaning that if we try to
		//change its value, it will create a new object, instead of
		//changing the value of the variable

		/*
			Strings are immutable because of:
			Security: strings are used for network database connection.
			To avoid the access from external users, strings are immutable

			Synchronization: immutability of strings automatically makes
			system thread safe to solve the synchronization problem

			Caching: If two string objects are having the same value,
			and you need only one string, then the two objects will point
			to the same memory location pointing same String object
		*/

		/*	MEMORY ALLOCATION
			Reference to the String (variable name) is stored in the STACK area.
			Strings value (content) are stored in the HEAP area.

			STACK
			HEAP
			DATA SECTION
			CODE SECTION

			STRINGS POOL:
			strings pool are stored in the heap (insieme di stringhe/gruppo di stringhe)
			references (variable name) of those strings are stored in the stack

		*/
		//per questi motivi, anche se prima abbiamo concatenato stra+strb
		//se stampiamo stra, rimarrà del valore iniziale (immutato)
		System.out.println(stra);
		//a meno che noi non modifichiamo in questo modo
		stra = stra.concat(strb);
		System.out.println(stra);

		//string operations
		System.out.println("Print string length: " + stra.length() );
		System.out.println("Take part of the string from position 2: " + stra.substring(2));
		String a = "One str";
		String b = "One str1";
		System.out.println("Return 0 if equal, else -1: "+ a.compareTo(b) );
		a = "";
		System.out.println("Return true if .isEmpty(): " + a.isEmpty());
		System.out.println( "UPPER CASE: " + b.toUpperCase() );
		System.out.println( "lower case: " + b.toLowerCase() );
		//String.valueOf(stringWithOnlyNumbers)
		//the following, it's error
		//System.out.println( "Value of 'One str1': " + b.valueOf() );
		System.out.println( "Value of '4': " + String.valueOf("4") );

		//replace error
		//System.out.println( "Replace '1' with '' in 'one str1': " String.replace('1','') );
		System.out.println("Replace '1' with '\\u0000' (null) in 'one str1': " + b.replace('1', '\u0000') );
		//String.contains("c") OR String.contains("Some thing")
		System.out.println("'One str1' contains() '1', true or false: " + b.contains("1") ); //return true or false
		//System.out.println("'One str1' contains() 'a', true or false: " + b.contains("a") ); //return true or false		
		System.out.println("b equals() a? true or false: " + b.equals(a) );

		System.out.println("charAt() Get char based on index 2: " + b.charAt(2) );
		//endsWith(char or string)
		System.out.println("endsWith('ciao') true or false: " + b.endsWith("ciao") );
	}
}
