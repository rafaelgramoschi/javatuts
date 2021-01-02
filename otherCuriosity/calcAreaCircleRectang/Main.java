public class Main {
	public static void main(String[] args) {
		Area myForm = new Area();
		System.out.println( myForm.calcArea(2) );
	}
}

class Area {
	float calcArea(float r){
		//if one parameter is passed to the method, then, we calculate the circle's Area
		return r*r* (float) 3.14;
	}

	float calcArea(int b, int h){
		//if two parameters are passed, we calculate the rectangular's Area
		return b*h;
	}
}