/**

	super.method() invokes the method of a parent
	super() invokes the parent's constructor

*/

class Vehicle {
	int maxSpeed = 100;
	Vehicle(){
		System.out.println("Vehicle constructor invoked!");
	}

	public void whatsUp(){
		System.out.println("(Vehicle) What's Up method called");
	}
}

class Car extends Vehicle {

	int maxSpeed = 200;

	Car(){
		super(); //this invokes the parent's method!!! (Vehicle)
		super.whatsUp();
		System.out.println("Car constructor invoked!");
	}
}

public class SuperCall {
	public static void main(String[] args) {
		Car newCar = new Car();
	}
}