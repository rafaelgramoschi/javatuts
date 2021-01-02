public class Main {

	/*

		this is used as reference variable to CURRENT object

		this can be passed as an argument in the constructor call.
		this can be passed as an argument in the method call.
		this can be used to invoke current class method.
		this() can be used to invoke current class constructor.

	*/


	public static void main(String[] args) {
		Person me = new Person("Rafael");
		Person you = new Person("You");
		Person noname = new Person();
	}
}

class Person {
	
	String name;
	Person(){
		this(" NoNameSelected "); //this() calls the constructor of its class
	}

	Person(String n){
		//if local and instance variable are different, there is no need of "this"
		this.name = n;
		printHello(this);
	}

	void printHello(Person p){
		System.out.println("Hello, "+ p.name +"!");
	}
}