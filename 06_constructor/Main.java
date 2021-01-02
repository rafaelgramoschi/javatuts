public class Main {
	public static void main(String[] args) {
		//when we create a new object, the constructor of that class gets
		//invoked with the keyword "new"
		Objecto myObj = new Objecto();
		//from this print, we can see that the constructor initializes the classVar
		System.out.println("Default Constructor: " + myObj.classVar);
		Objecto myObj2 = new Objecto(2);
		System.out.println("Parameterized Constructor: " + myObj2.classVar);
	}
}

class Objecto {

	/*
		Constructor is used in the creation of an object
		It is the blcok of code to initialize an object
		
		! ! !   I M P O R T A N T   ! ! ! 
		Constructor must have the same name as the class it is in
		
		It doesn't have any return type

		Constructor gets executed when an object of a class is being created

		Constructors are of two types:
			- DEFAULT
			- PARAMETERIZED 
	*/

	int classVar;
	//constructor
	//can be used as initialization of variables for same objects
	//Constructor MUST HAVE the SAME NAME AS the CLASS it is in
	Objecto(){
		classVar = 100;
	}

	//this is a parameterized constructor, because it accepts parameters to be passed
	//by writing this we're doing a constructor overloading too (like method overloading)
	Objecto(int val){
		classVar = val;
	}
}