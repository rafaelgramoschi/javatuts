class Vehicle{
	Vehicle(){
		System.out.println("I am a vehicle instance.");
	}

	void run(){
		System.out.println("I do run.");
	}

}

class Car extends Vehicle {
	Car(){
		System.out.println("I am a Car instance");
	}
	//this overrides the super method run()
	//to override a parent method, you need to have the same declaration!
	//same number of arguments, same name and same return type
	@Override
	void run(){
		System.out.println("I have 4 wheels.");
	}
}

class Bike extends Vehicle {
	Bike(){
		System.out.println("I am a Bike instance");
	}

	@Override
	void run(){
		System.out.println("I have 2 wheels.");
	}
}

class SuperCar extends Car {
	SuperCar(){
		System.out.println("I am a SuperCar instance");
		this.run();
		this.turbo();
	}

/*
	subclasses can access parent's data/method
	but parent's classes, can't access child's data/methods
	(here, Vehicle can't access SuperCar.turbo() method )
*/
	void turbo(){
		System.out.println("I have Turbo.");
	}
}

public class OverrideAndInheritance {
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		Bike bike = new Bike();
		bike.run();
		SuperCar scar = new SuperCar();
	}
}