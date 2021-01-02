public class ConstructorChaining {
	public static void main(String[] args) {
		/*

		it is the process of calling a constructor from another constructor 
		with respect to the current object

		the purpose is to pass parameters through different constructors,
		but the initialization should be done at a single place

		can be done from the same class, or from base class

		CONSTRUCTOR CHAINING OCCURS THROUGH INHERITANCE

		*/
	}


}

class Calculator(){
	
	int varA, varB;

	Calculator(){
		//simple costructor

		//i can invoke another constructor
		this(0, 0); //i pass 2 parameters, so it will call the constructor with 2 arguments
	}

	Calculator(int a){
		this(a, 0);
	}

	Calculator(int a, int b){
		varA = a;
		varB = b;
	}
}