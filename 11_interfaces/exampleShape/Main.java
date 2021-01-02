public class Main{}

interface Shape{
	abstract void Area();
}

class Circle implements Shape{
	public void Area(double r){
		System.out.println("The area of the Circle is: " + (r*r*3.14) );
	}
}

class Rectangule implements Shape{
	public void Area(int b, int h){
		System.out.println("The area of the Rectangule is: " + (b*h) );
	}
}