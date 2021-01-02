/*
	Abstraction
		is a mechanism of hiding the implementation details from the user and only
		providing the functionlaity to the user.
		There are two ways to achieve abstraction in Java:
		Abstract class (0 to 100% abstraction)
		Interface (100% abstraction)
		
		Abstract method:
		is declared without an implementation [ abstract void myMethod(); ]

		Abstract class:
		is a class that is declared with abstract keyword
		may or may not have all abstract methods
		if it has one or more abstract methods, it must be declared as abstract
		is mostly used for inheritance
*/


//needs to be abstract since we are declaring an abstract method
public abstract class Main {

	abstract float area();

	public void displayArea(float area){
		System.out.println("Printing Area of Shape: " + area );
	}

	public static void main(String[] args){
		Main circle = new Circle();
		circle.displayArea( circle.area() );
	}
}

class Circle extends Main{
	
	@Override
	float area(){
		return 1.2f;
	}
}