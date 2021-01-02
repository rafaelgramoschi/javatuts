public class Main{
	public static void main(String[] args) {
		//CALL BY VALUE
		/*
			when you pass arguments to a method
			but you only pass their value, so changes
			inside that method, won't affect the variable outside
		*/
		
		//METHOD OVERLOADING
		/*
			you can define the same method (same name)
			with different number of arguments, different returns

			e.g.:

			public String add(String a, String b){}
			public int add(int a, int b){}
		*/
			Main myObj = new Main();
			myObj.add("12","34");
			myObj.add(12,34);
			myObj.add(1,2,3);
	}

	public String add(String a, String b){
		System.out.println(a+b);
		return a+b;
	}

	public int add(int a, int b){
		System.out.println(a+b);
		return a+b;
	}

	public int add(int a, int b, int c){
		System.out.println(a+b+c);
		return a+b+c;
	}
}